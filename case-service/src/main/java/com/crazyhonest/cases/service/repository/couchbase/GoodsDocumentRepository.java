package com.crazyhonest.cases.service.repository.couchbase;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.crazyhonest.common.client.baseobjects.GoodsObject;

public interface GoodsDocumentRepository extends CouchbaseRepository<GoodsObject, String> {

}
