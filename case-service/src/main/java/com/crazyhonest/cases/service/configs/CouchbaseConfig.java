package com.crazyhonest.cases.service.configs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.data.couchbase.repository.config.RepositoryOperationsMapping;

import com.couchbase.client.java.Bucket;
import com.crazyhonest.common.client.baseobjects.CaseObject;
import com.crazyhonest.common.client.baseobjects.GoodsObject;
import com.crazyhonest.common.client.baseobjects.UserObject;

/**
 *
 */
@Configuration
@ConfigurationProperties(prefix = "couchbase.cluster")
@EnableCouchbaseRepositories(basePackages = "com.crazyhonest.cases.service.repository.couchbase")
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

	private List<String> hosts = new ArrayList<>();

	@Value("${couchbase.cluster.bucket.default}")
	private String defaultBucket;

	@Value("${couchbase.cluster.password}")
	private String password;

	@Value("${couchbase.cluster.bucket.cases}")
	private String casesBucket;

	@Value("${couchbase.cluster.bucket.goods}")
	private String goodsBucket;

	@Value("${couchbase.cluster.bucket.users}")
	private String userBucket;

	@Bean
	public Bucket casesBucket() throws Exception {
		return this.couchbaseCluster().openBucket(this.casesBucket, "");
	}

	@Bean
	public CouchbaseTemplate casesTemplate() throws Exception {
		return createTemplate(casesBucket());
	}

	@Bean
	public Bucket goodsBucket() throws Exception {
		return this.couchbaseCluster().openBucket(this.goodsBucket, "");
	}

	@Bean
	public CouchbaseTemplate goodsTemplate() throws Exception {
		return createTemplate(goodsBucket());
	}

	@Bean
	public Bucket userBucket() throws Exception {
		return this.couchbaseCluster().openBucket(this.userBucket, "");
	}

	@Bean
	public CouchbaseTemplate userTemplate() throws Exception {
		return createTemplate(userBucket());
	}

	@Override
	public void configureRepositoryOperationsMapping(RepositoryOperationsMapping baseMapping) {
		try {
			baseMapping
					// Cases
					.mapEntity(CaseObject.class, casesTemplate())
					// Goods
					.mapEntity(GoodsObject.class, goodsTemplate())
					// User
					.mapEntity(UserObject.class, userTemplate())
			// ...
			;
		} catch (Exception e) {

		}
	}

	private CouchbaseTemplate createTemplate(Bucket bucket) throws Exception {
		CouchbaseTemplate template = new CouchbaseTemplate(couchbaseClusterInfo(), bucket, mappingCouchbaseConverter(),
				translationService());
		template.setDefaultConsistency(getDefaultConsistency());
		return template;
	}

	@Override
	protected List<String> getBootstrapHosts() {
		return getHosts();
	}

	@Override
	protected String getBucketName() {
		return this.defaultBucket;
	}

	@Override
	protected String getBucketPassword() {
		return this.password;
	}

	public String getCasesBucket() {
		return casesBucket;
	}

	public String getDefaultBucket() {
		return defaultBucket;
	}

	public List<String> getHosts() {
		return hosts;
	}

	public String getPassword() {
		return password;
	}

	public void setCasesBucket(String casesBucket) {
		this.casesBucket = casesBucket;
	}

	public void setDefaultBucket(String defaultBucket) {
		this.defaultBucket = defaultBucket;
	}

	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
