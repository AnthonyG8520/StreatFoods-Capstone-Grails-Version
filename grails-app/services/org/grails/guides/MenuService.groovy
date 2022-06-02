package org.grails.guides

import grails.gorm.services.Service

@Service(Menu)
interface MenuService {

    Menu save(String name, String description, Truck truck)

}