package com.grailsinaction

class ApplicationUser {

    String applicationName
    String loginId
    String password
    String apiKey

    static constraints = {

        // Reuse the constraints from User!!! (DRY)
        importFrom User, include: ['password']

        applicationName blank: false, unique: true
        apiKey blank: false
    }
}
