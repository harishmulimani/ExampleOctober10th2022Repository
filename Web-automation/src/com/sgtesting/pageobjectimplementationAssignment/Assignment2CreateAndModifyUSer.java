package com.sgtesting.pageobjectimplementationAssignment;
import org.openqa.selenium.Alert;
//launchBrowser --> navigate --> Login --> CreateUser -->ModifyUser--> DeleteUser --> Logout--> CloseApplication
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobjectmodelassignments.DashBoard;
import com.sgtesting.pageobjectmodelassignments.LoginPage;
import com.sgtesting.pageobjectmodelassignments.Users;

public class Assignment2CreateAndModifyUSer {
	public static WebDriver oBrowser=null;
	public static LoginPage oLogin=null;
	public static DashBoard oDash=null;
	public static Users oUser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		Createuser();
		modifyUser();
		deleteuser1();
		logout();
		close();

	}
	private static void launchBrowser(){
		try {
			System.setProperty("Webdriver.chrome.driver", "E:\\GitRepository\\DemoWorkSpace\\Web-automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oLogin=new LoginPage(oBrowser);
			oDash=new DashBoard(oBrowser);
			oUser=new Users(oBrowser);
		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	private static void navigate(){
		try {
			oBrowser.get("http://localhost/login.do");
			oBrowser.manage().window().maximize();
			Thread.sleep(3000);			

		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	private static void login() {
		try {
			oLogin.getUsername().sendKeys("admin");
			oLogin.getPassword().sendKeys("manager");
			oLogin.getlogin().click();
			Thread.sleep(3000);			
			oDash.getminimizewindow().click();
			Thread.sleep(5000);
		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	private static void Createuser() {
		try {
			oDash.getUsers().click();
			Thread.sleep(2000);
			oUser.getAdduser().click();
			Thread.sleep(2000);
			oUser.getFirstname().sendKeys("demo1");
			Thread.sleep(2000);
			oUser.getLastname().sendKeys("user1");
			oUser.getEmail().sendKeys("demo1@gmail.com");
			oUser.getUserNameField().sendKeys("demo1User1");
			oUser.getPasswordfield().sendKeys("Welcome1");
			Thread.sleep(2000);
			oUser.getPasswordcopyfield().sendKeys("Welcome1");
			Thread.sleep(3000);
			oUser.getCreateuser().click();
			Thread.sleep(5000);


		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser(){
		try {	
			oUser.getUser1().click();
			Thread.sleep(2000);
			oUser.getEmail().clear();
			Thread.sleep(5000);
			oUser.getEmail().sendKeys("user1@gmail.com");
			Thread.sleep(4000);
			oUser.getSavechanges().click();
			Thread.sleep(3000);
		}
		catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser1() {
		try {
			oUser.getUser1().click();
			Thread.sleep(3000);
			oUser.getDeleteuser().click();
			Thread.sleep(3000);
			Alert oalert=oBrowser.switchTo().alert();
			oalert.accept();
			Thread.sleep(3000);

		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}

	private static void logout() {
		try {

			oDash.getLogout().click();

		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	private static void close() {
		try {
			oBrowser.quit();
		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
}

