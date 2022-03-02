package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class C27647 extends TC_BaseClass{
	WebDriver ldriver;

	public  C27647(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath = "//div[@class='ant-tabs-tab-active ant-tabs-tab']//div//i[@aria-label='icon: close']//*[name()='svg']")
	WebElement close;
	@FindBy(xpath = "//span[text()='Setup']")
	WebElement setup;
	@FindBy(xpath = "//span[text()='Property']")
	WebElement property;
	@FindBy(xpath = "//li[text()='General']")
	WebElement general;
	@FindBy(xpath = "//li[text()='Property Budgeting']")
	WebElement propertybudgeting;
	@FindBy(xpath = "//li[text()='Labor/Scheduler']")
	WebElement laborscheduler;
	@FindBy(xpath = "//li[text()='Property Work Rules']")
	WebElement propertyworkrules;
	
	public void clickUnifocus() {
		unifocus.click();
		String un = unifocus.getText();
		System.out.println(un);
		Assert.assertEquals("UniFocus", un);
		setup.click();
		property.click();
	}
	public void general() {
		general.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement gen= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@title='General']")));
	    String genlabel = gen.getText();
	    System.out.println(genlabel);
		Assert.assertEquals("General",genlabel);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement name= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@title='Name']")));
	    String namelabel = name.getText();
	    System.out.println(namelabel);
		Assert.assertEquals("Name",namelabel);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='General']")).getText());
	}
	public void propertybudgeting() {
		unifocus.click();
		setup.click();
		property.click();
		propertybudgeting.click();
        driver.switchTo().frame(frame);
		
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement pc= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Property Configuration']")));
	    String propconfig = pc.getText();
	    System.out.println(propconfig);
		Assert.assertEquals("Property Configuration",propconfig);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement dp= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@title='Decimal Precision']")));
	    String decpre =dp.getText();
	    System.out.println(decpre);
		Assert.assertEquals("Decimal Precision",decpre);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Property Budgeting']")).getText());
		
	}
	public void laborscheduler() {
		unifocus.click();
		setup.click();
		property.click();
		laborscheduler.click();
		driver.switchTo().frame(frame);
		
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement sched= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Scheduling']")));
	    String scheduling = sched.getText();
		System.out.println(scheduling);
		Assert.assertEquals("Scheduling",scheduling);
				
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement stan= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@title='Standards']")));
	    String standards =stan.getText();
		System.out.println(standards);
		Assert.assertEquals("Standards",standards);
				
		driver.switchTo().defaultContent();
		close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Labor/Scheduler']")).getText());	
	}
	public void propertyworkrules() {
		unifocus.click();
		setup.click();
		property.click();
		propertyworkrules.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement pwrl= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Property Work Rules']")));
	    String pwrlabel = pwrl.getText();
		System.out.println(pwrlabel);
		Assert.assertEquals("Property Work Rules",pwrlabel);
				
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement rt= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Rule Type']")));
	    String ruletype =rt.getText();
		System.out.println(ruletype);
		Assert.assertEquals("Rule Type",ruletype);
				
		driver.switchTo().defaultContent();
		close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Property Work Rules']")).getText());	
	}
}

