package org.grails.guides

import grails.gorm.services.Service

@Service(Truck)
interface TruckService {

    Truck save(String name, String description, String phone, User truckOwner)

}