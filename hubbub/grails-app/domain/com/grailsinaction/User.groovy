package com.grailsinaction

class User {

	String loginId
    String password
    String homepage
    //Convention names for date fields: **Created and **Updated
    Date dateCreated

    static constraints = {
    }
}
