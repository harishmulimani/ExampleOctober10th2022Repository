package com.sgtesting.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String args[]) {
		launchBrowser();
		navigate();
		login();
		//closeApplicationn();
	}
	private static void launchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();


		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	private static void navigate() {
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login() {
		try {
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
 private static void closeApplicationn() {
	 try {
	 oBrowser.close();
 }catch (Exception e) {
	 e.printStackTrace();
	 
 }
	 
 }
}
