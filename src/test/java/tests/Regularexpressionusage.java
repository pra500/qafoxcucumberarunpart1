package tests;

import io.cucumber.java.en.*;

public class Regularexpressionusage {
	
	
	
@Given("^login (.+)$")
public void ge(String s)
{
	
	System.out.println("hello "+s);
}

@And("^logout (.+)$")
public void gee(String s)
{
	
	System.out.println("he "+s);
}




@And("logottt {string}")
public void gggg(String s)
{
	
	System.out.println("hello india "+s);
	
}




}
