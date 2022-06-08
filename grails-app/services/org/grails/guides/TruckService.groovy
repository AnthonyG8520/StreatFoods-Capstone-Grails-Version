package org.grails.guides

import grails.gorm.services.Service

@Service(Truck)
interface TruckService {

    Truck get(Serializable id)

    List<Truck> list(Map args)

    Long count()

    void delete(Serializable id)

    Truck save(String name, String description, String phone, User truckOwner)

    Truck save (String name, User truckOwner)

}