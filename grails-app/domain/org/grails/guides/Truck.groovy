package org.grails.guides

class Truck {

    static belongsTo = [truckOwner: User]

    static hasMany = [menuItems: Menu]

    String name

    String description

    String phone

    static constraints = {
        name nullable: false

        description nullable: true

        phone nullable: true, unique: true
    }
}
