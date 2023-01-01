package com.sgtesting.pocAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginLogout {

	public static WebDriver oBrowser=null;

	@Test(priority = 1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\GitRepository\\DemoWorkSpace\\Web-automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(5000);
			Assert.assertNotNull(oBrowser);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 2)
	private static void navigate()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	private static void closeApp()
	{
		try
		{
			oBrowser.quit();
			oBrowser=null;
			Thread.sleep(2000);
			Assert.assertNull(oBrowser);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3,dataProvider = "login")
	private static void login(String user,String password)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(password);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	private static void minimizeFlyOutWindow()
	{
		try
		{
			String expected,actual;
			expected="Getting Started Shortcuts";
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']"));
			actual=oEle.getText();
			Assert.assertTrue(expected.contains(actual));
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	private static void logout()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@DataProvider(name="login")
	public Object[][] getLogin()
	{
		return new Object[][] {{"admin","manager"}};
	}
}
