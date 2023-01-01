package com.sgtesting.seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobjectmodelassignments.DashBoard;
import com.sgtesting.pageobjectmodelassignments.LoginPage;
import com.sgtesting.pageobjectmodelassignments.Tasks;


public class PageobjectmodelDemo {
	public static WebDriver obrowser=null;
	public static Actitime opage=null;
	public static LoginPage ologin=null;
	public static DashBoard odash=null;
	public static Tasks     otask=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate() ;
		login();
		//close();
	}
private static void launchBrowser() {
 	try {
		System.setProperty("webdriver.Crome.driver", "E:\\ExampleAutomation\\Automation\\Web-automation\\Library\\Drivers\\chromedriver.exe");
		obrowser=new ChromeDriver();
		opage=new Actitime(obrowser);
		ologin=new LoginPage(obrowser);
		odash=new  DashBoard(obrowser);
		 otask=new Tasks(obrowser);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
private static void navigate() {
	try {
		obrowser.navigate().to("http://localhost/login.do");
		
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	
}
private static void login() {
	try {
		opage.getUsername().sendKeys("admin");
		Thread.sleep(3000);
		opage.getpassword().sendKeys("manager");
	    ologin.getlogin().click();
		Thread.sleep(3000);
		opage.getminimizewindow().click();
		Thread.sleep(2000);
	  odash.getUsers().click();
	  odash.getTasks().click();
	  otask.getNewCustomerOrproject().click();otask.getaddcustomer().click();otask.getNameCustomer().sendKeys("demo");
		
	}catch (Exception  e) {
		e.printStackTrace();
	}
}
private static void close() {
	try {
		opage.getlogout().click();
		Thread.sleep(2000);
		obrowser.quit();
}catch (Exception e)
	{
	
	e.printStackTrace();
	}
}
}
