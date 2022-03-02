package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class C27506 extends TC_BaseClass {
	WebDriver ldriver;

	public C27506(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath = "//span[contains(text(),'Administration')]")
	WebElement Adminstration;
	@FindBy(xpath = "//li[@title='Audits']")
	WebElement Audits;
	@FindBy(xpath = "//ul[@id='ADMIN$Menu']//li[@title='Employee Maintenance']")
	WebElement EmployeeMaintenance;
	@FindBy(xpath = "//*[@id='ADMIN$Menu']/li[4]")
	WebElement useradminstration;
	@FindBy(xpath = "//li[@title='Task Scheduler Setup']")
	WebElement taskschedulersetup;
	@FindBy(xpath = "//li[@title='Task Scheduler Log']")
	WebElement taskschedulerlog;
	@FindBy(xpath = "//ul[@id='ADMIN$Menu']//li[@title='My Processes']")
	WebElement MyProcesses;
	@FindBy(xpath = "//div[@class='ant-tabs-tab-active ant-tabs-tab']//div//i[@aria-label='icon: close']//*[name()='svg']")
	WebElement close;
	
	public void clickUnifocus() {
		unifocus.click();
		String un = unifocus.getText();
		System.out.println(un);
		Assert.assertEquals("UniFocus", un);
		driver.manage().window().maximize();
		Adminstration.click();
	}

	public void audit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement Audits = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//li[@title='Audits']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Audits);
		driver.switchTo().frame(frame);
		WebDriverWait wait1 = new WebDriverWait(driver, 120);
		WebElement filter = wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[@class='ant-btn audit-main-filter-button ant-btn-primary']")));
		String un = filter.getText();
		System.out.println(un);
		Assert.assertEquals("Filters", un);

		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		WebElement excel = wait2
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Export to Excel']")));
		String ex = excel.getText();
		System.out.println(ex);
		Assert.assertEquals("Export to Excel", ex);
        Thread.sleep(4000);
		driver.switchTo().defaultContent();
		close.click();

	}

	public void employeeMaintenance() throws InterruptedException {
		clickUnifocus();
		EmployeeMaintenance.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement addNew = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Add New']")));
		String add = addNew.getText();
		System.out.println(add);
		Assert.assertEquals("Add New", add);

		WebDriverWait wait1 = new WebDriverWait(driver, 120);
		WebElement general = wait1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='General']")));
		String ge = general.getText();
		System.out.println(ge);
		Assert.assertEquals("General", ge);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement Audits = wait2.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn uf-actionbar-menu-button ant-dropdown-trigger uf-actionbar-dropdown']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Audits);
		Thread.sleep(2000);
		WebDriverWait wait4 = new WebDriverWait(driver, 40);
		WebElement reconcileEmployees = wait4.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//li[normalize-space()='Reconcile Employees']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", reconcileEmployees);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement EmpClose = wait3.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div/div/section/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/i")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", EmpClose);
		driver.switchTo().frame(frame);
		WebDriverWait wait7 = new WebDriverWait(driver, 120);
		WebElement rec = wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Reconcile']")));
		String recbutton = rec.getText();
		System.out.println(recbutton);
		Assert.assertEquals("Reconcile", recbutton);
		
		WebDriverWait wait5 = new WebDriverWait(driver, 120);
		WebElement lrec = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Last Reconcile']")));
		String lastrecbutton = lrec.getText();
		System.out.println(lastrecbutton);
		Assert.assertEquals("Last Reconcile",lastrecbutton);
		
		WebDriverWait wait6 = new WebDriverWait(driver, 120);
		WebElement ewe = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Employees with Errors']")));
		String ewerrors = ewe.getText();
		System.out.println(ewerrors);
		Assert.assertEquals("Employees with Errors",ewerrors);
		driver.switchTo().defaultContent();
		close.click();
	}
	public void EditPayRates() throws InterruptedException {
		clickUnifocus();
		EmployeeMaintenance.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement Audits = wait2.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn uf-actionbar-menu-button ant-dropdown-trigger uf-actionbar-dropdown']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Audits);
		Thread.sleep(2000);
		WebDriverWait wait4 = new WebDriverWait(driver, 40);
		WebElement editPayRates = wait4.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//li[normalize-space()='Edit Pay Rates']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", editPayRates);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement EmpClose = wait3.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div/div/section/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/i")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", EmpClose);
		driver.switchTo().frame(frame);
		WebDriverWait wait16 = new WebDriverWait(driver, 120);
		WebElement brad = wait16.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Bulk Rate Adjustment']")));
		String bradbutton = brad.getText();
		System.out.println(bradbutton);
		Assert.assertEquals("Bulk Rate Adjustment",bradbutton);
		
		WebDriverWait wait15 = new WebDriverWait(driver, 120);
		WebElement cr = wait15.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Current Rate']")));
		String crbutton = cr.getText();
		System.out.println(crbutton);
		Assert.assertEquals("Current Rate", crbutton);
		
		driver.switchTo().defaultContent();
		close.click();
	}
	public void manageEmployeeBadges() throws InterruptedException {
		clickUnifocus();
		EmployeeMaintenance.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement Audits = wait2.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn uf-actionbar-menu-button ant-dropdown-trigger uf-actionbar-dropdown']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Audits);
		Thread.sleep(2000);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement manageEmployeeBadge = wait3.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//li[normalize-space()='Manage Employee Badges']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", manageEmployeeBadge);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		WebDriverWait wait4 = new WebDriverWait(driver, 40);
		WebElement EmpClose = wait4.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div/div/section/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/i")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", EmpClose);
		/*
		WebDriverWait wait16 = new WebDriverWait(driver, 120);
		WebElement adb = wait16.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='EmployeeBadgesScreen-module___toolbarLeft___15crt']//div[1]//button[1]")));
		String adbbutton = adb.getText();
		System.out.println(adbbutton);
		Assert.assertEquals(" Add Badge",adbbutton);
		
		WebDriverWait wait15 = new WebDriverWait(driver, 120);
		WebElement en = wait15.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Manage Badges']")));
		String empname = en.getText();
		System.out.println(empname);
		Assert.assertEquals("Manage Badges", empname);
		*/
		Thread.sleep(20000);
		driver.switchTo().defaultContent();
		close.click();
	}
	public void useradminstration() throws InterruptedException {
    	unifocus.click();
    	Adminstration.click();
    	useradminstration.click();
    	driver.switchTo().frame(frame);
    	WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement uacc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='User Accounts']")));
		String useracc = uacc.getText();
		System.out.println(useracc);
		Assert.assertEquals("User Accounts",useracc);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 120);
		WebElement aub = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[3]/div[2]/div/div/div/div/button")));
		String adduserbut = aub.getText();
		Assert.assertEquals(true,aub.isDisplayed());
		System.out.println("add button is displayed");
		
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		WebElement lid = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Login ID']")));
		String loginid = lid.getText();
		System.out.println(loginid);
		Assert.assertEquals("Login ID",loginid);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement mg = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/*[name()='svg'][1]")));
		Thread.sleep(4000);
		mg.click();
		
	}
	public void manageGroup() throws InterruptedException {
		
		WebDriverWait wait4 = new WebDriverWait(driver, 120);
		WebElement ug = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='User Group']")));
		String usergroup = ug.getText();
		System.out.println(usergroup);
		Assert.assertEquals("User Group",usergroup);
		
		WebDriverWait wait5 = new WebDriverWait(driver, 120);
		WebElement cg = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[3]/div[3]/div/div[1]/div/span[1]")));
		String createuserbut = cg.getText();
		Assert.assertEquals(true,cg.isDisplayed());
		System.out.println("create button is displayed");
		
		WebDriverWait wait6 = new WebDriverWait(driver, 120);
		WebElement g = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Group']")));
		String group = g.getText();
		System.out.println(group);
		Assert.assertEquals("Group",group);
		driver.switchTo().defaultContent();
        close.click();    	
    }
	public void taskschedulersetup() throws InterruptedException {
		unifocus.click();
    	Adminstration.click();
    	WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement taskschedulersetup = wait3.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//li[normalize-space()='Task Scheduler Setup']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", taskschedulersetup);
		
    	driver.switchTo().frame(frame);
    	WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement ct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create Task']")));
		String createtask= ct.getText();
		System.out.println(createtask);
		Assert.assertEquals("Create Task",createtask);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 120);
		WebElement ob = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@title='Order by']")));
		String orderby= ob.getText();
		System.out.println(orderby);
		Assert.assertEquals("Order by",orderby);
		
		WebDriverWait wait2= new WebDriverWait(driver, 120);
		WebElement st = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@title='Scheduled Tasks']")));
		String stasks= st.getText();
		System.out.println(stasks);
		Assert.assertEquals("Scheduled Tasks",stasks);
		driver.switchTo().defaultContent();
		close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Task Scheduler Setup']")).getText());
    	
	}
	public void taskschedulerlog() throws InterruptedException{
		clickUnifocus();
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement taskschedulerlog = wait3.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//li[normalize-space()='Task Scheduler Log']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", taskschedulerlog);
		driver.switchTo().frame(frame);
		WebDriverWait wait16 = new WebDriverWait(driver, 120);
		WebElement asf = wait16.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ant-radio-group ant-radio-group-outline list-type-radio-group']")));
		String asfail= asf.getText();
		Assert.assertEquals(true,asf.isDisplayed());
		System.out.print("all success failure are displayed");
		/*
		WebDriverWait wait17 = new WebDriverWait(driver, 120);
		WebElement cb = wait17.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@title='Created by']")));
		String createdby= cb.getText();
		System.out.println(createdby);
		Assert.assertEquals("Created by",createdby);
		*/
		WebDriverWait wait19 = new WebDriverWait(driver, 120);
		WebElement at = wait19.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@title='All Tasks']")));
		String atasks= at.getText();
		System.out.println(atasks);
		Assert.assertEquals("All Tasks",atasks);
		driver.switchTo().defaultContent();
		close.click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Task Scheduler Log']")).getText());
		
	}
	
	public void myProcesses() throws InterruptedException {
		clickUnifocus();
		MyProcesses.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement mps = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='My Processes']")));
		String processes = mps.getText();
		System.out.println(processes);
		Assert.assertEquals("My Processes", processes);
		Thread.sleep(4000);
	}
}
