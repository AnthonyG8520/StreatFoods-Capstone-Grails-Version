package org.grails.guides

class User {

    String username

    String password

    String email

    boolean truckOwner

    Truck truck

    static constraints = {
        truck nullable: true

        username nullable: false, unique: true

        password nullable: false

        email nullable: false, unique: true

        truckOwner nullable: false
    }

}
