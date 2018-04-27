package step_Definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
////		format = {"pretty","html:target/html/"},
////		format = {"pretty","json:target/json/output.json"},
//		format = {"pretty","json:target/json/output.json","html:target/html/"},
//		features = "src/test/resource"
		strict = false, 
		features = "src/test/resource", 
		format = { "pretty", "json:target/cucumber.json" },
		tags = { "~@ignore" }
		)

public class RunnerTest {

}
