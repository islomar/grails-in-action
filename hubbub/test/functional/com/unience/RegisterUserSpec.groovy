package com.unience
import com.unience.pages.HomePage
import com.unience.pages.SignUpPage
import com.unience.pages.WizardStepPage1
import geb.spock.GebReportingSpec
import spock.lang.Ignore

/**
 *  Functional test to check the successful registration of a user, both completing and not completing
 *  the wizard.
 */
class RegisterUserSpec extends GebReportingSpec {


    def "A new user fails registering if password does not match criteria"() {

        when: "We access the Home of Unience correctly"
            to HomePage

        and:  "We register a new user with a bad password"
            registerUserWithPassword("patata")

        then: "We get redirected to the SignUp page"
            waitFor {
                at SignUpPage
            }
    }

    def "A new user gets successfully registered without finishing the wizard"() {

        when: "We access the Home of Unience correctly"
         to HomePage

        and: "We register a new user with all the fields correct"
            registerUserWithPassword("gebUserTest01")

        then: "We get redirected to the wizard page"
            waitFor {
                at WizardStepPage1
            }
    }

    @Ignore("Pending to finish the test: it should select the profile")
    def "A new user gets successfully registered finishing the wizard without filling anything"() {

        when: "We access the Home of Unience correctly"
            to HomePage

        and: "We register a new user with all the fields correct"
            registerUserWithPassword("gebUserTest01")

        then: "We get redirected to the wizard page"
            waitFor {
                at WizardStepPage1
                //selectIndividualInvestorProfile
                wizardStep1Form.click()
            }
    }

    private void registerUserWithPassword(password) {
        def username = generateRandomUsername()
        signUp.register username + "@test.com", username, password
    }

    private String generateRandomUsername() {
        UUID.randomUUID().toString()[0..19]
    }

}
