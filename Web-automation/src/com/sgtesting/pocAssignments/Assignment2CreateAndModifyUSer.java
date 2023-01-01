package com.sgtesting.pocAssignments;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//launchBrowser --> navigate --> Login --> CreateUser -->ModifyUser--> DeleteUser --> Logout--> CloseApplication
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sgtesting.pageobjectmodelassignments.DashBoard;
import com.sgtesting.pageobjectmodelassignments.LoginPage;
import com.sgtesting.pageobjectmodelassignments.Users;

public class Assignment2CreateAndModifyUSer {
	public static WebDriver oBrowser=null;
	public static LoginPage oLogin=null;
	public static DashBoard oDash=null;
	public static Users oUser=null;
	
	@Test(priority = 1)
	private static void launchBrowser() {
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
	@Test(priority = 4,dataProvider = "createuser")
	private static void Createuser(String f1,String l1,String mail,String un,String pwd,String confirmpwd) {
		try {
			String expected,actual;
			expected="User List";
			oDash.getUsers().click();
			Thread.sleep(2000);
			actual=oBrowser.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[1]/div/span")).getText();
			System.out.println(actual);
			Thread.sleep(2000);
			
			oUser.getAdduser().click();
			Thread.sleep(2000);
			oUser.getFirstname().sendKeys(f1);
			Thread.sleep(2000);
			oUser.getEmail().sendKeys(mail);
			oUser.getUserNameField().sendKeys(un);
			oUser.getLastname().sendKeys(l1);
			
			oUser.getPasswordfield().sendKeys(pwd);
			Thread.sleep(2000);
			oUser.getPasswordcopyfield().sendKeys(confirmpwd);
			Thread.sleep(3000);
			oUser.getCreateuser().click();
			Thread.sleep(5000);
			Assert.assertEquals(expected, actual);
			
		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	private static void modifyUser(){
		try {	
			String expected,actual;
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
	@Test(priority = 6)
	private static void deleteuser1() {
		try {
			oUser.getUser1().click();
			Thread.sleep(3000);
			oUser.getDeleteuser().click();
			Thread.sleep(3000);
			Alert oalert=oBrowser.switchTo().alert();
			oalert.accept();
			Thread.sleep(3000);
			WebElement ole=oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/span[2]"));
			Assert.assertTrue(ole.isDisplayed());

		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 7)
	private static void logout() {
		try {
			String expected,actual;
			expected="actiTIME - Login";
			oDash.getLogout().click();
			actual=oBrowser.getTitle();
			Assert.assertEquals(actual,expected);
		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 8)
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
	@DataProvider(name="createuser")
	public Object[][] getUser(){
		return new Object[][] {{"demo1","user1","User@gmail.com","userdemo1","Welcome1","Welcome1"}};

	}
	
}

