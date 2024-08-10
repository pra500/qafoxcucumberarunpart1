package scenariooutlineeee;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/cs.html"})
public class run {

}


