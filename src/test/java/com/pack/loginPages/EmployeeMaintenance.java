package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class EmployeeMaintenance extends TC_BaseClass {
	WebDriver ldriver;
	public EmployeeMaintenance(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  

}
	@FindBy(className="app-iframe")
	WebElement frame;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath="//span[contains(text(),'Administration')]")
    WebElement adminstration;
	@FindBy(xpath="//*[@id=\"MOST_USED_APPS$Menu\"]/li[1]")
	WebElement employeeMaintenance;
	@FindBy(xpath="//span[text()='Labor']")
    WebElement labor;
	@FindBy(xpath="//li[@title='Scheduling']")
    WebElement scheduling;

    public void clickUnifocus(){
	unifocus.click();
	String un =unifocus.getText();
	System.out.println(un);
	Assert.assertEquals("UniFocus", un);
	adminstration.click();
	String sc =adminstration.getText();
	System.out.println(sc);
	Assert.assertEquals("Administration", sc);	
}
   public WebElement getselect_List() {

	employeeMaintenance.click();
	
	return employeeMaintenance;	
}
   
   } 
