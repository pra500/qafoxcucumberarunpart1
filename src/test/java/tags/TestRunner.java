package tags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



//we can give like dat:
//@smoke - only smoke ll run,  @smoke and @regression  - in which both ll be der together, they ll run, @login or @search: both ll run, not @smoke - except
//smoke everything ll run, @all - all ll run, 
//"@login and @regression"  : whole combination should be der
//@login or @regression     : either one  should be der
//@login and not @sqlservername    : only @login ll run









@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/cucu1.html"}, 
                 tags= "not @search")




public class TestRunner {
	
	
	
	

}
