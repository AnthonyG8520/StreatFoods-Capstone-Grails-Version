package org.grails.guides

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TruckServiceSpec extends Specification {

    TruckService truckService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Truck(...).save(flush: true, failOnError: true)
        //new Truck(...).save(flush: true, failOnError: true)
        //Truck truck = new Truck(...).save(flush: true, failOnError: true)
        //new Truck(...).save(flush: true, failOnError: true)
        //new Truck(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //truck.id
    }

    void "test get"() {
        setupData()

        expect:
        truckService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Truck> truckList = truckService.list(max: 2, offset: 2)

        then:
        truckList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        truckService.count() == 5
    }

    void "test delete"() {
        Long truckId = setupData()

        expect:
        truckService.count() == 5

        when:
        truckService.delete(truckId)
        sessionFactory.currentSession.flush()

        then:
        truckService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Truck truck = new Truck()
        truckService.save(truck)

        then:
        truck.id != null
    }
}
