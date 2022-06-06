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

        Truck truck = truckService.save("FoodTruck", "Lots of food to choose from here", "2109199199" ,user)

        user.setTruck(truck)

        Menu item = menuService.save("Hotdog", "Huge Hotdog", truck)

        Review review = reviewService.save(5, "Great hotdogs", truck, user)


    }
    def destroy = {
    }
}
