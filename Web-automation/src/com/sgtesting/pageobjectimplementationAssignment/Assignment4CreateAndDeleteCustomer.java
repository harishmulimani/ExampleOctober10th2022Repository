package com.sgtesting.pageobjectimplementationAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobjectmodelassignments.DashBoard;
import com.sgtesting.pageobjectmodelassignments.LoginPage;
import com.sgtesting.pageobjectmodelassignments.Tasks;

//4. launchBrowser --> navigate --> Login --> Create Customer --> delete Customer --> Logout --> CloseApplication
public class Assignment4CreateAndDeleteCustomer {
	public static WebDriver oBrowser=null;
	public static LoginPage oLogin=null;
	public static DashBoard oDash=null;
	public static Tasks oTask=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login() ;
		createcustomer();
		deleteCustomer();
		logout();
		close();
	}
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
	private static void createcustomer() {
		try {
			oDash.getTasks().click();
			Thread.sleep(3000);
			oTask.getNewCustomerOrproject().click();
			oTask.getaddcustomer().click();
			Thread.sleep(3000);
			oTask.getNameCustomer().sendKeys("Democustomer");
			Thread.sleep(3000);
			oTask.getCreateCustomer().click();
			Thread.sleep(3000);

		}catch (Exception e )
		{
			e.printStackTrace();
		}

	}
	private static void deleteCustomer() {
		try {
			oTask.getModifycustomer().click();
			Thread.sleep(3000);
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
			oBrowser.close();
		}catch (Exception e )
		{
			e.printStackTrace();
		}
	}

}
