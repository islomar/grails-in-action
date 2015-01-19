package com.grailsinaction

class User {

	String loginId
    String password
    String homepage
    //Convention names for date fields: **Created and **Updated
    Date dateCreated

    // parentheses are allowed as well to define the constraints
    static constraints = {
        loginId size: 3..20, unique: true, nullable: false
        password size: 6..8, nullable: false
        homepage url: true, nullable: true
    }
}
