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
import com.crazyhonest.common.client.baseobjects.UserObject;

@Service
public class UserRepository {

	@Autowired
	UserDocumentRepository repository;

	public Integer count(Integer type, Integer status) {
		Expression expression = getExpression(type, status);
		return getCountByQueryParam(expression);
	}

	public void delete(String id) {
		repository.delete(id);
	}

	public UserObject find(String id) {
		return repository.findOne(id);
	}

	public List<UserObject> find(Integer type, Integer status, Integer limit, Integer offset) {
		Expression expression = getExpression(type, status);
		CouchbaseOperations couchbaseOperations = repository.getCouchbaseOperations();
		WherePath selectFrom = N1qlUtils.createSelectFromForEntity(couchbaseOperations.getCouchbaseBucket().name());
		LimitPath limitPath = selectFrom.where(expression).orderBy(Sort.desc("`reg_time`"));
		Statement statement = limitPath;
		if (!StringUtils.isEmpty(limit) && !StringUtils.isEmpty(offset)) {
			statement = limitPath.limit(limit).offset(offset);
		}
		List<UserObject> messages = couchbaseOperations.findByN1QL(N1qlQuery.simple(statement), UserObject.class);
		return messages;
	}

	public List<UserObject> getView(Integer type, Integer status, Integer limit, Integer offset) {
		String view = null;
		CouchbaseOperations couchbaseOperations = repository.getCouchbaseOperations();

		view = "search_all";

		ViewQuery viewQuery = ViewQuery.from(couchbaseOperations.getCouchbaseBucket().name(), view).stale(Stale.FALSE)
				.skip(offset).limit(limit);

		List<UserObject> findByView = couchbaseOperations.findByView(viewQuery, UserObject.class);
		return findByView;
	}

	private Integer getCountByQueryParam(Expression expression) {
		CouchbaseOperations helper = repository.getCouchbaseOperations();
		AsPath prefix = select("count(*) as total").from(i("user"));
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

	public UserObject save(UserObject body) {
		return repository.save(body);
	}

	public UserObject update(UserObject body) {
		return repository.save(body);
	}

}
