package org.grails.guides.scaffolding

import grails.validation.ValidationException
import org.grails.guides.Truck
import org.grails.guides.TruckService

import static org.springframework.http.HttpStatus.*

class TruckController {

    TruckService truckService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond truckService.list(params), model:[truckCount: truckService.count()]
    }

    def show(Long id) {
        respond truckService.get(id)
    }

    def edit(Long id) {
        respond truckService.get(id)
    }

    def update(Truck truck) {
        if (truck == null) {
            notFound()
            return
        }

        try {
            truckService.save(truck)
        } catch (ValidationException e) {
            respond truck.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'truck.label', default: 'Truck'), truck.id])
                redirect truck
            }
            '*'{ respond truck, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        truckService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'truck.label', default: 'Truck'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'truck.label', default: 'Truck'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
