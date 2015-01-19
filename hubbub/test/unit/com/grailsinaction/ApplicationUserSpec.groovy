package com.grailsinaction

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ApplicationUser)
class ApplicationUserSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "Saving an applicationUser with loginId like password causes an error"() {

        given: "An applicationUser with same loginId and password"
            def applicationUser = new ApplicationUser(applicationName: 'hubbub', loginId: "islomar",
                                                      password: 'islomar', apiKey: '123456789')

        when: "The applicationUser is validated"
            applicationUser.validate()

        then:
            applicationUser.hasErrors()
            "validator.invalid" == applicationUser.errors.getFieldError("password").code
            "islomar"           == applicationUser.errors.getFieldError("password").rejectedValue
    }
}
