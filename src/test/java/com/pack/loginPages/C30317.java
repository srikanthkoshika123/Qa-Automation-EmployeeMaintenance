package com.pack.loginPages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class C30317 extends TC_BaseClass {
	WebDriver ldriver;

	public C30317(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//div[@class='JobsForRangeContent-module___jobButtonsContainer___1Je5x']//button[1]")
	WebElement addJob;
	@FindBy(xpath = "//div[@title='Expand All']//button[@type='button']")
	WebElement expandAll;
	@FindBy(xpath = "//div[@class='AddEditJobModal-module___payTypeSelect___3RptZ ant-select ant-select-enabled']")
	WebElement paytype;
	@FindBy(xpath = "//div[@class='AddEditJobModal-module___initialWageContent___IWN61']/div/div[1]/input[1]")
	WebElement weeklyContractHours;
	@FindBy(xpath = "(//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH'])[2]")
	WebElement contractDays;
	@FindBy(xpath = "//label[@class='AddEditJobModal-module___wageCheckbox___TQnIf ant-checkbox-wrapper']//input[@type='checkbox']")
	WebElement ar;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	WebElement clickOk;
	@FindBy(xpath = "//button[@class='ant-btn action-button ant-btn-primary']")
	WebElement refresh;
	@FindBy(xpath = "//div[@row-index='0']/div[@aria-colindex='1']")
	WebElement empName;
	// @FindBy(xpath="//button[@class='ant-btn
	// JobsTab-module___newRangeButton___38XMl']")
	// WebElement addNewEffectiveDate;
	@FindBy(xpath = "//div[@class='ant-modal-root']//span[1]//div[1]//*[name()='svg']")
	WebElement calender;
	@FindBy(xpath = "//div[@class='JobsTab-module___mainContent___3D2Dq']//button[2]")
	WebElement editJob;
	@FindBy(xpath = "//input[contains(@class,'ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH')]")
	WebElement modifyRate;
	@FindBy(xpath = "//button[contains(@class,'ant-btn ant-btn-primary')]")
	WebElement ok;
	@FindBy(xpath = "//div[contains(@class,'JobsTab-module___mainContent___3D2Dq')]//button[3]")
	WebElement deletejob;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath = "//span[text()='Labor']")
	WebElement labor;
	@FindBy(xpath = "//li[@title='Scheduling']")
	WebElement scheduling;
	@FindBy(xpath = "")
	WebElement schedule;
	@FindBy(xpath = "")
	WebElement addShift;

	public void switchFrame() throws InterruptedException {
		driver.switchTo().frame(frame);
	}

	public void clickdate(String empId, String employee, String job) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement searchEmp = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Name or EmpID')]")));
		Thread.sleep(8000);
		// searchEmp.click();
		searchEmp.clear();
		searchEmp.sendKeys(empId);
		Thread.sleep(8000);
		empName.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement jobs = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Jobs']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", jobs);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement addJob = wait3.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='JobsForRangeContent-module___jobButtonsContainer___1Je5x']//button[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addJob);
		WebDriverWait wait5 = new WebDriverWait(driver, 40);
		WebElement expandAll = wait5.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@title='Expand All']//button[@type='button']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandAll);
		WebElement selectEmployee = driver.findElement(By.xpath(employee));
		Coordinates cor = ((Locatable) selectEmployee).getCoordinates();
		cor.inViewPort();
		Thread.sleep(1000);
		selectEmployee.click();
	}

	public void selectpayType(String payType, String hr, String wch, String ch, String annual, String sd, String sAr,
			String Piece) throws InterruptedException {
		paytype.click();
		List<WebElement> allOptions = driver.findElements(By.xpath(
				"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));

		for (int i = 0; i <= allOptions.size() - 1; i++) {
			if (allOptions.get(i).getText().contains(payType)) {
				allOptions.get(i).click();
				break;
			}
		}
		if (payType.equals("Hourly")) {
			WebElement hourly = driver.findElement(By.xpath(
					"//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
			hourly.sendKeys(Keys.CONTROL + "a");
			hourly.sendKeys(Keys.DELETE, hr);
		} else if (payType.equals("Salaried Non Exempt")) {
			weeklyContractHours.sendKeys(Keys.CONTROL + "a");
			weeklyContractHours.sendKeys(Keys.DELETE, wch);
			contractDays.sendKeys(Keys.CONTROL + "a");
			contractDays.sendKeys(Keys.DELETE, ch);
			ar.click();
			WebElement aRate = driver.findElement(By.xpath(
					"//body//div//div[@class='AddEditJobModal-module___initialWageContent___IWN61']//div//div//div[1]//input[1]"));
			aRate.sendKeys(Keys.CONTROL + "a");
			aRate.sendKeys(Keys.DELETE, annual);
		} else if (payType.equals("Salaried Exempt")) {
			WebElement salary = driver.findElement(By.xpath("//div[text()='Salary 8']"));
			salary.click();
			List<WebElement> salaryexempt = driver.findElements(By.xpath(
					"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));

			for (int i = 0; i <= salaryexempt.size() - 1; i++) {
				if (salaryexempt.get(i).getText().contains(sd)) {
					salaryexempt.get(i).click();
					break;
				}
			}
			WebElement ear = driver.findElement(By.xpath(
					"//label[@class='AddEditJobModal-module___wageCheckbox___TQnIf ant-checkbox-wrapper']//input[@type='checkbox']"));
			Thread.sleep(3000);
			ear.click();
			WebElement er = driver.findElement(By.xpath(
					"//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
			er.sendKeys(Keys.CONTROL + "a");
			er.sendKeys(Keys.DELETE, sAr);
		} else if (payType.equals("Piece")) {
			WebElement piece = driver.findElement(By.xpath(
					"//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
			Thread.sleep(2000);
			piece.sendKeys(Piece);
		}
		WebDriverWait wait5 = new WebDriverWait(driver, 40);
		WebElement clickOk = wait5
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickOk);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Job Status Saved']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		String name = element.getText();
		System.out.println(name);
		Assert.assertEquals("Job Status Saved", name);
	}

	public void addNewEffectiveDate(String EmpId) throws InterruptedException {
		driver.switchTo().defaultContent();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement refresh = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='ant-btn action-button ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", refresh);
		driver.switchTo().frame(frame);
		WebDriverWait wait4 = new WebDriverWait(driver, 80);
		WebElement searchEmp = wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Name or EmpID')]")));
		Thread.sleep(8000);
		searchEmp.click();
		searchEmp.clear();
		searchEmp.sendKeys(EmpId);
		Thread.sleep(8000);
		empName.click();
		WebDriverWait wait5 = new WebDriverWait(driver, 80);
		WebElement jobs = wait5
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Jobs']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", jobs);
		WebDriverWait wait3 = new WebDriverWait(driver, 80);
		WebElement addNewEffectiveDate = wait3.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@class='ant-btn JobsTab-module___newRangeButton___38XMl']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addNewEffectiveDate);
		WebElement date = driver
				.findElement(By.xpath("//div[contains(@class,'ant-modal-body')]//div//input[contains(@type,'text')]"));
		date.sendKeys(Keys.CONTROL + "a");
		date.sendKeys(Keys.DELETE);
		date.sendKeys("01/07/2022");
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement create = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", create);
	}

	public boolean retryingFindClick(String jobType) throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				WebElement Searchjob = driver.findElement(By.xpath(jobType));
				Thread.sleep(6000);
				Searchjob.click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void SelectEdit(String payType2, String hr, String annual, String sAr, String Piece)
			throws InterruptedException {
		Thread.sleep(6000);
		editJob.click();
		Thread.sleep(6000);
		paytype.click();
		List<WebElement> allOptions = driver.findElements(By.xpath(
				"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));

		for (int i = 0; i <= allOptions.size() - 1; i++) {
			if (allOptions.get(i).getText().contains(payType2)) {
				allOptions.get(i).click();
				break;
			}
		}
		if (payType2.equals("Hourly")) {
			WebElement hourly = driver.findElement(By.xpath(
					"//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
			hourly.sendKeys(Keys.CONTROL + "a");
			hourly.sendKeys(Keys.DELETE, hr);

		} else if (payType2.equals("Salaried Non Exempt")) {
			WebElement aRate = driver.findElement(By.xpath(
					"//body//div//div[@class='AddEditJobModal-module___initialWageContent___IWN61']//div//div//div[1]//input[1]"));
			aRate.sendKeys(Keys.CONTROL + "a");
			aRate.sendKeys(Keys.DELETE, annual);

		} else if (payType2.equals("Piece")) {
			WebElement piece = driver.findElement(By.xpath(
					"//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
			Thread.sleep(2000);
			piece.sendKeys(Keys.CONTROL + "a");
			piece.sendKeys(Keys.DELETE);
			piece.click();
			piece.clear();
			piece.sendKeys(Piece);

		} else if (payType2.equals("Salaried Exempt")) {
			WebElement er = driver.findElement(By.xpath(
					"//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
			er.sendKeys(Keys.CONTROL + "a");
			er.sendKeys(Keys.DELETE, sAr);

		}

		Thread.sleep(6000);
		ok.click();
	}

	public boolean clickJobType(String jobType) throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				WebElement Searchjob = driver.findElement(By.xpath(jobType));
				Thread.sleep(6000);
				Searchjob.click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void clickDeleteEmp() throws InterruptedException {
		WebDriverWait wait4 = new WebDriverWait(driver, 80);
		WebElement deletejob = wait4.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[contains(@class,'JobsTab-module___mainContent___3D2Dq')]//button[3]")));
		Thread.sleep(6000);
		deletejob.click();
		WebElement yes = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']"));
		Thread.sleep(8000);
		yes.click();

	}

	public void clickAddJob(String job, String jobName) throws InterruptedException {
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement addJob = wait3.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='JobsForRangeContent-module___jobButtonsContainer___1Je5x']//button[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addJob);
		WebDriverWait wait5 = new WebDriverWait(driver, 40);
		WebElement expandAll = wait5.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@title='Expand All']//button[@type='button']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandAll);
		WebElement selectEmployee = driver.findElement(By.xpath(job));
		Coordinates cor = ((Locatable) selectEmployee).getCoordinates();
		cor.inViewPort();
		Thread.sleep(1000);
		selectEmployee.click();
	}

	/*public void selectpayType1(String payType, String hr, String wch, String ch, String annual, String sd, String sAr,
			String Piece) throws InterruptedException {
		paytype.click();
		List<WebElement> allOptions = driver.findElements(By.xpath(
				"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));

		for (int i = 0; i <= allOptions.size() - 1; i++) {
			if (allOptions.get(i).getText().contains(payType)) {
				allOptions.get(i).click();
				break;
			}
		}
		if (payType.equals("Hourly")) {
			WebElement hourly = driver.findElement(By.xpath(
					"//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
			hourly.sendKeys(Keys.CONTROL + "a");
			hourly.sendKeys(Keys.DELETE, hr);

		} else if (payType.equals("Salaried Non Exempt")) {
			weeklyContractHours.sendKeys(Keys.CONTROL + "a");
			weeklyContractHours.sendKeys(Keys.DELETE, wch);
			contractDays.sendKeys(Keys.CONTROL + "a");
			contractDays.sendKeys(Keys.DELETE, ch);
			ar.click();
			WebElement aRate = driver.findElement(By.xpath(
					"//body//div//div[@class='AddEditJobModal-module___initialWageContent___IWN61']//div//div//div[1]//input[1]"));
			aRate.sendKeys(Keys.CONTROL + "a");
			aRate.sendKeys(Keys.DELETE, annual);

		}

		else if (payType.equals("Salaried Exempt")) {
			WebElement salary = driver.findElement(By.xpath("//div[text()='Salary 8']"));
			salary.click();
			List<WebElement> salaryexempt = driver.findElements(By.xpath(
					"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));

			for (int i = 0; i <= salaryexempt.size() - 1; i++) {
				if (salaryexempt.get(i).getText().contains(sd)) {
					salaryexempt.get(i).click();
					break;
				}
			}
			WebElement ear = driver.findElement(By.xpath(
					"//label[@class='AddEditJobModal-module___wageCheckbox___TQnIf ant-checkbox-wrapper']//input[@type='checkbox']"));
			Thread.sleep(3000);
			ear.click();
			WebElement er = driver.findElement(By.xpath(
					"//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
			er.sendKeys(Keys.CONTROL + "a");
			er.sendKeys(Keys.DELETE, sAr);

		} else if (payType.equals("Piece")) {
			WebElement piece = driver.findElement(By.xpath(
					"//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
			Thread.sleep(2000);
			piece.sendKeys(Piece);

		}
		WebDriverWait wait5 = new WebDriverWait(driver, 40);
		WebElement clickOk = wait5
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickOk);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		WebElement close = driver.findElement(
				By.xpath("//div[@class='ant-tabs-nav-container']//div[2]//div[1]//i[@aria-label='icon: close']"));
		close.click();
	}*/

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
		Thread.sleep(4000);
		labor.click();
		Thread.sleep(4000);
		scheduling.click();
	}

	public boolean retryingFindClick() throws InterruptedException {
		driver.switchTo().frame(frame);
		Thread.sleep(6000);
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {

				WebDriverWait wait = new WebDriverWait(driver, 120);
				WebElement ele = wait.until(ExpectedConditions
						.elementToBeClickable(By.cssSelector("div > div >button.ant-dropdown-trigger:nth-child(2)")));
				// div > div >button.ant-dropdown-trigger:nth-child(2)
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
				Actions action = new Actions(driver);
				action.moveToElement(ele).build().perform();
				driver.switchTo().activeElement();
				WebElement das = driver.findElement(By.xpath("//li[text()='Filter by Job']"));
				das.click();
				Thread.sleep(4000);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;

	}

	@SuppressWarnings("deprecation")
	public void selectDateRange(String filterJob, String dynamicName) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn ant-btn-icon-only']/i[@aria-label='icon: minus-square-o']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn ant-btn-icon-only']/i[@aria-label='icon: arrows-alt']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
		@SuppressWarnings("deprecation")
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(filterJob)));
		Coordinates cor = ((Locatable) element2).getCoordinates();
		cor.inViewPort();
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement element4 = wait3.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("button[class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element4);
		WebDriverWait wait6 = new WebDriverWait(driver, 40);
		WebElement date = wait6.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='unifocus-selectdropdown ant-select ant-select-enabled']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", date);
		WebDriverWait wait7 = new WebDriverWait(driver, 40);
		WebElement dateRange = wait7.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='12/25/21 - 1/7/22']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateRange);
		WebDriverWait wait5 = new WebDriverWait(driver, 40);
		WebElement element5 = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='uf-employee-label-container line-clamp'][normalize-space()='" + dynamicName + "']")));
		Coordinates cor1 = ((Locatable) element5).getCoordinates();
		cor1.inViewPort();
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element5);
		String name = element5.getText();
		System.out.println(name);
		Thread.sleep(8000);
	}
}
