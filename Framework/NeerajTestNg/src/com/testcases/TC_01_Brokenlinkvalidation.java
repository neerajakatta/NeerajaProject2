package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.genericfunctions.GenericFunctions;
import com.pages.AdminPage;
import com.pages.HomePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_01_Brokenlinkvalidation extends GenericFunctions {

// ******************Launch firefox browser*************************************************
	@Given("As an user i want to launch firefox browser")
	public static boolean LaunchApplication() {
		testStatus = true;
		return LaunchBrowser("firefox", "http://server/bank/");

	}

	// *******************Verify home page  *************************************************
	@When("an application is opened verify home page is displayed")

	public static boolean VerifyingHomePage() {

		return VerifyHome("Click to read safe online banking tips");
	}

	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")

	public static void logintoadminHomepage(String username, String password, DataTable credentials) {

		// List<List<String>> cred=credentials.raw();
		List<List<String>> list = credentials.asLists(String.class);

		for (int i = 0; i < list.size(); i++) {

			username = list.get(i).get(0);
			password = list.get(i).get(1);

			AdminPage pge = PageFactory.initElements(driver, AdminPage.class);

			pge.Admintab.click();
			pge.loginadmin(username, password);
		//	pge.AdminLogout();
			//if(i<list.size()-1)
			//{				pge.Home.click();
			//}	

		}

	}

	@Then("verify the tabs order")

	public static boolean verifyTabsOrder() {
		testStatus = true;

		HomePage pge1 = PageFactory.initElements(driver, HomePage.class);
		return pge1.TabsOrder();
	}

	@Then("verify the broken links")

	public static boolean VerifyBrokenLinks() {
		testStatus = true;
		
		HomePage pge2 = PageFactory.initElements(driver, HomePage.class);
		return pge2.Brokenlinks();
		

	}

}
