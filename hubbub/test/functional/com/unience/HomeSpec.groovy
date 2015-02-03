package com.unience

import com.unience.pages.HomePage
import geb.spock.GebReportingSpec
/**
 *
 */
class HomeSpec extends GebReportingSpec{


    def "Check that the Home page shows the login and register forms"() {

        when: "We access the Home of Unience correctly"
            to HomePage

        then: "Then we get the Home page"
            at HomePage
    }

    def "A new user gets registered"() {

        when: "We access the Home of Unience correctly"
            to HomePage

        then: "We register a new user"
            at HomePage
            signUp.register "ilopez@unience.com", "gebTestUser01", "gebTestUser01"
    }
}
