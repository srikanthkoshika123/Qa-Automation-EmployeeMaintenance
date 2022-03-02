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
@SuppressWarnings("deprecation")
public class C27648 extends TC_BaseClass{
	WebDriver ldriver;

	public C27648(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath = "//div[@class='ant-tabs-tab-active ant-tabs-tab']//div//i[@aria-label='icon: close']//[name()='svg']//[name()='path' and contains(@d,'M563.8 512')]")
	WebElement close;
	@FindBy(xpath = "//span[text()='Setup']")
	WebElement setup;
	@FindBy(xpath = "//span[text()='Employee']")
	WebElement employee;
	@FindBy(xpath = "//li[text()='Certifications']")
	WebElement certifications;
	@FindBy(xpath = "//li[text()='Employee Classes']")
	WebElement ec;
	@FindBy(xpath = "//li[text()='Employee Field Overrides']")
	WebElement efo;
	@FindBy(xpath = "//li[text()='Employee Sets']")
	WebElement es;
	@FindBy(xpath = "//li[text()='Employee User Maps']")
	WebElement eum;
	@FindBy(xpath = "//li[text()='Employee Work Classes']")
	WebElement ewc;
	@FindBy(xpath = "//li[text()='Local Taxes']")
	WebElement lt;
	@FindBy(xpath = "//li[text()='Salary Distributions']")
	WebElement sd;
	@FindBy(xpath = "//li[text()='Schedule Groups']")
	WebElement sg;
	@FindBy(xpath = "//li[text()='States']")
	WebElement states;
	@FindBy(xpath = "//li[text()='Status Change Reasons']")
	WebElement scr;
	@FindBy(xpath = "//li[text()='Tax Types']")
	WebElement tt;
	@FindBy(xpath = "//li[text()='Time Off Types']")
	WebElement tot;
	
