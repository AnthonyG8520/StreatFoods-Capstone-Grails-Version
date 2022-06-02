package org.grails.guides

import grails.gorm.services.Service

@Service(Review)
interface ReviewService {

    Review save(int rating, Truck truck, User user)

}