package com.sgtesting.pocAssignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

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
	@Test(priority = 1)
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
	@Test(priority = 2)
	private static void navigate() {
		try {
			String expected,actual;
			expected="actiTIME - Login";
			oBrowser.get("http://localhost/login.do");
			oBrowser.manage().window().maximize();
			Thread.sleep(3000);			
			actual=oBrowser.getTitle();
			Assert.assertEquals(actual,expected);



		}catch (Exception e )
		{
			e.printStackTrace();
		}

	}
	@Test(priority = 3)
	private static void login() {
		try {
			String expected,actual;
		expected="Enter Time-Track";
		oLogin.getUsername().sendKeys("admin");
		oLogin.getPassword().sendKeys("manager");
		oLogin.getlogin().click();
		Thread.sleep(3000);		
		actual=oBrowser.findElement(By.xpath("//*[@id=\"enterTTMainContent\"]/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td")).getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(3000);			
		oDash.getminimizewindow().click();
		Thread.sleep(3000);
		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	private static void logout() {
		try {
			String expected,actual;
			expected="actiTIME - Login";
			oDash.getLogout().click();
			Thread.sleep(3000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(actual,expected);

		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	private static void close() {
		try {
			oBrowser.quit();
			oBrowser=null;
			Assert.assertNull(oBrowser);
		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
}
