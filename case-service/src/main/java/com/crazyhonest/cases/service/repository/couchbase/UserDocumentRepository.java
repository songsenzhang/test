package com.crazyhonest.cases.service.repository.couchbase;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.crazyhonest.common.client.baseobjects.UserObject;

public interface UserDocumentRepository extends CouchbaseRepository<UserObject, String> {

}
