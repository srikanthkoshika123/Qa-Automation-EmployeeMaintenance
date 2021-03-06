package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.testCases.TC_BaseClass;

public class DoubleClick extends TC_BaseClass{
	WebDriver ldriver;
	public DoubleClick(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  		
	
}
	@FindBy(className="app-iframe")
	WebElement frame;
	@FindBy(xpath="//div[@row-index='0']/div[@aria-colindex='1']")
	WebElement empName;
	@FindBy(xpath="//div[contains(@class,'ant-col ant-col-9')]//div[1]//div[2]//div[1]//span[1]//span[1]//input[1]")
	WebElement startTime;
	@FindBy(xpath="//div[contains(@class,'ant-col ant-col-9')]//div[2]//div[2]//div[1]//span[1]//span[1]//input[1]")
	WebElement endTime;
	
	public void switchFrame() throws InterruptedException {
		driver.switchTo().frame(frame);
		}
	public void selectEmployee() throws InterruptedException {
		 WebDriverWait wait=new WebDriverWait(driver, 180);
		 WebElement searchEmp= wait.until(
		 ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Name or EmpID')]")));
		Thread.sleep(8000);
		searchEmp.click();
		searchEmp.clear();
		searchEmp.sendKeys("Adam");
		Thread.sleep(6000);
		empName.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
	    WebElement scheduling = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Certifications']"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", scheduling);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement addNewCertification = wait3.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Add New Certification']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addNewCertification);
		
		
	}
	public void selectEmployeeType() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		 WebElement employeeType = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/div/div/div/span/span/span/div"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", employeeType);
		
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		 WebElement regular = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'???')]"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", regular);
		 WebDriverWait wait3 = new WebDriverWait(driver, 40);
		 WebElement jobName = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", jobName);
		 Thread.sleep(4000);
}
	 public void clickJobType() throws InterruptedException {
	   
	}
	 public void clickEmptyCell() throws InterruptedException {
		
		
	}
}
