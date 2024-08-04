package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Register1_WEB.feature"},
		glue= {"Register1_WEB.java"},
		monochrome=false,
		dryRun=true
		)
public class Register1_Web {

}
