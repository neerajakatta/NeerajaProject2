package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.genericfunctions.GenericFunctions;
import com.pages.AdminPage;
import com.pages.Admin_Staff;
import com.pages.HomePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_03_AddStaff extends GenericFunctions { 

	// ******************Launch firefox browser*************************************************
	@Given("As an user i want firefox browser")
	public static boolean LaunchApplication(){
		testStatus = true;
		return LaunchBrowser("firefox", "http://server/bank/");
	}

	@When("an application is displayed")
	// *******************Verify home page  *************************************************

	public static boolean VerifyingHomePage() {
		testStatus = true;
		return VerifyHome("Click to read safe online banking tips");
	}

	@Then("add new staff details with all manadatory fields")
	
	// Add staff details *************************************************
	public static void addStaff(DataTable values) {
		testStatus = true;
			
		List<List<String>> details=values.raw();
		
		for (int i = 0; i < details.size(); i++) {
				
		String name  = details.get(i).get(0);
		String gender  = details.get(i).get(1);
		String dob  = details.get(i).get(2);
		String relationship  = details.get(i).get(3);
		String department  = details.get(i).get(4);
		String doj  = details.get(i).get(5);
		String address  = details.get(i).get(6);
		String mobile  = details.get(i).get(7);
		String emailid  = details.get(i).get(8);
		String password  = details.get(i).get(9);
		
		Admin_Staff pge1 = PageFactory.initElements(driver, Admin_Staff.class);
		pge1.Addstaffmember();
		pge1.fillStaffdetails(name,gender,dob,relationship,department,doj,address,mobile,emailid,password);
		}
		
	}
									
}
