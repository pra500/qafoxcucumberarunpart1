package outline444;

import io.cucumber.java.en.*;

public class wa {
	
	

@Given("user is on Amazon landing page {string}")
public void user_is_on_amazon_landing_page_kidsware(String s) {
  System.out.println(s);
}

@And("Sign in button is present on screen {string}")
public void sign_in_button_is_present_on_screen_clothes(String s) {
   System.out.println(s);
}


@And("discount is present {int}")
public void discount_is_present(Integer int1) {
	System.out.println(int1);
}



}
