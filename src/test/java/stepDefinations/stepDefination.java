package stepDefinations;

import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on Netbanking Login page$")
    public void user_is_on_netbanking_login_page() throws Throwable {
       System.out.println("hii");
    }


    @When("^User login to application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_to_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
      System.out.println(strArg1);
      System.out.println(strArg2);
    }

    @Then("^HomePage is populated$")
    public void homepage_is_populated() throws Throwable {
    	 System.out.println("hii");
    }


    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
       System.out.println(strArg1);
    }

}
