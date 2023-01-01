package com.sgtesting.pageobjectmodelassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks {
	public Tasks(WebDriver obrowser) {
		PageFactory.initElements(obrowser ,this);
	}
	
	@FindBy(xpath="//div[text()='Add New']")private WebElement addNewCustomerorproject;
	public WebElement getNewCustomerOrproject() {
		return addNewCustomerorproject;
	}
	@FindBy(xpath = "/html/body/div[14]/div[1]")private WebElement  addcustomer;
	public WebElement getaddcustomer() {
		return addcustomer;
	}
	@FindBy(xpath ="/html/body/div[14]/div[2]")private WebElement  addproject;
	public WebElement getAddproject() {
		return addproject;
	}
	@FindBy(xpath = "//span[text()='Create Customer']")private WebElement  clickcreatecustomer;
	public WebElement getCreateCustomer() {
		return clickcreatecustomer;
	}
	@FindBy(xpath = "//button[text()='-- Please Select Customer to Add Project for  --']")private WebElement   selectcustomerdropdown;
	public WebElement getSelectCustomer() {
		return selectcustomerdropdown;
	}
	@FindBy(xpath = "//*[@id=\"ext-gen114\"]")private WebElement  selectdemocustomer1;
	public WebElement getSelectCustomer1() {
		return selectdemocustomer1;
	}
	@FindBy(xpath = "//span[text()='Create Project']")private WebElement  clickcreateproject;
	public WebElement getCreateProject() {
		return clickcreateproject;
	}
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")private WebElement editCustomer;
	public WebElement getModifycustomer() {
		return editCustomer;
	}
	@FindBy(xpath = "//div[text()='ACTIONS']")private WebElement  actioncustomer;
	public WebElement getAction() { 
		return actioncustomer;
	}
	
	@FindBy(xpath = "//div[text()='Delete']")private WebElement deletecustomer;
	public WebElement getDeleteCustomer() {
		return deletecustomer;
	}
	@FindBy(xpath = "//span[text()='Delete permanently']")private WebElement  deletecustomerpermanently;
	public WebElement getDeletePermanently() {
		return deletecustomerpermanently;
	}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")private WebElement statusCustomer;
	public WebElement getStatuscustomer() {
		return statusCustomer;
	}
	@FindBy(xpath = "//div[text()='Archived']")private WebElement statusarchived;
	public WebElement getStatusArchived() {
		return statusarchived;
	}
	@FindBy(xpath = "//div[text()='Active']")private WebElement  statusactive;
	public WebElement getStatusActive() {
		return statusactive;
	}
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")private WebElement editproject;
	public WebElement getModifyProject() {
		return editproject;
	}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")private WebElement  actionproject;
	public WebElement getActionProject() {
		return actionproject;
	}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")private WebElement   deleteproject;
	public WebElement getDeleteProject() {
		return deleteproject;
	}
	@FindBy(xpath = "//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")private WebElement deleteprojectpermanently;
	public WebElement getDeleteprojectPermanent() {
		return deleteprojectpermanently;
	}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")private WebElement statusProject;
	public WebElement getStatusProject() {
		return statusProject;
	}
	@FindBy(xpath = "//*[@id=\"customerLightBox_nameField\"]")private WebElement customername;
	public WebElement getNameCustomer() {
		
		return customername;
	}
	private WebElement projectDescriptionField;
	public WebElement getDescriptProject() {
		return projectDescriptionField;
	}
	private WebElement projectPopup_projectNameField;
	public WebElement getNameproject() {
		return projectPopup_projectNameField;
	}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")private WebElement closeModify;
	public WebElement getCloseModify() {
		return closeModify;
	}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")private WebElement closeProjectModify;
	public WebElement getCloseprojectModify() {
		return closeProjectModify;
	}
	@FindBy(xpath = "//div[text()='Add New Task']")private WebElement Addnewtask;
	public WebElement getAddnewTask() {
		return Addnewtask;
	}
	@FindBy(xpath = "/html/body/div[13]/div[1]")private WebElement createnewtask;
	public WebElement getCreatenewTask() {
		return createnewtask;
	}
	@FindBy(xpath = "//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")private WebElement  taskName1;
	public WebElement getTaskname1() {
		return taskName1;
}
	@FindBy(xpath = "//span[text()='Create Tasks']")private WebElement  createTasksubmit;
	public WebElement getCreateTaskSubmit() {
		return createTasksubmit ;
}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")private WebElement  Modifydemotask;
	public WebElement getmodifyDemoTask() {
		return Modifydemotask;
}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")private WebElement ActionDemoTask1;
	public WebElement getActionDemotask() {
		return ActionDemoTask1; 
	}

	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")private WebElement DeleteDemoTask1;
	public WebElement getDeleteDemoTask1() {
		return DeleteDemoTask1; 
	}
	@FindBy(xpath = "//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")private WebElement DeleteDemotask1permanent;
	public WebElement getDeleteDemoTask1permanent() {
		return DeleteDemotask1permanent; 
}
}
