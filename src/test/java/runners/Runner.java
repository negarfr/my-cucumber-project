package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // this annotation will run our class
@CucumberOptions(
        features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
        glue = "stepdefinitions", //PATH OF STEP DEFINITIONS
        dryRun = false ,
        tags = "@parametrizing1"
)
public class Runner {

}
/*
 features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
         glue = "stepdefinitions", //PATH OF STEP DEFINITIONS
         dryRun = false //IF dryRun = true. RUN DRY. JUST GIVE ME THE MISSING STEP DEFINITIONS. DON'T RUN THE TEST CASES.
         dryRun= false when we are doing test execution. dryRun=true when we are generation missing step definitions
         */