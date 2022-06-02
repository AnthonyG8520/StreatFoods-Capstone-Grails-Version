package org.grails.guides

import grails.testing.gorm.DomainUnitTest
import org.grails.guides.Review
import spock.lang.Specification

class ReviewSpec extends Specification implements DomainUnitTest<Review> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
