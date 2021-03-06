package org.grails.guides

class Review {

    static belongsTo = [truck: Truck, user: User]

    int rating

    String reviewText

    static constraints = {
        rating nullable: false

        reviewText nullable: true
    }
}
