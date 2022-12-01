package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "C://Users//ak.rajput//IdeaProjects//Selenium_Automations//Features//Login.feature",
                glue = "stepDefinitions", //stepdedintionspakcage
                dryRun = false, //Cross check corresponding stepdefintions for feature file
                monochrome = true, // makes the console op in Readable format
                plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"} //report
        )
public class TestRun {


}
