package com.grailsinaction

class User {

	String loginId
    String password
    String homepage
    //Convention names for date fields: dateCreated and lastUpdated
    Date dateCreated

    // parentheses are allowed as well to define the constraints
    static constraints = {
        loginId size: 3..20, unique: true, nullable: false
//        loginId size: 3..20, unique: true, nullable: false, matches: '[0-9]{7}[A-Za-z]'
        password size: 6..8, nullable: false, validator: { passwd, user -> passwd != user.loginId }
        homepage url: true, nullable: true
    }
}
