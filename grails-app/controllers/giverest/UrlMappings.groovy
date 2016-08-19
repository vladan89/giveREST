package giverest

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/categories"(resources:"category")
        "/users"(resources:"user")
        "/gifts"(resources:"gift") {
            "/owner"(controller:"user", method:"GET")
        }
    }
}
