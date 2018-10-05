package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.GenericFunctions;

public class AdminPage extends GenericFunctions{

//********Login Module********************************	
	
		
	@FindBy(how = How.XPATH, using ="(//a)[2]")
	public static WebElement Admintab; 
	
	@FindBy(how = How.XPATH, using ="//input[@name='uname']")
	public static WebElement admin_Login_username;
	
	@FindBy(how = How.XPATH, using ="//input[@name='pwd']")
	public static WebElement admin_Login_password;
	
	@FindBy(how = How.XPATH, using ="//input[@name='submitBtn']")
	public static WebElement admin_Login_button_click;
	
	//********** Admin Home link under adminsection************************
	@FindBy(how = How.XPATH, using ="//a[text()='Admin Home']")
	public static WebElement AdminHome;
	
	//*************Change Password link under adminsection******************
	@FindBy(how = How.XPATH, using ="//a[text()='Change password']")
	public static WebElement AdminChangepassword;
	
	
	//***********Logout link under adminsection*******************************
	@FindBy(how = How.XPATH, using ="//a[text()='Logout']")
	public static WebElement AdminLogout;
	
	@FindBy(how = How.XPATH, using ="(//a)[1]")
	public static WebElement Home;
	
	//************************Click admin tab in home page************

public static boolean admin(){
		
		testStatus = true;
		
	try{
			Admintab.click();
	   } 
	catch (Exception e)
	   {
		   testStatus = false;
		   System.out.println(e.getMessage());
	   }
			return testStatus;
		
	}
	//**********************************Enter Admin login details 	//********** ************************
	public static boolean loginadmin(String username,String password){
		
		testStatus = true;
		
	try{
			
			admin_Login_username.clear();
			admin_Login_username.sendKeys(username);
			admin_Login_password.clear();
			admin_Login_password.sendKeys(password);
			admin_Login_button_click.click();
			
				}
	
	catch (Exception e)
	{
		testStatus = false;
		System.out.println(e.getMessage());
		
	}
	return testStatus;
	
	}
	
	//********** ************************Admin home page method	//********** ************************

	public static boolean clickAdminHome(){
		
		testStatus = true;
	try{
		AdminHome.click();
		System.out.println("AdminHome displayed successfully");
		}
	
	catch (Exception e)
	{
		testStatus = false;
		System.out.println(e.getMessage());
		
	}
	return testStatus;

	}
	
	//********** ************************Method for Change password under admin section	//********** ************************
	public static boolean AdminChangepassword(){
		testStatus = true;
		
	try{
		AdminChangepassword.click();
		System.out.println("Change password displayed successfully");
		}
	
	catch (Exception e)
	{
		System.out.println(e.getMessage());
		
	}
	return testStatus;
	}
	
	
	//********** ************************Method for Logout under admin section	//********** ************************
	public static boolean AdminLogout(){
		testStatus = true;
		
		try{
			AdminLogout.click();
			System.out.println("AdminLogout successfully");
			}
		
		catch (Exception e)
		{
			testStatus = false;
			System.out.println(e.getMessage());
			
		}
		return testStatus;
}
}