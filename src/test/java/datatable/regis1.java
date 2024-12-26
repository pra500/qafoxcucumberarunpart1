package datatable;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class regis1 {
		
	
	
	@Given("enter below info")
	public void enter_below_info(DataTable dataTable) {
				
	Map<String, String>map1=dataTable.asMap(String.class, String.class);
	System.out.println("enter firstname as "+map1.get("firstname"));
	System.out.println("enter DOB as "+map1.get("DOB"));
	System.out.println("enter age as "+map1.get("age"));
	 
	  
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		
		System.out.println("aa");
	   
	}

	@Then("registartion successful")
	public void registartion_successful() {
		System.out.println("aa1");
	}
//**************

}
