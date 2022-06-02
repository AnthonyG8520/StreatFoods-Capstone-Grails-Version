package org.grails.guides

class Menu {

    static belongsTo = [truck: Truck]

    String name

    String description

    static constraints = {
        name nullable: false

        description nullable: true
    }
}
