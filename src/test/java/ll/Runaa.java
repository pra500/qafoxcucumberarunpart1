package ll;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//dryrun:
//is to verify whether all feature file steps have corresponding step definitions. The value of dry run can be either true or false. The default value of dry run is false 




@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/cu24z.html"},

dryRun = true
)
public class Runaa {

}
