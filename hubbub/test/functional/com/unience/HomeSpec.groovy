package com.unience
import com.unience.pages.HomePage
import geb.spock.GebReportingSpec

/**
 * Functional test to check that the Home page () shows the most important elements:
 * login and register form, title, h1, etc.
 */
class HomeSpec extends GebReportingSpec{


    def "Check that the Home page shows the login and register forms"() {

        when: "We access the Home of Unience correctly"
            to HomePage

        then: "Then we get the Home page"
            at HomePage
    }

}
