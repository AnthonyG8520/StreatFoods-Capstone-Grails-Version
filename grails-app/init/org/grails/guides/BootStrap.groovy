package org.grails.guides

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {

    MenuService menuService
    ReviewService reviewService
    TruckService truckService
    UserService userService

    def init = { servletContext ->

        User user = userService.save("Anthony", "pass", "ant@gmail", false)

        Truck truck = truckService.save("foodTruck", user)



    }
    def destroy = {
    }
}