	public void clickUnifocus() {
		unifocus.click();
		String un = unifocus.getText();
		System.out.println(un);
		Assert.assertEquals("UniFocus", un);
		setup.click();
		employee.click();
	}
	public void Certifications() {
		certifications.click();
        driver.switchTo().frame(frame);
		
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement addb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-tri-area-inner-left']//button[@type='button']")));
	    String addbutton = addb.getText();
	    System.out.println(addbutton);
		Assert.assertEquals("Add Row",addbutton);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement cname= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Certification Name']")));
	    String certiname = cname.getText();
	    System.out.println(certiname);
		Assert.assertEquals("Certification Name",certiname);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Certifications']")).getText());
	}
	public void EmployeeClasses() {
		clickUnifocus();
		ec.click();
		driver.switchTo().frame(frame);
		
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement addb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-tri-area-inner-left']//button[@type='button']")));
	    String addbutton = addb.getText();
	    System.out.println(addbutton);
		Assert.assertEquals("Add Row",addbutton);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement n= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Name']")));
	    String name = n.getText();
	    System.out.println(name);
		Assert.assertEquals("Name",name);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Employee Classes']")).getText());
	}
	public void EmployeeFieldOverrides() {
		clickUnifocus();
		efo.click();
		driver.switchTo().frame(frame);
		
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement sf= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Standard Fields']")));
	    String standfields = sf.getText();
	    System.out.println(standfields);
		Assert.assertEquals("Standard Fields",standfields);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement fn= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Field Name']")));
	    String fieldname = fn.getText();
	    System.out.println( fieldname);
		Assert.assertEquals("Field Name", fieldname);
		
		driver.switchTo().defaultContent();
		WebElement close=driver.findElement(By.xpath("//div[@class='ant-tabs-tab-active ant-tabs-tab']//div//i[@aria-label='icon: close']//[name()='svg']//[name()='path' and contains(@d,'M563.8 512')]"));
		close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Employee Field Overrides']")).getText());
	}
	public void EmployeeSets() {
		clickUnifocus();
		es.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement addb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-border-panel-left']//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//button[1]//[name()='svg']//[name()='path' and contains(@fill,'currentCol')]")));
	    String addbutton = addb.getText();
		Assert.assertEquals(true,addb.isDisplayed());
		System.out.println("add button is displayed");
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement delb= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-border-panel-left']//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//button[2]")));
	    String delbutton = delb.getText();
		Assert.assertEquals(true,delb.isDisplayed());
		System.out.println("delete button is displayed");
		
		WebDriverWait wait2= new WebDriverWait(driver, 120);
		WebElement es= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Employee Sets']")));
	    String empsets = es.getText();
	    System.out.println( empsets);
		Assert.assertEquals("Employee Sets", empsets);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Employee Sets']")).getText());
	}
	public void EmployeeUserMaps() {
		clickUnifocus();
		eum.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement m= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Mapped']")));
	    String mapped = m.getText();
	    System.out.println(mapped);
		Assert.assertEquals("Mapped",mapped);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement s= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Select']")));
	    String select = s.getText();
	    System.out.println( select);
		Assert.assertEquals("Select", select);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Employee User Maps']")).getText());
	}
	public void EmployeeWorkClasses() {
		clickUnifocus();
		ewc.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement addb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Row']")));
	    String addbutton = addb.getText();
	    System.out.println(addbutton);
		Assert.assertEquals("Add Row",addbutton);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement n= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Name']")));
	    String name = n.getText();
	    System.out.println( name);
		Assert.assertEquals("Name", name);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Employee Work Classes']")).getText());
	}
	public void LocalTaxes() {
		clickUnifocus();
		lt.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement addb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Row']")));
	    String addbutton = addb.getText();
	    System.out.println(addbutton);
		Assert.assertEquals("Add Row",addbutton);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement n= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Name']")));
	    String name = n.getText();
	    System.out.println( name);
		Assert.assertEquals("Name", name);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Local Taxes']")).getText());
	}
	public void SalaryDistributions() {
		clickUnifocus();
		sd.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement addb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-border-panel-left']//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//button[1]//[name()='svg']//[name()='path' and contains(@fill,'currentCol')]")));
	    String addbutton = addb.getText();
		Assert.assertEquals(true,addb.isDisplayed());
		System.out.println("add button is displayed");
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement d= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Details']")));
	    String details = d.getText();
	    System.out.println(details);
		Assert.assertEquals("Details",details);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Salary Distributions']")).getText());
	}
	public void ScheduleGroups() {
		clickUnifocus();
		sg.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement addb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Row']")));
	    String addbutton = addb.getText();
	    System.out.println(addbutton);
		Assert.assertEquals("Add Row",addbutton);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement n= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Name']")));
	    String name = n.getText();
	    System.out.println( name);
		Assert.assertEquals("Name",name);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Schedule Groups']")).getText());
	}
	public void States() {
		clickUnifocus();
		states.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement addb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Row']")));
	    String addbutton = addb.getText();
	    System.out.println(addbutton);
		Assert.assertEquals("Add Row",addbutton);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement n= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Name']")));
	    String name = n.getText();
	    System.out.println( name);
		Assert.assertEquals("Name", name);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='States']")).getText());
	}
	public void StatusChangeReasons() {
		clickUnifocus();
		scr.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement addb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Row']")));
	    String addbutton = addb.getText();
	    System.out.println(addbutton);
		Assert.assertEquals("Add Row",addbutton);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement n= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Name']")));
	    String name = n.getText();
	    System.out.println( name);
		Assert.assertEquals("Name", name);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Status Change Reasons']")).getText());
	}
	public void TaxTypes() {
		clickUnifocus();
		tt.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement addb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Row']")));
	    String addbutton = addb.getText();
	    System.out.println(addbutton);
		Assert.assertEquals("Add Row",addbutton);
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement n= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Name']")));
	    String name = n.getText();
	    System.out.println( name);
		Assert.assertEquals("Name", name);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Tax Types']")).getText());		
	}
	public void TimeOffTypes() {
		clickUnifocus();
		tot.click();
		driver.switchTo().frame(frame);
		
		WebDriverWait wait= new WebDriverWait(driver, 120);
		WebElement addb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uf-border-panel-left']//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//button[1]//[name()='svg']//[name()='path' and contains(@fill,'currentCol')]")));
	    String addbutton = addb.getText();
		Assert.assertEquals(true,addb.isDisplayed());
		System.out.println("add button is displayed");
		
		WebDriverWait wait1= new WebDriverWait(driver, 120);
		WebElement d= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Details']")));
	    String details = d.getText();
	    System.out.println(details);
		Assert.assertEquals("Details", details);
		
		driver.switchTo().defaultContent();
        close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Time Off Types']")).getText());
		
	}	
}

