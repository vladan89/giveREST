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

        "/gifts"(controller: "gift", action: "index", method: "GET")
        "/gifts"(controller: "gift", action: "save", method: "POST")
        "/gifts/$id"(controller: "gift", action: "update", method: "PUT")
        "/gifts/$id"(controller: "gift", action: "patch", method: "PATCH")
        "/gifts/$id"(controller: "gift", action: "delete", method: "DELETE")
    }
}
