package giverest

import grails.rest.Resource

@Resource(uri="/users", readOnly = false, formats = ["json", "xml"])
class User {

    enum UserStatus {
        CREATED, ACTIVE, DISABLED
    }

    String firstName
    String lastName
    String email
    String phone
    UserStatus status
    Date created

    static constraints = {
        id generator: 'identity'
        firstName blank: false, nullable: false
        lastName blank: false, nullable: false
        email blank: false, nullable: false, email: true, unique: true
        phone blank: false, nullable: false
        created nullable: false
    }

    String displayName(){
        return firstName + " " + lastName
    }
    static mapWith = "mongo"
}
