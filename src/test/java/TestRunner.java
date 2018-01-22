import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import testDataGenerators.TestDataGenerator;

import java.io.IOException;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "/Users/arpitsingh/IdeaProjects/serenityAssignment/src/test/resources/features")
public class TestRunner {
}