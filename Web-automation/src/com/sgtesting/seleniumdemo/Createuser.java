package com.sgtesting.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createuser {
	public static WebDriver obrowser=null;
	public static void main(String args[]) {
		LaunchBrowse();
		navigate();
		login();
		Minimizeflyoutwindow();
		UserCreation();
	}
	private static void LaunchBrowse() {
		try{
			System.setProperty("webdriber.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-automation\\Library\\Drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void navigate() {
		try{
			obrowser.get("http://localhost/login.do");
			Thread.sleep(2000);

		}catch (Exception e){
			e.printStackTrace();
		}

	}
	private static void login() {
		try{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Minimizeflyoutwindow() {
		try {
			obrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void UserCreation() {
		try {
			obrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
