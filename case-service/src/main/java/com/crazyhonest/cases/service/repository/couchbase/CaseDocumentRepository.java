package com.crazyhonest.cases.service.repository.couchbase;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.crazyhonest.common.client.baseobjects.CaseObject;

public interface CaseDocumentRepository extends CouchbaseRepository<CaseObject, String> {

}
