package com.genericfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericFunctions {
	public static WebDriver driver;
	public static boolean testStatus;
	public static String[] Hometabs = {"Home","Admin","Staff","Features","Contact Us"};
	
	public static String s1;
	
	//*********************************Launch Browser method******************************
	
	public static boolean LaunchBrowser(String browser,String url){
		boolean status = true;
		try{
		switch (browser.toLowerCase()) {
		case "firefox":
			
			driver = new FirefoxDriver();			
			break;
			
		case "chrome":	
			//System.setProperty("webdriver.chrome.driver", value)
			//driver = new ChromeDriver();
			break;			

		default:		
			
			break;			
		} 
		
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		}
		catch(Exception e){
			status = false;
			System.out.println(e.getMessage());
		}
		return status;
		}

	//*********************************Method for verify home page******************************

		public static boolean VerifyHome(String value){
			boolean status = true;
			try{
				driver.findElement(By.linkText(value)).isDisplayed();
			System.out.println("Home page is displayed");
			}
			catch(Exception e){
				
			System.out.println("Home page is not displayed");
			
			}
			return false;
			
		}

		//*********************************Method for links verification*****************************
		public static boolean HttpConn(String currentURL) {
			boolean status = true;
			try{
			URL url = new URL(currentURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			Thread.sleep(1000);
			con.connect();
			int responseCode = con.getResponseCode();
			System.out.println(responseCode);
			if(responseCode == 200) {
				System.out.println(currentURL+"  is not broken");
			}
			else{
				System.out.println(currentURL+"  is broken");
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("failed");
			}
			return false;
			
		}
		
		//*********************************Send text method******************************
		
		public static boolean sendText(String xpath,String value){
			boolean status = true;
			try{
				driver.findElement(By.xpath(xpath)).clear();
				driver.findElement(By.xpath(xpath)).sendKeys(value);
			System.out.println("Text entered successfully");
			}
			catch(Exception e){
				
			System.out.println("Text not entered");
			
			}
			return false;
			
		}
		
		//*********************************Click element method******************************
		public static boolean clickElement(String xpath){
			boolean status = true;
			try{
				
				driver.findElement(By.xpath(xpath)).click();
			System.out.println("Button clicked ");
			}
			catch(Exception e){
				
			System.out.println("Button not clicked");
			
			}
			return false;
			
		}
		public static boolean textVerify(String linktext){
			boolean status = true;
			try{
				
				driver.findElement(By.linkText(linktext)).isDisplayed();
			System.out.println("Text displayed");
			}
			catch(Exception e){
				
			System.out.println("Text not sdisplayed");
			
			}
			return false;
			
		
}
//********************************Links method******************************
		public static boolean adminLinks(String linktext){
			boolean status = true;
			try{
				
				driver.findElement(By.linkText(linktext)).isDisplayed();
			System.out.println("Text displayed");
			}
			catch(Exception e){
				
			System.out.println("Text not sdisplayed");
			
			}
			return false;
		}
		
		//*********************************Visible Text method******************************
			public static boolean VisibleText(String linktext, String Visible){
				boolean status = true;
				try{
					
				WebElement ele =	driver.findElement(By.linkText(linktext));
				Select sel = new Select(ele);
				sel.deselectByVisibleText(Visible);
				System.out.println("Text Selected");
				
				}
				catch(Exception e){
					
				System.out.println("Text not Selected");
				
				}
				return false;
}

			
			//*********************************Tabs order method******************************
		public static boolean TabsOrder(String listXpath,String options[]) {
			boolean status = true;
			String[] tabs = {"Home","Admin","Staff","Features","Contact Us"};
			
			try{
			List<WebElement> tabslist = driver.findElements(By.xpath(listXpath));
			int a = tabslist.size();
			System.out.println(a);
			
			for(int i=0;i<a;i++){
				String tabsText = tabslist.get(i).getText();
				System.out.println(tabsText);
				
				if(options[i].contentEquals(tabsText))
				{
					System.out.println(tabsText+" is Verified");
				}
			}
			}
			catch(Exception e){
				System.out.println("Tabs not displayed");
			}
			return false;
		}
		
		
//*********************************read data from excel method******************************
		public static String ReadExcelData(String filepath, String sheetname, int rowid,int colid) throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			try {
				FileInputStream fis= new FileInputStream(filepath);
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet s=wb.getSheet(sheetname);
				Row r = s.getRow(rowid);

				Cell c=r.getCell(colid);

				                     if(c.getCellType()==Cell.CELL_TYPE_STRING)
						{
							s1=c.getStringCellValue();
							System.out.println(s1);
							
						}
						else if(c.getCellType()==Cell.CELL_TYPE_NUMERIC)
						{
							s1=String.valueOf(c.getNumericCellValue());
						
							
						}
				                 	System.out.println(s);
				                     
			} catch (Exception e) {
				
				System.out.println("Failed");
			}
			return s1;
		
			
		}
				
	    	        }
