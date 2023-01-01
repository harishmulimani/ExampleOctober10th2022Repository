package com.sgtesting.pocAssignments;
import org.openqa.selenium.By;
//launchBrowser --> navigate --> Login --> Create Customer -->Modify Customer --> delete Customer --> Logout --> CloseApplication
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sgtesting.pageobjectmodelassignments.DashBoard;
import com.sgtesting.pageobjectmodelassignments.LoginPage;
import com.sgtesting.pageobjectmodelassignments.Tasks;

public class Assignment5ModifyCustomer {

	public static WebDriver oBrowser=null;
	public static LoginPage oLogin=null;
	public static DashBoard oDash=null;
	public static Tasks oTask=null;
	@Test(priority = 1)
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
			actual=oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[1]/a")).getText();
			Thread.sleep(3000);			
			oDash.getminimizewindow().click();
			Thread.sleep(3000);

		}catch (Exception e )
		{
			e.printStackTrace();
		}

	}	@Test(priority = 4)
	private static void createcustomer() {
		try {
			oDash.getTasks().click();
			Thread.sleep(3000);
			WebElement ole=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			oTask.getNewCustomerOrproject().click();
			oTask.getaddcustomer().click();
			Thread.sleep(3000);
			oTask.getNameCustomer().sendKeys("Democustomer");
			Thread.sleep(3000);
			oTask.getCreateCustomer().click();
			Thread.sleep(3000);
			Assert.assertTrue(ole.isDisplayed());

		}catch (Exception e )
		{
			e.printStackTrace();
		}

	}
	@Test(priority = 5)
	private static void Modifycustomer() {
		try {
			oTask.getModifycustomer().click();
			Thread.sleep(3000);
			Assert.assertTrue(oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).isDisplayed());
			oTask.getStatuscustomer().click();
			Thread.sleep(3000);
			oTask.getStatusArchived().click();
			oTask.getCloseModify().click();
			Thread.sleep(3000);
			Assert.assertTrue(oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]/span")).isDisplayed());
			Thread.sleep(5000);

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	private static void deleteCustomer() {
		try {
			oTask.getModifycustomer().click();
			Thread.sleep(3000);
			Assert.assertTrue(oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).isDisplayed());
			oTask.getAction().click();
			Thread.sleep(3000);
			oTask.getDeleteCustomer().click();
			Thread.sleep(3000);
			oTask.getDeletePermanently().click();
			Thread.sleep(3000);


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
			Thread.sleep(3000);
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

}



