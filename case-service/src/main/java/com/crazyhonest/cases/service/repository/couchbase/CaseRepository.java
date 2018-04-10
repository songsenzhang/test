package com.crazyhonest.cases.service.repository.couchbase;

import static com.couchbase.client.java.query.Select.select;
import static com.couchbase.client.java.query.dsl.Expression.i;
import static com.couchbase.client.java.query.dsl.Expression.x;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.core.CouchbaseOperations;
import org.springframework.data.couchbase.repository.query.support.N1qlUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.couchbase.client.java.document.json.JsonArray;
import com.couchbase.client.java.query.N1qlQuery;
import com.couchbase.client.java.query.N1qlQueryResult;
import com.couchbase.client.java.query.Statement;
import com.couchbase.client.java.query.dsl.Expression;
import com.couchbase.client.java.query.dsl.Sort;
import com.couchbase.client.java.query.dsl.path.AsPath;
import com.couchbase.client.java.query.dsl.path.LimitPath;
import com.couchbase.client.java.query.dsl.path.WherePath;
import com.couchbase.client.java.view.Stale;
import com.couchbase.client.java.view.ViewQuery;
import com.crazyhonest.common.client.baseobjects.CaseObject;

@Service
public class CaseRepository {

	@Autowired
	CaseDocumentRepository repository;

	public Integer count(Integer type, Integer status) {
		Expression expression = getExpression(type, status);
		return getCountByQueryParam(expression);
	}

	public void delete(String id) {
		repository.delete(id);
	}

	public CaseObject find(String id) {
		return repository.findOne(id);
	}

	public List<CaseObject> find(Integer type, Integer status, Integer limit, Integer offset) {
		Expression expression = getExpression(type, status);
		CouchbaseOperations couchbaseOperations = repository.getCouchbaseOperations();
		WherePath selectFrom = N1qlUtils.createSelectFromForEntity(couchbaseOperations.getCouchbaseBucket().name());
		LimitPath limitPath = selectFrom.where(expression).orderBy(Sort.desc("`sort`"));
		Statement statement = limitPath;
		if (!StringUtils.isEmpty(limit) && !StringUtils.isEmpty(offset)) {
			statement = limitPath.limit(limit).offset(offset);
		}
		List<CaseObject> messages = couchbaseOperations.findByN1QL(N1qlQuery.simple(statement), CaseObject.class);
		return messages;
	}

	public List<CaseObject> getView(Integer type, Integer status, Integer limit, Integer offset) {
		String view = null;
		CouchbaseOperations couchbaseOperations = repository.getCouchbaseOperations();

		if (type != null || status != null) {
			if (type != null && status == null) {
				view = "search_type";
			} else if (status != null && type == null) {
				view = "search_status";
			} else {
				view = "search_type_status";
			}
		} else {
			view = "search_all";
		}

		ViewQuery viewQuery = ViewQuery.from(couchbaseOperations.getCouchbaseBucket().name(), view).stale(Stale.FALSE)
				.skip(offset).limit(limit);

		if (type != null || status != null) {
			if (type != null && status == null) {
				viewQuery.key(type);
			} else if (status != null && type == null) {
				viewQuery.key(status);
			} else {
				viewQuery.key(JsonArray.empty().add(type).add(status));
			}
		}

		List<CaseObject> findByView = couchbaseOperations.findByView(viewQuery, CaseObject.class);
		return findByView;
	}

	private Integer getCountByQueryParam(Expression expression) {
		CouchbaseOperations helper = repository.getCouchbaseOperations();
		AsPath prefix = select("count(*) as total").from(i("cases"));
		N1qlQueryResult result = helper.queryN1QL(N1qlQuery.simple(prefix.where(expression)));
		Integer total = result.allRows().get(0).value().getInt("total");
		return total;
	}

	private Expression getExpression(Integer type, Integer status) {
		Expression expression = Expression.x("1").eq(x("1"));
		if (type != null) {
			expression = expression.and(x("type")).eq(x(type));
		}
		// if (!StringUtils.isEmpty(deviceNumber)) {
		if (status != null) {
			expression = expression.and(x("status")).eq(x(status));
		}
		return expression;
	}

	public CaseObject save(CaseObject body) {
		return repository.save(body);
	}

	public CaseObject update(CaseObject body) {
		return repository.save(body);
	}

}
