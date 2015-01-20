package com.grailsinaction

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Profile)
class ProfileSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "Saving a profile with invalid properties causes an error"() {

        given: "A user which fails several field validations"
            def profile = new Profile(fullName: 'John Smith', homepage: 'not-a-url')

        when: "The user is validated"
            profile.validate()

        then:
            profile.hasErrors()
            "url.invalid"   == profile.errors.getFieldError("homepage").code
            "not-a-url"     == profile.errors.getFieldError("homepage").rejectedValue
            !profile.errors.getFieldError("fullName")
    }
}
