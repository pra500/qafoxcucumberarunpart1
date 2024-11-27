package l9;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/cucu4b2.html"})
public class RunEE {

}
