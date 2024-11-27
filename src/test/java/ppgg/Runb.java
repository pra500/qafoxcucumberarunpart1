package ppgg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/csoo89.html"}, 
monochrome = true
)
public class Runb {

}
