package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class stepDef {

    public WebDriver driver;
    public LoginPage lp;


    @Given("User Launch Chrome Browser")
    public void user_launch_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","D://Drivers_Selenium//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();

        lp = new LoginPage(driver);


    }
    @When("User Opens URL {string}")
    public void user_opens_url(String url) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);

    }
    @When("User Enters email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        lp.setUserName(email);
        lp.setPassword(password);
        // Write code here that turns the phrase above into concrete actions

    }
    @When("Click on Login")
    public void click_on_login() {
        lp.clickLogin();
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("Page Title Should be {string}")
    public void page_title_should_be(String title) {

        if(driver.getPageSource().contains("Login was unsuccessful")){
            driver.close();
            Assert.assertTrue(false);

        }else{
            Assert.assertEquals(title,driver.getTitle());
        }

        // Write code here that turns the phrase above into concrete actions

    }
    @When("User Click on log Out link")
    public void user_click_on_log_out_link() {
        lp.clickLogOut();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Close browser")
    public void close_browser() {
        driver.quit();
        // Write code here that turns the phrase above into concrete actions

    }

}
