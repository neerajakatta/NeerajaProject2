package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.genericfunctions.GenericFunctions;

public class Admin_Staff extends GenericFunctions {

	//********** Add staff member under Add staff section************************
	
	@FindBy(how = How.XPATH, using ="//a[text()='Add staff member']")
	public static WebElement Addstaffmember;
	
	//@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[1]/td[2]")
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='staff_name']")
	public static WebElement AddStaff_StaffName;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[2]/td[2]/input[1]")
	public static WebElement AddStaff_genderMale;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[2]/td[2]/input[2]")
	public static WebElement AddStaff_genderFemale;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[3]/td[2]/input")
	public static WebElement AddStaff_DOB;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[4]/td[2]/select/option[1]")
	public static WebElement AddStaff_RelationshipUnmarried;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[4]/td[2]/select/option[2]")
	public static WebElement AddStaff_RelationshipMarried;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[4]/td[2]/select/option[3]")
	public static WebElement AddStaff_RelationshipDivorced;
	
	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[5]/td[2]/select/option[1]")
	public static WebElement AddStaff_DepartmentRevenue;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[5]/td[2]/select/option[2]")
	public static WebElement AddStaff_DepartmentDeveloper;

	@FindBy(how = How.XPATH, using = "//input[@name='staff_doj']")
	public static WebElement AddStaff_DOJ;

	@FindBy(how = How.XPATH, using = "//textarea[@name='staff_address']")
	public static WebElement AddStaff_Address;

	@FindBy(how = How.XPATH, using = "//input[@name='staff_mobile']")
	public static WebElement AddStaff_Mobile;

	@FindBy(how = How.XPATH, using = "//input[@name='staff_email']")
	public static WebElement AddStaff_Emailid;

	@FindBy(how = How.XPATH, using = "//input[@name='staff_pwd']")
	public static WebElement AddStaff_Password;

	@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[11]/td/input")
	public static WebElement AddStaff_AddStaffMember;

	//********** edit staff member link ************************
	
	@FindBy(how = How.XPATH, using ="//a[text()='Edit staff member']")
	public static WebElement Editstaffmember;
		
	//********** delete staff member link ************************
	@FindBy(how = How.XPATH, using ="//a[text()='Delete staff']")
	public static WebElement Deletestaff;
	
//********** click add staff member link under admin section************************
	
	public static boolean Addstaffmember(){
		
		testStatus = true;
		try{
				Addstaffmember.click();
				System.out.println("Add Staff section is displayed");
		   }
		
	catch (Exception e)
		   {
			testStatus = false;
			System.out.println(e.getMessage());
		   }
		return false;
	
	}
	

	//********** click edit staff member link under admin section************************
	
	public static void Editstaffmember(){
		testStatus = true;
		
	try{
			Editstaffmember.click();
			System.out.println("edit Staff section is displayed");
	   }
	
	catch (Exception e)
		  {
			testStatus = false;		
			System.out.println(e.getMessage());
	      }
	}
		
	//*****************Enter add staff details*****************************************************************
	
public static boolean fillStaffdetails(String name,String gender,String dob,String relationship,String department,String doj,String address,String mobile,String emailid,String password){
		
		testStatus = true;
	try{
			AddStaff_StaffName.sendKeys(name);
			AddStaff_genderMale.click();
			AddStaff_DOB.sendKeys(dob);
			AddStaff_RelationshipMarried.click();
			AddStaff_DepartmentDeveloper.click();
			AddStaff_DOJ.sendKeys(doj);
			AddStaff_Address.sendKeys(address);
			AddStaff_Mobile.sendKeys(mobile);
			AddStaff_Emailid.sendKeys(emailid);
			AddStaff_Password.sendKeys(password);
			AddStaff_AddStaffMember.click();
					
	   }
		
	catch (Exception e)
		   {
			testStatus = false;
			System.out.println(e.getMessage());
		   }
		return false;
	
	}
	
	
	//********** click delete staff member link under admin section************************	
		public static void Deletestaff(){
			testStatus = true;
			
	try{
		Deletestaff.click();
		System.out.println("Delete Staff details page is displayed");
	   }
    catch (Exception e)
	   {
    	testStatus = false;	
    	System.out.println(e.getMessage());
	   }
	
}
		
		
		//********** DatePicker************************	
		public static void Deletestaff1(){
			testStatus = true;
			
	try{
		Deletestaff.click();
		System.out.println("Delete Staff details page is displayed");
	   }
    catch (Exception e)
	   {
    	testStatus = false;	
    	System.out.println(e.getMessage());
	   }
	
}
		
		
		
		
}