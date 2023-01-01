package com.sgtesting.pageobjectmodelassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {


	public DashBoard(WebDriver obrowser) {
		
		PageFactory.initElements(obrowser, this);
	}
	@FindBy(xpath = "//div[text()='USERS']")private WebElement oUsers;
	@FindBy(xpath = "//div[text()='TASKS']")private WebElement oTasks;
	@FindBy(xpath = "//a[text()='Logout']")private WebElement oLogout;


public WebElement getUsers() {
	return oUsers;
}
public WebElement getTasks(){
	return oTasks;
	
}
public WebElement getLogout(){
	return oLogout;
	
}
@FindBy(xpath="//div[text()='Getting Started Shortcuts']") private WebElement MinimizeFlyoutwindow;
public WebElement getminimizewindow() {
	return MinimizeFlyoutwindow;
}
}
