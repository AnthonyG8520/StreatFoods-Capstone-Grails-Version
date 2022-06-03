package org.grails.guides.scaffolding

import groovy.transform.CompileStatic
import org.grails.guides.Truck

@CompileStatic
class TruckController {

    static scaffold = Truck

    def show(Truck truck){
        respond truck
    }

}
