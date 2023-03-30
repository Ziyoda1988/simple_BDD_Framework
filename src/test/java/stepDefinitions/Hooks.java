package stepDefinitions;

import org.junit.After;
import org.junit.Before;
import utils.ConfigReader;
import utils.Driver;

public class Hooks {

@Before
public void setUpScenario(){

    Driver.getDriver().get(ConfigReader.getProperty("homepage"));
    Driver.getDriver().manage().window().maximize();

}
@After
public void tearDownScenario(){
    Driver.quitDriver();
}

}
