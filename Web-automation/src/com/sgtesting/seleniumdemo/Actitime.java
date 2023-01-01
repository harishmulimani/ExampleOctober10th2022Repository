package com.sgtesting.seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime {
	public Actitime(WebDriver obrowser) 
	{
	PageFactory.initElements(obrowser,this);
		
	}
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	private WebElement pwd;
	public WebElement getpassword() {
		return pwd;
	}
@FindBy(xpath = "//div[text()='Login ']")
private WebElement ologin;
public WebElement getlogin() {
	return ologin;
}
@FindBy(linkText = "Logout")private WebElement ologout;
public WebElement getlogout() {
	return ologout;
}
@FindBy(xpath="//div[text()='Getting Started Shortcuts']") private WebElement MinimizeFlyoutwindow;
public WebElement getminimizewindow() {
	return MinimizeFlyoutwindow;
}
}
