package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.genericfunctions.GenericFunctions;
import com.pages.AdminPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class TC_02_AdminPage extends GenericFunctions {

	// ******************Launch firefox browser*************************************************
	@Given("launch browser and open application")
		
	public static void AdminLaunchBrowser(){
		LaunchBrowser("firefox","http://server/bank/");
	}
	
	 @When("an application is opened navigate to admin module")
	 
	// *******************  *************************************************
	 public static void AdminLogin(){
		 
			AdminPage pge=PageFactory.initElements(driver, AdminPage.class);
		//	pge.loginadmin();
			clickElement("//div[@class='wrapper']/div[2]/ul/li[2]/a");
			textVerify("Admin Home");
	 }
		// ******************Verify broken links*************************************************
		@Then("test each link")
		public static void VerifyBrokenLinks() {
				List<WebElement> links = driver.findElements(By.xpath("//a[text()='Admin Home']/ancestor::div/div[3]/div/ul/li/a"));
				int n = links.size();
				System.out.println(n);
			try{
					for(int i=0;i<n;i++){
					String Turl = links.get(i).getAttribute("href");
					System.out.println(Turl);
					HttpConn(Turl);
					
				}
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				System.out.println("verification of broken links in admin section failed");
				}
						}
}
