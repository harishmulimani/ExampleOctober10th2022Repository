package com.sgtesting.pageobjectimplementationAssignment;
//1. launchBrowser --> navigate --> Login --> CreateUser --> DeleteUser --> Logout--> CloseApplication

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobjectmodelassignments.DashBoard;
import com.sgtesting.pageobjectmodelassignments.LoginPage;

public class Assignment1LoginLogout {
   public static WebDriver oBrowser=null;
   public static LoginPage oLogin=null;
   public static DashBoard oDash=null;
	public static void main(String[] args) {
		launchBrowser();
		 navigate();
		 login();
		 logout();
		 close();
	}
	private static void launchBrowser() {
		try {
			System.setProperty("Webdriver.chrome.driver", "E:\\GitRepository\\DemoWorkSpace\\Web-automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oLogin=new LoginPage(oBrowser);
			oDash=new DashBoard(oBrowser);
		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	private static void navigate() {
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
			Thread.sleep(3000);
	}catch (Exception e )
		{
		e.printStackTrace();
	}
}
	private static void logout() {
		try {
			
			oDash.getLogout().click();
			Thread.sleep(3000);
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
