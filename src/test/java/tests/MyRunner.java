package tests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//testrunner is used to run all the feature files together 



@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty", "html:target/cucu1.html"})
public class MyRunner {

}
