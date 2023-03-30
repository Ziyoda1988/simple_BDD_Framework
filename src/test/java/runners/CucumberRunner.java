package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)  //junit runner
@CucumberOptions( //cucumber options
        features = "src/test/resources/login.feature", //path to feature file
        glue = "stepDefinitions" //path to step definitions



)
public class CucumberRunner {


}
