package chap10.section2

//val userDao = UserDao()
//
//path("/users") {
//    get("") { req, res ->
//        jacksonObjectMapper().writeValueAsString(userDao.users)
//    }
//
//    get("/:id") { req, res ->
//        userDao.findById(req.params("id").toInt())
//    }
//
//    get("/email/:email") { req, res ->
//        userDao.findByEmail(req.params("email"))
//    }
//
//    post("/create") { req, res ->
//        userDao.save(name = req.qp("name"), email = req.qp("email"))
//        res.status(201)
//        "ok"
//    }
//}