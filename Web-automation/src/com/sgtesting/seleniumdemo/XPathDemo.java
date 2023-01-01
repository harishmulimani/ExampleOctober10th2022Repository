package com.sgtesting.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		absoluteXPath();
	//	relativeXPathUsingTagName();
	//	relativeXPathUsingTagNameWithIndex();
	//	relativeXPathUsingTagNameWithAttributeNameAndValue();
	//	relativeXPathUsingAttributeNameAndValue();
	//	relativeXPathUsingAttributeValueAlone();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameAndValue();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameAndValueWithAndOperator();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameAndValueWithOROperator();
	//	relativeXPathUsingPartialMatchingOfAttributeValue();
	//	relativeXPathUsingTextContent();
		//relativeXPathUsingPartialMatchingOfTextContent();
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
			oBrowser.get("file:///E:/ExampleAutomation/Xpath/Sample.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void absoluteXPath()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 1: Identify the element based on tagName
	 * Syntax: //<tagName>
	 */
	private static void relativeXPathUsingTagName()
	{
	//	oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
		oBrowser.findElement(By.xpath("//a")).click();
	}
	
	/**
	 * case 2: Identify the element based on tagName with index
	 * Syntax: //<tagName>[index]
	 */
	private static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 3: Identify the element based on tagName with 
	 * attribute name and attribute value combination
	 * Syntax: //<tagname>[@attributename='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
	/**
	 * case 4: Identify the element based on irrespective of tagName with 
	 * attribute name and attribute value combination
	 * Syntax: //*[@attributename='attributevalue']
	 */
	private static void relativeXPathUsingAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
	}
	
	/**
	 * case 5: Identify the element based on attribute value alone
	 * 
	 * Syntax: //*[@*='attributevalue']
	 */
	private static void relativeXPathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
	}

	/**
	 * case 6: Identify the element based on tagName with multiple
	 * attribute name and attribute value combination
	 * Syntax: //<tagName>[@attributename1='attributevalue1'][@attributename2='attributevalue2']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit'][@name='submit1btn1']")).click();
	}
	
	/**
	 * case 7: Identify the element based on tagName with multiple
	 * attribute name and attribute value combination using and operator
	 * Syntax: //<tagName>[@attributename1='attributevalue1' and @attributename2='attributevalue2']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameAndValueWithAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' and @name='submit1btn1']")).click();
	}
	
	/**
	 * case 8: Identify the element based on tagName with multiple
	 * attribute name and attribute value combination using or operator
	 * Syntax: //<tagName>[@attributename1='attributevalue1' or @attributename2='attributevalue2']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameAndValueWithOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' or @name='submit1btn1']")).click();
	}
	
	/**
	 * case 9: Identify the element based on partial matching of attribute value
	 *         starts-with(@attributename,'partial attribute value')
	 *         ends-with(@attributename,'partial attribute value')
	 *         contains(@attributename,'partial attribute value')
	 * Syntax1: //<tagname>[starts-with(@attributename,'partial attribute value')]
	 * Syntax1: //<tagname>[ends-with(@attributename,'partial attribute value')]
	 * Syntax1: //<tagname>[contains(@attributename,'partial attribute value')]
	 */
	private static void relativeXPathUsingPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.xpath("//input[starts-with(@id,'chk1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'win')]")).click();
	}
	
	/**
	 * case 10: Identify the element based on text Content 
	 * 
	 * Syntax: //<tagname>[text()='text content']
	 */
	private static void relativeXPathUsingTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='POI Apache']")).click();
	}
	
	/**
	 * case 11: Identify the element based on partial matching of text content
	 *         starts-with(text(),'partial text content')
	 *         ends-with(text(),'partial text content')
	 *         contains(text(),'partial text content')
	 * Syntax1: //<tagname>[starts-with(text(),'partial text content')]
	 * Syntax1: //<tagname>[ends-with(text(),'partial text content')]
	 * Syntax1: //<tagname>[contains(text(),'partial text content')]
	 */
	private static void relativeXPathUsingPartialMatchingOfTextContent()
	{
	//	oBrowser.findElement(By.xpath("//a[starts-with(text(),'S G')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'Software')]")).click();
	}
}
