package com.pack.loginPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

@SuppressWarnings("deprecation")
public class C33193 extends TC_BaseClass {
	WebDriver ldriver;

	public C33193(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath = "//div[@row-index='0']/div[@aria-colindex='1']")
	WebElement empName;
	@FindBy(xpath = "//div[contains(@class,'ant-col ant-col-9')]//div[1]//div[2]//div[1]//span[1]//span[1]//input[1]")
	WebElement startTime;
	@FindBy(xpath = "//div[contains(@class,'ant-col ant-col-9')]//div[2]//div[2]//div[1]//span[1]//span[1]//input[1]")
	WebElement endTime;

	public void switchFrame() throws InterruptedException {
		driver.switchTo().frame(frame);
	}

	public void selectEmployee() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		WebElement searchEmp = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Name or EmpID')]")));
		Thread.sleep(8000);
		// searchEmp.click();
		searchEmp.clear();
		searchEmp.sendKeys("Adam");
		Thread.sleep(6000);
		empName.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement job = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Jobs']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", job);
	}

	public void addJob() {
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement addJob = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Add Job']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addJob);
	}

	public void selectAutoJob2() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		WebElement searchJob = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
		Thread.sleep(6000);
		searchJob.clear();
		searchJob.sendKeys("Auto Div1");
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement selectjob = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='Expand All']//button")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectjob);
		Thread.sleep(6000);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement autoJob2 = wait1.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@row-index='3']/div/span/span[4]/div/div/label")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", autoJob2);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement save = wait3
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", save);

	}

	public boolean selectAutoJob3() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				addJob();
				WebDriverWait wait = new WebDriverWait(driver, 180);
				WebElement searchJob = wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
				Thread.sleep(6000);
				searchJob.clear();
				searchJob.sendKeys("Auto Div1");
				WebDriverWait wait2 = new WebDriverWait(driver, 40);
				WebElement selectjob = wait2
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='Expand All']//button")));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectjob);
				Thread.sleep(6000);
				WebDriverWait wait1 = new WebDriverWait(driver, 40);
				WebElement autoJob3 = wait1.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//div[@row-index='4']/div/span/span[4]/div/div/label")));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", autoJob3);
				WebDriverWait wait3 = new WebDriverWait(driver, 40);
				WebElement save = wait3.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", save);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void selectCertifications() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement job = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[9]//span[normalize-space()='Certifications']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", job);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement addNewCertification = wait2.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Add New Certification']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addNewCertification);
	}

	public void clickDropDown() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement certDropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//form[@class='ant-form ant-form-horizontal AddEditCertificationModal-module___AddEditCertificationModalForm___yuZDO']/div[1]/div[2]/div/div/div")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", certDropDown);
		List<WebElement> allOptions = driver.findElements(By.xpath(
				"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));

		for (int i = 0; i <= allOptions.size() - 1; i++) {
			if (allOptions.get(i).getText().contains("A")) {
				Thread.sleep(2000);
				allOptions.get(i).click();
				break;

			}
		}
	}

	public void selectIssueDate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement issueDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class,'ant-modal-body')]//div[2]//div[2]//div[1]//div[1]//div[1]//span[1]//span[1]//input[1]")));
		issueDate.sendKeys(Keys.CONTROL + "a");
		issueDate.sendKeys(Keys.DELETE);
		issueDate.sendKeys("12/25/2021");
		Thread.sleep(2000);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement startDate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class,'ant-modal-root')]//div[3]//div[2]//div[1]//div[1]//div[1]//span[1]//span[1]//input[1]")));
		startDate.sendKeys(Keys.CONTROL + "a");
		startDate.sendKeys(Keys.DELETE);
		startDate.sendKeys("1/25/2022");
		Thread.sleep(2000);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement add = wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", add);

	}

	public void clickAutocert1Ellipsis() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement autocert1Ellipsis = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//button[@class='ant-btn ant-btn-sm']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", autocert1Ellipsis);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement startDate = wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[4]//div[2]//div[1]//div[1]//div[1]//span[1]//span[1]//input[1]")));
		startDate.sendKeys(Keys.CONTROL + "a");
		startDate.sendKeys(Keys.DELETE);
		startDate.sendKeys("1/25/2022");
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement update = wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", update);

	}

	public void clickAutocert2() throws InterruptedException {
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement addNewCertification = wait2.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Add New Certification']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addNewCertification);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement certDropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//form[@class='ant-form ant-form-horizontal AddEditCertificationModal-module___AddEditCertificationModalForm___yuZDO']/div[1]/div[2]/div/div/div")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", certDropDown);
		List<WebElement> allOptions = driver.findElements(By.xpath(
				"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));

		for (int i = 0; i <= allOptions.size() - 1; i++) {
			if (allOptions.get(i).getText().contains("B")) {
				Thread.sleep(2000);
				allOptions.get(i).click();
				break;

			}
		}

	}

	public void clickAutocert2Ellipsis() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement autocert1Ellipsis = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='CertificationTab-module___CertificationCards___3QbNa']//div[2]//div[1]//div[1]//div[2]//button[1]//*[name()='svg']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", autocert1Ellipsis);

		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement delete = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//button[contains(@class,'ant-btn AddEditCertificationModal-module___deleteButton___1dwlN ant-btn-primary')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", delete);

		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement clickOk = wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickOk);

	}

	public void clickAdd() throws InterruptedException {
		clickAutocert2();
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement add = wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[contains(@class,'ant-btn ant-btn-primary')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", add);
	}

	public void clickUnifocus() throws InterruptedException {
		driver.switchTo().defaultContent();
		WebElement close = driver.findElement(
				By.xpath("//div[@class='ant-tabs-nav-container']//div[2]//div[1]//i[@aria-label='icon: close']"));
		close.click();
		driver.switchTo().defaultContent();
		unifocus.click();
		String un = unifocus.getText();
		System.out.println(un);
		Assert.assertEquals("UniFocus", un);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement labor = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Labor']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", labor);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement scheduling = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Scheduling']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", scheduling);
		driver.switchTo().frame(frame);
	}

	public boolean retryingFindClick() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {

				WebDriverWait wait = new WebDriverWait(driver, 120);
				WebElement ele = wait.until(ExpectedConditions
						.elementToBeClickable(By.cssSelector("div > div >button.ant-dropdown-trigger:nth-child(2)")));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
				Actions action = new Actions(driver);
				action.moveToElement(ele).build().perform();
				driver.switchTo().activeElement();
				WebElement das = driver.findElement(By.xpath("//li[text()='Filter by Job']"));
				Thread.sleep(4000);
				das.click();
				WebDriverWait wait1 = new WebDriverWait(driver, 40);
				WebElement element = wait1.until(ExpectedConditions.elementToBeClickable(By
						.xpath("//button[@class='ant-btn ant-btn-icon-only']/i[@aria-label='icon: minus-square-o']")));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	@SuppressWarnings("deprecation")
	public void selectFilterJobButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		WebElement searchEmp = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Find By Name')]")));
		Thread.sleep(8000);
		// searchEmp.click();
		searchEmp.clear();
		searchEmp.sendKeys("Auto Job2");
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		eventFiringWebDriver.executeScript(
				"document.querySelector('div[style=\"height: 85%; width: 100%; display: flex; flex-direction: column; overflow: auto; margin-top: 8px;\"]').scrollTop=1200");
	}

	public void selectAutoAssignmnt1() throws InterruptedException {
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement autoAssinment1 = wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//ul[@role='tree']/li[20]/ul/li/ul/li/ul/li[1]/span[2]/span[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", autoAssinment1);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement ok = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ok);
	}

	public boolean doubleClickEmptyCell() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				driver.switchTo().activeElement();
				Actions action = new Actions(driver);
				WebElement code = driver.findElement(By.xpath(
						"//div[@class='ScheduleDayRenderer-module___Container___4hrfB ScheduleDayRenderer-module___SelectedDayColorBackground___3EPtY']//div[@class='ScheduleDayRenderer-module___ShiftStyle___1ce_v ScheduleDayRenderer-module___ExpandedDay___15Fhx']"));
				action.moveToElement(code).doubleClick().build().perform();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}
	public void selectStartTime() throws InterruptedException{
		Thread.sleep(4000);
		startTime.sendKeys("8:00AM");
		endTime.sendKeys("4:00PM");
		List<WebElement> allOptions = driver.findElements(By.xpath(
				"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));

		for (int i = 0; i <= allOptions.size() - 1; i++) {
			if (allOptions.get(i).getText().contains("Auto Job3")) {
				Thread.sleep(2000);
				allOptions.get(i).click();
				break;

			}
		}
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement save = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", save);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement ok = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ok);
	}
	
}
