package giverest

class Category {

    String name
    Boolean active

    static constraints = {
        name nullable: false
        active defaultValue: true
    }

    static mapping = {
        id generator: 'identity'
    }

    static mapWith = "mongo"
}
