package org.grails.guides

class User {

    static hasOne = [truck: Truck]

    static hasMany = [reviews: Review]

    String username

    String password

    String email

    boolean truckOwner

    static constraints = {
        truck nullable: true

        username nullable: false, unique: true

        password nullable: false

        email nullable: false, unique: true

        truckOwner nullable: false
    }

}
