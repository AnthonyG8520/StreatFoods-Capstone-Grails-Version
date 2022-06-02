package org.grails.guides

import grails.testing.gorm.DomainUnitTest
import org.grails.guides.Truck
import spock.lang.Specification

class TruckSpec extends Specification implements DomainUnitTest<Truck> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
