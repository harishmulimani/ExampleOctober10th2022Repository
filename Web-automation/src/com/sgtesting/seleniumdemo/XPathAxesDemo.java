package com.sgtesting.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterTheSalaryForSachinTendulkar();
	//	enterTheSalaryForRecordWhichIsNextToSachinTendulkar();
	//	makethestatusactiveforIndianFreeDomFighter();
	//	sachinTendulkarPrevious2ndRecordMaketheStatusasActive();
	//	BasedOntheSalaryTextFieldofRahulDravidGettheTableAttributeValue();
		BasedOntheTableIts4thRecordEnterTheSalary();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///C:/Users/hp/Downloads/xpath_axes_15_dec_2022/WebTableHTML.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *  following-sibling
	 * Case1: Enter the Salary for the Person Name Person Sachin Tendulkar
	 */
	private static void enterTheSalaryForSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}
	
	/**
	 *  following
	 * Case2: Enter the Salary for the record which next to Sachin Tendulkar
	 */
	private static void enterTheSalaryForRecordWhichIsNextToSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("25000");
	}
	
	/**
	 *  preceding-sibling
	 * Case3: Make the status active for IndianFreeDom Fighter
	 */
	private static void makethestatusactiveforIndianFreeDomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	
	/**
	 *  preceding
	 * Case4: From Sachin Tendulkar Previous 2nd Record Make the Status as Active
	 */
	private static void sachinTendulkarPrevious2ndRecordMaketheStatusasActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td/input")).click();
	}
	
	/**
	 *  ancestor
	 * Case5: Based On the Salary Text Field of Rahul Dravid Get the Table Attribute Value
	 */
	private static void BasedOntheSalaryTextFieldofRahulDravidGettheTableAttributeValue()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit3']/ancestor::td/ancestor::tr/ancestor::table"));
		String str=oEle.getAttribute("id");
		System.out.println(str);
	}
	
	/**
	 *  descendant
	 * Case6: Based On the Table Its 4th Record Enter The Salary
	 */
	private static void BasedOntheTableIts4thRecordEnterTheSalary()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("20000");
		
	}
}
