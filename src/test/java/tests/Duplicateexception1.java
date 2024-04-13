package tests;

import io.cucumber.java.en.*;

public class Duplicateexception1 {

	
	//we will get below:
	//Exception in thread "main" io.cucumber.core.runner.DuplicateStepDefinitionException: Duplicate step definitions in tests.a.vwo_site() and tests.Duplicateexception1.vwo_site()
   //same we have in a.java
	
//	@Given("vwo site")
//	public void vwo_site() {
//		 System.out.println("hel1");
//	}
	
	
	

	@Given("vwo siteeee")
	public void vwo_site() {
		 System.out.println("hel1");
	}
	
	
	
	//AmbiguousStepDefinitionsException:
	
	//now we will get  io.cucumber.core.runner.AmbiguousStepDefinitionsException: "vwo site" matches more than one step definition:
	
	
	//we will get Ambiguous Exception - when duplicacy is der like above and  at one place we r using regular expression one not
	
	
	
	
//	@Given("^vwo site$")
//	public void vwo_site() {
//		 System.out.println("hel1");
//	}
	
	
	
	
	@When("vwo login page")
	public void vwo_login_page() {
		 System.out.println("hel2");
	}
}
