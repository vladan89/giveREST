package giverest

import grails.rest.Resource

@Resource(uri="/gifts", readOnly = false, formats = ["json", "xml"])
class Gift {

    enum GiftStatus {
        ACTIVE, CLOSED
    }

    String title
    String description
    User owner
    Date created
    GiftStatus status
    Category category

    static constraints = {
        id generator: 'identity'
        title blank: false, nullable: false
        description blank: false, nullable: false
        owner nullable: false
        created nullable: false
        category nullable: false
    }
    static mapWith = "mongo"
}
