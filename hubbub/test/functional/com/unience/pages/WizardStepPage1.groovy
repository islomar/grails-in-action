package com.unience.pages

import geb.Page

/**
 *
 */
class WizardStepPage1 extends Page {

    static url = "https://stage.uniience.com/welcome/wizardStep1"

    static content = {
        wizardStep1Form { $("#wizardStep1Form") }
    }

    static at = {
        $("#wizardStep1Form input", name: "name")
    }

}
