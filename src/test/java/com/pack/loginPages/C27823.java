package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.testCases.TC_BaseClass;

public class C27823  extends TC_BaseClass {
	WebDriver ldriver;
	public C27823(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  		
	
}
	@FindBy(xpath="//span[contains(text(),'Setup')]")
    WebElement setup;
	@FindBy(xpath="//span[contains(text(),'Employee')]")
	WebElement employee;
	@FindBy(xpath="//li[@title='Employee Field Overrides']")
	WebElement employeeFieldOverrides;
	@FindBy(xpath="//div[@row-index='0'][@aria-rowindex='2'][@row-id='79']/div[3]/div/label/span/input")
	WebElement empl;
	@FindBy(xpath="//div[@row-index='1'][@aria-rowindex='3'][@row-id='87']/div[4]/div/label/span/input")
	WebElement emailRequired;
	@FindBy(xpath="//div[@row-index='17'][@aria-rowindex='19'][@row-id='112']/div[4]/div/label/span/input")
	WebElement tippedRequired;
    public void clickEmployeeFieldOverrides(){
	 setup.click();
	 employee.click();
	 employeeFieldOverrides.click();	  
	  }
	  public void switchToFrame() throws InterruptedException {
	  WebElement frame =driver.findElement(By.className("app-iframe"));
	  driver.switchTo().frame(frame);
	  if(empl.getAttribute("checked") == null) {         
	  Thread.sleep(3000);
	  empl.click();
	     }
	  }
	  public void checkEmailAdderss() throws InterruptedException {
	  WebElement email =driver.findElement(By.xpath("//div[@row-index='1'][@aria-rowindex='3'][@row-id='87']/div[3]/div/label/span/input"));
	  if(email.getAttribute("checked") == null) {
	  Thread.sleep(5000);
	  email.click();
	  }
	  if(emailRequired.getAttribute("checked") == null) {
	  Thread.sleep(3000);
	  emailRequired.click();
	  }    	
	  }
	  public void checkTipped() throws InterruptedException {
	  WebElement tipped =driver.findElement(By.xpath("//div[@row-index='17'][@aria-rowindex='19'][@row-id='112']/div[3]/div/label/span/input"));
	   if(tipped .getAttribute("checked") == null) {
	   Thread.sleep(5000);
	   tipped .click();
	  }
	  if(tippedRequired.getAttribute("checked") == null) {
	  Thread.sleep(3000);
	  tippedRequired.click();
	  }    	
	  }
	  public void checkHoursAvaliable() throws InterruptedException {
	  WebElement hoursAvaliable =driver.findElement(By.xpath("//div[@row-index='21'][@aria-rowindex='23'][@row-id='94']/div[3]/div/label/span/input"));
	  if(hoursAvaliable .getAttribute("checked") == null) {
	  Thread.sleep(5000);
	  hoursAvaliable .click();
	  Thread.sleep(5000);
	  }
	  }
}
