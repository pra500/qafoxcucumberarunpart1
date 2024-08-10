package forpractice;

import io.cucumber.java.en.*;

public class v {
	
	
	public class EcommerceSanitySteps {
	  

	    @Given("the user navigates to the home page")
	    public void the_user_navigates_to_the_home_page() {
	        System.out.println("a");
	    }

	    @Then("the home page should load successfully")
	    public void the_home_page_should_load_successfully() {
	    	  System.out.println("a1");
	       
	    }

	    @Then("the user should see the website logo")
	    public void the_user_should_see_the_website_logo() {
	    	  System.out.println("a2");
	    }

	    @Then("the user should see the search bar")
	    public void the_user_should_see_the_search_bar() {
	    	  System.out.println("a3");
	    }

	    @Then("the user should see the main navigation menu")
	    public void the_user_should_see_the_main_navigation_menu() {
	    	  System.out.println("a4"); 
	    }

	   }
}
