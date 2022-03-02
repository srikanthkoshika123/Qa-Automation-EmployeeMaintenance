package com.pack.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class C27504 extends TC_BaseClass {
	WebDriver ldriver;

	public C27504(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus1;
	@FindBy(xpath = "//span[text()='T&A']")
	WebElement tANDa1;
	@FindBy(xpath = "//div[@class='ant-tabs-tab-active ant-tabs-tab']//div//i[@aria-label='icon: close']//*[name()='svg']")
	WebElement close;

	public void clickUnifocus() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement unifocus = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='fa fa-bars header-icon']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", unifocus);
		String un = unifocus.getText();
		System.out.println(un);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement tANDa = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ant-menu-submenu-title']//span[text()='T&A']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", tANDa);
		tANDa.click();
		String sc = tANDa.getText();
		System.out.println(sc);
		Assert.assertEquals("T&A", sc);
	}

	public WebElement clickReviewPayPeriod() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement reviewPayPeriod = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Review Pay Period']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", reviewPayPeriod);
		return reviewPayPeriod;
	}

	public void approveShifts() throws InterruptedException {
		WebElement frame = driver.findElement(By.className("app-iframe"));
		driver.switchTo().frame(frame);

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement approve = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[@class='ant-btn ant-btn-primary']//span[text()='Approve Shifts']")));
		String as = approve.getText();
		System.out.println(as);
		Assert.assertEquals("Approve Shifts", as);
		Thread.sleep(4000);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement reviewPayPeriod = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@row-index='0']//div[@aria-colindex='1']//div[@class='input-cell-content'][normalize-space()='adam']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", reviewPayPeriod);
		driver.switchTo().defaultContent();
		close.click();
	}

	public void whoIsInOut() throws InterruptedException {
		clickUnifocus();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement whoIsInOut = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Who Is In/Out']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", whoIsInOut);
		driver.switchTo().frame(frame);

		/*WebElement Filter = driver.findElement(By.xpath(
				"//span[@class='ant-input-search ant-input-affix-wrapper']//input[@placeholder='Filter by Name or Emp. Id']"));
		String view = Filter.getText();
		System.out.println(view);*/
		WebElement asOf = driver.findElement(By.xpath("//div[contains(text(),'As of: 2/4/22 4:18 AM (CST)')]"));
		String asof = asOf.getText();
		System.out.println(asof);
		Assert.assertEquals("As of: 2/4/22 4:18 AM (CST)", asof);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickAttendancePointsandEvents() throws InterruptedException {
		clickUnifocus();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement attendancePointsandEvents = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Attendance Points and Events']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", attendancePointsandEvents);
		driver.switchTo().frame(frame);

		WebElement addpoint = driver
				.findElement(By.xpath("//div[@class='AttendanceToolbar-module___buttonGroup___22W8J']//button[@type='button']"));
		String add = addpoint.getText();
		System.out.println(add);
		WebElement  events= driver
				.findElement(By.xpath("//span[normalize-space()='Events']"));
		String addEvent = events.getText();
		System.out.println(addEvent);
		WebElement calculateAttendance = driver
				.findElement(By.xpath("//div[3]//div[1]//div[1]//span[1]//button[1]"));
		String  calculate= calculateAttendance.getText();
		System.out.println(calculate);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickBenefits() throws InterruptedException {
		clickUnifocus();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement benefits = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Benefits']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", benefits);
		driver.switchTo().frame(frame);
		WebElement employee = driver.findElement(By.xpath("//h3[@title='Employees']"));
		String  em= employee.getText();
		System.out.println(em);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		close.click();
	}
	public void clickEnterEarnings() throws InterruptedException {
		clickUnifocus();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement enterEarnings = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Enter Earnings']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", enterEarnings);
		driver.switchTo().frame(frame);
		WebElement tipsDeclared = driver.findElement(By.xpath("//div[text()='T - Tips Declared (D)']"));
		String  td= tipsDeclared.getText();
		System.out.println(td);
		WebElement filters = driver
				.findElement(By.xpath("//span[text()='Filters']"));
		String  filter= filters.getText();
		System.out.println(filter);
		WebElement bulkEarnings = driver.findElement(By.xpath("//span[text()='Bulk Earnings']"));
		String  be= bulkEarnings.getText();
		System.out.println(be);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		close.click();
	}
	public void clickHolidayPay() throws InterruptedException {
		clickUnifocus();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement holidayPay = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Holiday Pay']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", holidayPay);
		driver.switchTo().frame(frame);
		WebElement pay = driver.findElement(By.xpath("//h1[text()='Holiday Pay']"));
		String  hp= pay.getText();
		System.out.println(hp);
		WebElement earnings = driver
				.findElement(By.xpath("//span[text()='Apply Earnings']"));
		String  ae= earnings.getText();
		System.out.println(ae);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		close.click();
	}
	public void clickPunchImageReview() throws InterruptedException {
		clickUnifocus();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement punchImageReview = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Punch Image Review']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", punchImageReview);
		driver.switchTo().frame(frame);
		WebElement employees = driver.findElement(By.xpath("//h3[@title='Employees']"));
		String  em= employees.getText();
		System.out.println(em);
		WebElement name = driver
				.findElement(By.xpath("//span[normalize-space()='Name']"));
		String  nameColumn= name.getText();
		System.out.println(nameColumn);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		close.click();
	}
	public void clickApproveEarnings() throws InterruptedException {
		clickUnifocus();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement approveEarnings = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Approve Earnings']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", approveEarnings);
		driver.switchTo().frame(frame);
		WebElement approve = driver.findElement(By.xpath("//span[normalize-space()='Approve All Earnings']"));
		String  ae= approve.getText();
		System.out.println(ae);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		close.click();
	}
}
