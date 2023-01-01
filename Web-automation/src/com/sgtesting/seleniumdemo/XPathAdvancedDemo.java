package com.sgtesting.seleniumdemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAdvancedDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//findLinksCount();
	//	findDropDownCount();
	//	displayLinkNames();
	//	clickOnLinkBasedOnEndsWithTextContnet();
		//staleElementReferenceDemo();
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
	 * Case 1: Indentify the Elements based on tagName with attributeName
	 * Syntax: //<tagName>[@attributeName]
	 */
	private static void findLinksCount()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		int count=olinks.size();
		System.out.println("# of Links :"+count);
	}

	/**
	 * Case 2: Indentify the Elements based on tagName with attributeName
	 * Syntax: //<tagName>[@attributeName]
	 */
	private static void findDropDownCount()
	{
		List<WebElement> dropdowns=oBrowser.findElements(By.xpath("//select"));
		int count=dropdowns.size();
		System.out.println("# of Drop Downs :"+count);
	}
	
	/**
	 * Case 3: Indentify the Elements based on tagName with attributeName
	 * Syntax: //<tagName>[@attributeName]
	 */
	private static void displayLinkNames()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		Iterator<WebElement> ite=olinks.iterator();
		while(ite.hasNext())
		{
			WebElement link=ite.next();
			String str=link.getText();
			System.out.println(str);
		}
	}
	
	/**
	 * Case 4: Indentify the Elements based on tagName with attributeName
	 * Syntax: //<tagName>[@attributeName]
	 */
	private static void clickOnLinkBasedOnEndsWithTextContnet()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String str=link.getText();
			System.out.println(str);
			if(str.endsWith("Institute"))
			{
				link.click();
				break;
			}
		}
	}
	
	
	/**
	 * Case 4: Stale Element Reference Exception
	 * Syntax: //<tagName>[@attributeName]
	 *  org.openqa.selenium.StaleElementReferenceException: stale element reference: 
	 *  element is not attached to the page document
	 */
	private static void staleElementReferenceDemo()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String str=link.getText();
			System.out.println(str);
			if(str.endsWith("Institute"))
			{
				link.click();
			}
		}
	}
}
