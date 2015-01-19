package com.grailsinaction

import spock.lang.Specification

class UserIntegrationSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "Saving our first user to the database"() {

        given: "A brand new user"
        def joe = new User(loginId: 'joe', password: 'secret',
                           homepage: 'http://www.grailsinaction.com')

        when: "the user is saved"
        joe.save()

        then: "it saved successfully and can be found in the database"
        //Ensures save() was error free
        joe.errors.errorCount == 0
        //confirms save() set database ID
        joe.id != null
        User.get(joe.id).loginId == joe.loginId
    }

    def "Updating a saved user changes its properties"() {

        given: "An existing user"
        def existingUser = new User(loginId: 'joe', password: 'secret',
                           homepage: 'http://www.grailsinaction.com')
        //failOnError:true means that Grails will throw an exception if the object fails any validation tests
        existingUser.save(failOnError: true)

        when: "A property is changed"
        def foundUser = User.get(existingUser.id)
        foundUser.password = 'sesame'
        foundUser.save(failOnError: true)

        then: "The change is reflected in the database"
        User.get(existingUser.id).password == 'sesame'
    }
}
