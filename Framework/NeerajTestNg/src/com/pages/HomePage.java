package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.GenericFunctions;

public class HomePage extends  GenericFunctions{
	
	//*********************************Secure Login******************************
	@FindBy(how = How.XPATH, using ="//input[@name='uname']")
	public static WebElement SecuerLoginUsername; 
	
	@FindBy(how = How.XPATH, using ="//input[@name='pwd']")
	public static WebElement SecuerLoginPassword;
	
	@FindBy(how = How.XPATH, using ="//input[@name='submitBtn']")
	public static WebElement SecuerLoginsubmitBtn;
		
	//*********************************tabs******************************
	
	@FindBy(how = How.XPATH, using ="(//a)[1]")
	public static WebElement Home;
	
	@FindBy(how = How.XPATH, using ="(//a)[2]")
	public static WebElement Admin;
	
	@FindBy(how = How.XPATH, using ="(//a)[3]")
	public static WebElement Staff;
	
	@FindBy(how = How.XPATH, using ="(//a)[4]")
	public static WebElement Features;
	
	@FindBy(how = How.XPATH, using ="(//a)[5]")
	public static WebElement ContactUs;
		
	//*********************************Secure Login method******************************
	
	public static boolean SecureLogin(){
		testStatus = true;
		
	try{
		SecuerLoginUsername.sendKeys("user01");
		SecuerLoginPassword.sendKeys("pass1234");
		SecuerLoginsubmitBtn.click();
						
		}
		catch (Exception e)
	{
			testStatus = false;
			System.out.println(e.getMessage());
		
	}
	return testStatus;
	
	}
	
	//*********************************Method tabs order******************************
	public static boolean TabsOrder(){
		testStatus = true;
		try{
			Home.click();
			Admin.click();
			Home.click();
			Staff.click();
			Home.click();
			Features.click();
			Home.click();
			ContactUs.click();
			System.out.println("Tabs displayed in order");			
			}
		
		catch (Exception e)
		{
			testStatus = false;
			System.out.println(e.getMessage());
			
		}
		return testStatus;
	}
		
//**************************************broken links**************************
		public static boolean Brokenlinks(){
			testStatus = true;
			List<WebElement> links = driver.findElements(By.xpath("html/body/div/div[4]/div/a"));
			int n = links.size();
			System.out.println(n);
			
			// String[] adminTabLinks = {"Admin Home","Change
			// password","Logout","Add staff member","Edit staff member","Delete
			// staff","Add Customer","Edit customer","Delete customer"};

			try {

				for (int i = 0; i < n; i++) {
					String ur = links.get(i).getAttribute("href");
					// System.out.println(ur);

					HttpConn(ur);

				}
			} 
			catch (Exception e) {

					testStatus = false;
					System.out.println(e.getMessage());
					System.out.println("verification of broken links failed");
				}
				return testStatus;
		}
		
		}
			
