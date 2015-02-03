package com.unience.pages

import com.unience.modules.SignUpModule
import geb.Page
/**
 *   Page Object representing the Home page (when the user is not logged in yet).
 */
class HomePage extends Page {

    private static final String UNIENCE_PRODUCTION_URL = "https://www.unience.com/"
    private static final String UNIENCE_STAGE_URL = "https://stage.uniience.com/"
    private static final String UNIENCE_DEV_URL = "https://dev.uniience.com/"

    static url = UNIENCE_STAGE_URL

    static content = {
        signUp { module SignUpModule}
    }

    static at = {
        title.equals("Unience: The Financial Services Industry’s Online Network")

        $("a[id='newUnienceLogo'] h1").text() == "Unience, The Investor Social Network"
        $("h2[id='sloganUnience']").size() > 0

        $("#menuHome")

        $("input[id='j_username']")
        $("input[id='j_password']")
        $("form[id='loginForm'] button[type='submit']").text() == "Sign in"
        $("#loginForm")

        signUp.registerForm
        signUp.registerButton.text() == "Sign Me Up!"
    }

}
