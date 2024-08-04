package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Login_Web.feature"},
		glue= {"Login_Web.java"},
		monochrome=false,
		dryRun=true
		)
public class Register1_Web {

}
