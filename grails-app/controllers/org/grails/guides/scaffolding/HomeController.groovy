package org.grails.guides.scaffolding

import org.grails.guides.Truck

class HomeController {

    def index() {
        respond([truckList: Truck.list()])
    }
}
