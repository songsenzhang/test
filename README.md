# CrazyHonest API Service

### Swagger
* [http://127.0.0.1:8888/swagger-ui.html](http://127.0.0.1:8888/swagger-ui.html)

### Couchbase
#### Bucker

* cases
* goods
* users

#### Indexs
```sh
    # Cases
    create primary index ids_primay_key_cases on cases using gsi
    # Googs
    create primary index ids_primay_key_goods on goods using gsi
    # User
    create primary index ids_primay_key_user on user using gsi
```

#### Views
```js
    // Cases
    // -- search_type
    function (doc, meta) {
        emit(doc.type, doc);
    }
    // -- search_status
    function (doc, meta) {
        emit(doc.status, doc);
    }
    // -- search_type_status
    function (doc, meta) {
        emit([doc.type,doc.status], doc);
    }
    // -- search_all
    function (doc, meta) {
        emit(doc);
    }
    
    // Goods
    // -- search_all
    function (doc, meta) {
        emit(doc);
    }

    // Users
    // -- search_all
    function (doc, meta) {
        emit(doc);
    }
```