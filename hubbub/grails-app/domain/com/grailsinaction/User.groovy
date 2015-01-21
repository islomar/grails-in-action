package com.grailsinaction

class User {

	String loginId
    String password
    //Convention names for date fields: dateCreated and lastUpdated
    Date dateCreated
    static hasOne = [ profile: Profile ]
    static hasMany = [ posts: Post, tags: Tag, following: User ]
    //Configure the sort on the relationship with Post
    static mapping = {
        posts sort: "dateCreated"
    }

    // parentheses are allowed as well to define the constraints
    static constraints = {
        loginId size: 3..20, unique: true, nullable: false
//        loginId size: 3..20, unique: true, nullable: false, matches: '[0-9]{7}[A-Za-z]'
        password size: 6..8, nullable: false, validator: { passwd, user -> passwd != user.loginId }
        // This way, we can control the ordering in UI of fields that have no validation constraints
        tags()
        posts()

        profile nullable: true
    }
}
