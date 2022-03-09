package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SauceDemo {
	
	@Given("^Launch the application on chrome browser$")
    public void launch_the_application_on_chrome_browser() throws Throwable {
        System.out.println("SauceDemo.launch_the_application_on_chrome_browser()");
    }

    @Then("^user should be able to login$")
    public void user_should_be_able_to_login() throws Throwable {
        System.out.println("SauceDemo.user_should_be_able_to_login()");
    }

    @And("^Enter valid login credentials$")
    public void enter_valid_login_credentials() throws Throwable {
       System.out.println("SauceDemo.enter_valid_login_credentials()");
    }
    
    
    @Then("Verify home page displayed")
    public void verify_home_page_displayed() {
        System.out.println("4444444444444444");
    }

    
    @Given("^Launch the application on Firefox browser$")
    public void launch_the_application_on_firefox_browser() throws Throwable {
        System.out.println("lanuching Firefox browser");
    }
}
