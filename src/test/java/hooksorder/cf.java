package hooksorder;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class cf {
	
	
	
	//we can mention value also, result will be same no change
	//if multiple parameters are der then value we ve to use like dat:     @Before(order =0, value="@smoke") 
	
	
			
	/*
	@Before(order=0)
	public void setup()
	{
		
		System.out.println("browser starting");
	}
	
	
	@Before(order=1)
	public void setup1()
	{
		System.out.println("browser starting1");
		
	}
	
	
	@Before(order=2)
	public void setup2()
	{
		System.out.println("browser starting2");
	}
	
	@After(order=2)
	public void teardown()
	{
		System.out.println("browser closing2");
	}
	
	
	@After(order=1)
	public void teardown1()
	{
		System.out.println("browser closing1");
	}
	
	@After(order=0)
	public void teardown2()
	{
		System.out.println("browser closing");
	}
	*/
	
	
	

	
	
	
	
	/*
	
	@Before(value="@smoke")
	public void setup()
	{
		
		System.out.println("browser starting");
	}
	
	@After(value="@smoke")
	public void teardown()
	{
		System.out.println("browser closing");
	}
	
	*/
	
	

	@Before(order =0, value="@smoke")
	public void setup()
	{
		
		System.out.println("browser starting");
	}
	
	@Before(order =1, value="@smoke")
	public void setup1()
	{
		
		System.out.println("browser starting slowly");
	}
	
	@After(order =0, value="@smoke")
	public void teardown()
	{
		System.out.println("browser closing slowly");
	}
	
	
	@After(order =1, value="@smoke")
	public void teardown1()
	{
		System.out.println("browser closing ");
	}
		
		
	@Given("enter weight")
	public void enter_weight() {
	    System.out.println("hellll");
	
	}

	@When("chk performance")
	public void chk_performance() {
	  System.out.println("helllllll");
	}

}
