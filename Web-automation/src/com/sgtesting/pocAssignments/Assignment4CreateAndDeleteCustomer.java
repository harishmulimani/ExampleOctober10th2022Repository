package com.sgtesting.pocAssignments;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.sgtesting.pageobjectmodelassignments.DashBoard;
import com.sgtesting.pageobjectmodelassignments.LoginPage;
import com.sgtesting.pageobjectmodelassignments.Tasks;

//4. launchBrowser --> navigate --> Login --> Create Customer --> delete Customer --> Logout --> CloseApplication
public class Assignment4CreateAndDeleteCustomer {
	public static WebDriver oBrowser=null;
	public static LoginPage oLogin=null;
	public static DashBoard oDash=null;
	public static Tasks oTask=null;

	@Test(priority =1 )
	private static void launchBrowser() {
		try {
			System.setProperty("Webdriver.chrome.driver", "E:\\GitRepository\\DemoWorkSpace\\Web-automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oLogin=new LoginPage(oBrowser);
			oDash=new DashBoard(oBrowser);
			oTask=new Tasks(oBrowser);

		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}
	@Test(priority =2 )
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
	@Test(priority =3 )
	private static void login() {
		try {
			String expected,actual;
			expected="Enter Time-Track";
			oLogin.getUsername().sendKeys("admin");
			oLogin.getPassword().sendKeys("manager");
			oLogin.getlogin().click();
			Thread.sleep(3000);	
			actual=oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[1]/a")).getText();
			Assert.assertEquals(expected, actual);
			Thread.sleep(3000);			
			oDash.getminimizewindow().click();
			Thread.sleep(3000);
		}catch (Exception e )
		{
			e.printStackTrace();
		}

	}
	@Test(priority =4,dataProvider = "createcustomer")
	private static void createcustomer(String c1 ) {
		try {
			oDash.getTasks().click();
			Thread.sleep(3000);
			WebElement ole=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			oTask.getNewCustomerOrproject().click();
			oTask.getaddcustomer().click();
			Thread.sleep(3000);
			oTask.getNameCustomer().sendKeys(c1);
			Thread.sleep(3000);
			oTask.getCreateCustomer().click();
			Thread.sleep(3000);
			Assert.assertTrue(ole.isDisplayed());

		}catch (Exception e )
		{
			e.printStackTrace();
		}

	}
	@Test(priority =5)
	private static void deleteCustomer() {
		try {
			oTask.getModifycustomer().click();
			Thread.sleep(3000);
			Assert.assertTrue(oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).isDisplayed());
			oTask.getAction().click();
			Thread.sleep(3000);

			Thread.sleep(3000);
			oTask.getDeleteCustomer().click();
			Thread.sleep(3000);
			oTask.getDeletePermanently().click();
			Thread.sleep(3000);


		}catch (Exception e )
		{
			e.printStackTrace();
		}

	}@Test(priority =6)
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
	@Test(priority =7)
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

	@DataProvider(name="createcustomer")
	public Object[] getUser(){
		return new Object[] {"democustomer"};

	}
}
