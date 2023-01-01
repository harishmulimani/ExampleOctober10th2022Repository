package com.sgtesting.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutUsingChroMeBrowser {
	public static WebDriver obrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		Login();
		minimmizeflyoutwindow();
		logout();
		exitBrowser();
	}



	private static void launchBrowser(){

		try {
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-automation\\Library\\Drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
			Thread.sleep(5000);


		}catch (Exception e)
		{
			e.printStackTrace();
		}
			

	}
	private static void navigate() {

		try {
			obrowser.get("http://localhost/login.do");
			Thread.sleep(5000);


		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login() {


		try {
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);


		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void  minimmizeflyoutwindow(){


		try {
			obrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();
			Thread.sleep(2000);


		}catch (Exception e)
		{
			e.printStackTrace();
		}
	
	}
	
	
	private static void logout() {
		try {
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void exitBrowser() {
try {
		obrowser.quit();
		Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	}

