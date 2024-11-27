package lopee;

import io.cucumber.java.en.*;

public class jk56 {
	
	

@Given("the user navigates to the OpenCart homepage")
public void the_user_navigates_to_the_open_cart_homepage() {
    System.out.println("pretty");
}

@Given("the user is on the OpenCart homepage")
public void the_user_is_on_the_open_cart_homepage() {
	 System.out.println("pretty1");
}

@When("the user searches for a product {string}")
public void the_user_searches_for_a_product(String string) {
	 System.out.println("pretty2");
}

@Then("the search results should be displayed")
public void the_search_results_should_be_displayed() {
	 System.out.println("pretty3");
}

@Then("the product {string} should be listed in the search results")
public void the_product_should_be_listed_in_the_search_results(String string) {
	 System.out.println("pretty4");
}

@When("the user adds the product {string} to the cart")
public void the_user_adds_the_product_to_the_cart(String string) {
	 System.out.println("pretty5");
}

@Then("the product {string} should be added to the shopping cart")
public void the_product_should_be_added_to_the_shopping_cart(String string) {
	 System.out.println("pretty6");
}

@Then("the cart should show {string}")
public void the_cart_should_show(String string) {
	 System.out.println("pretty7");
}

@When("the user clicks on the {string} category")
public void the_user_clicks_on_the_category(String string) {
	 System.out.println("pretty8");
}

@Then("the Tablets category page should be displayed")
public void the_tablets_category_page_should_be_displayed() {
	 System.out.println("pretty9");}


}
