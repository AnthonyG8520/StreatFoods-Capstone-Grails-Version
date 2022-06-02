package org.grails.guides

class Truck {

    static hasOne = [truckOwner: User]

    static hasMany = [menu: Menu, reviews: Review]

    String name

    String description

    String phone

    static constraints = {
        name nullable: false

        description nullable: true

        phone nullable: true, unique: true
    }
}
