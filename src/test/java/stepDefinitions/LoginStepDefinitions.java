package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utils.ConfigReader;
import utils.Driver;

public class LoginStepDefinitions {
    @Given("I am on home page")
    public void i_am_on_home_page() {
   Driver.getDriver().get(ConfigReader.getProperty("homepage"));




    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        HomePage homePage = new HomePage();
        homePage.loginButton.click();
        homePage.username.sendKeys(ConfigReader.getProperty("username"));
        homePage.password.sendKeys(ConfigReader.getProperty("password"));



    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        HomePage homePage = new HomePage();
        homePage.loginButton.click();

        Assert.assertEquals("Web Orders", Driver.getDriver().getTitle());


    }

}





