package giverest

import grails.rest.Resource

@Resource(uri="/categories", readOnly = false, formats = ["json", "xml"])
class Category {

    String name
    Boolean active

    static constraints = {
        name nullable: false, unique: true
        active defaultValue: true
    }

    static mapping = {
        id generator: 'identity'
    }

    static mapWith = "mongo"
}
