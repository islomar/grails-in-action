package com.unience.modules

import geb.Module

/**
 * modules are reusable fragments that can be used across pages that can be parameterised
 * here we are using a module to model the search function on the home and results pages
 */
class SignUpModule extends Module {

    static content = {
        registerForm { $("#registerForm") }
        registerButton { $("#register") }
        emailInputField { $("#registerForm input", name: "email") }
        usernameInputField { $("#registerForm input", name: "username") }
        passwordInputField { $("#registerForm input", name: "password") }
        acceptTermsCheckbox { $("#registerForm input", type: "checkbox", name:"legalTerms") }
    }

    void register(String email, String username, String password) {

        emailInputField = email
        usernameInputField = username
        passwordInputField = password
        acceptTermsCheckbox = true
        registerButton.click()
    }
}
