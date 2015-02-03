package com.unience.pages

import com.unience.modules.SignUpModule
import geb.Page

/**
 *
 */
class SignUpPage extends Page {

    static url = "https://stage.uniience.com/signup"

    static content = {
        signUp { module SignUpModule}
    }

    static at = {
        title.equals("Unience - Sign up")
    }
}
