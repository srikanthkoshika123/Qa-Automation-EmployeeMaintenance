package com.pack.budgeting;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

@SuppressWarnings("deprecation")
public class C33388 extends TC_BaseClass {
	WebDriver ldriver;

	public C33388(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath = "//div[@class='ant-tabs-tab-active ant-tabs-tab']//div//i[@aria-label='icon: close']")
	WebElement close;
	@FindBy(xpath = "//span[text()='Financial']")
	WebElement financial;
	@FindBy(xpath = "//li[text()='Budgeting']")
	WebElement budgeting;

	public void selectDataBase() {
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement clickDB = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//button[@class='ant-btn database-chooser-button singularity-button-no-box-shadow ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickDB);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement doral = wait2.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[normalize-space()='Doral Golf Resort and Spa - this is an example ofm']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", doral);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement ok = wait3
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-primary']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ok);
		WebDriverWait wait4 = new WebDriverWait(driver, 120);
		WebElement rms = wait4
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='RMS Modern']")));
		rms.click();
	}

	public void clickUnifocus() {
		WebDriverWait wait1 = new WebDriverWait(driver, 120);
		WebElement unifocus = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//header/div[1]/div[1]/div[1]/button[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", unifocus);
		String un = unifocus.getText();
		System.out.println(un);
		Assert.assertEquals("UniFocus", un);
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement financial = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Financial']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", financial);
	}

	public void budgeting() {
		WebDriverWait wait1 = new WebDriverWait(driver, 120);
		WebElement budgeting = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Budgeting']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", budgeting);

		driver.switchTo().frame(frame);
		WebDriverWait wait8 = new WebDriverWait(driver, 120);
		WebElement wd = wait8
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@title='Working Dataset']")));
		String workingdataset = wd.getText();
		System.out.println(workingdataset);
		Assert.assertEquals("Working Dataset", workingdataset);

		WebDriverWait wait9 = new WebDriverWait(driver, 120);
		WebElement perioddd = wait9
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@title='Period']")));
		String total = perioddd.getText();
		System.out.println(total);
		Assert.assertEquals("Period", total);

		WebDriverWait wait10 = new WebDriverWait(driver, 120);
		WebElement refviewdd = wait10
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@title='Reference View']")));
		String refviewdropdown = refviewdd.getText();
		System.out.println(refviewdropdown);
		Assert.assertEquals("Reference View", refviewdropdown);

		WebDriverWait wait13 = new WebDriverWait(driver, 120);
		WebElement o = wait13
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Occupancy']")));
		String occupancy = o.getText();
		System.out.println(occupancy);
		Assert.assertEquals("Occupancy", occupancy);

		WebDriverWait wait14 = new WebDriverWait(driver, 120);
		WebElement adr = wait14.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='ADR']")));
		String ADR = adr.getText();
		System.out.println(ADR);
		Assert.assertEquals("ADR", ADR);

		WebDriverWait wait15 = new WebDriverWait(driver, 120);
		WebElement r = wait15.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='REVPAR']")));
		String revpar = r.getText();
		System.out.println(revpar);
		Assert.assertEquals("REVPAR", revpar);

		// widget 2

		WebDriverWait wait16 = new WebDriverWait(driver, 120);
		WebElement tor = wait16
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Total Occupied Rooms']")));
		String totaloccromms = tor.getText();
		System.out.println(totaloccromms);
		Assert.assertEquals("Total Occupied Rooms", totaloccromms);

		WebDriverWait wait17 = new WebDriverWait(driver, 120);
		WebElement ar = wait17
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Available Rooms']")));
		String availablerooms = ar.getText();
		System.out.println(availablerooms);
		Assert.assertEquals("Available Rooms", availablerooms);

		WebDriverWait wait18 = new WebDriverWait(driver, 120);
		WebElement toor = wait18.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[text()='Total Occupied Rooms (Trend Line)']")));
		String totaloccurooms = toor.getText();
		System.out.println(totaloccurooms);
		Assert.assertEquals("Total Occupied Rooms (Trend Line)", totaloccurooms);

		WebDriverWait wait30 = new WebDriverWait(driver, 120);
		WebElement avr = wait30.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[text()='Available Rooms (Trend Line)']")));
		String availrooms = avr.getText();
		System.out.println(availrooms);
		Assert.assertEquals("Available Rooms (Trend Line)", availrooms);

	}

	public void periodDropDown() {
		WebDriverWait wait20 = new WebDriverWait(driver, 120);
		WebElement perioddropdown = wait20
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Total']")));
		Actions a = new Actions(driver);
		a.moveToElement(perioddropdown).click().build().perform();
		driver.switchTo().activeElement();

		List<WebElement> e = driver.findElements(By.xpath(
				"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
		int itemCount = e.size();

		for (int i = 0; i < itemCount; i++) {
			System.out.println(e.get(i).getText());
		}
	}

	public void referenceViewDropdown() {
		WebDriverWait wait21 = new WebDriverWait(driver, 120);
		WebElement refdropdown = wait21
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Default']")));
		Actions a = new Actions(driver);
		a.moveToElement(refdropdown).click().build().perform();
		driver.switchTo().activeElement();

		List<WebElement> e = driver.findElements(By.xpath(
				"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
		int itemCount = e.size();

		for (int i = 0; i < itemCount; i++) {
			System.out.println(e.get(i).getText());
		}
	}

	public void addConfigure() {
		WebDriverWait wait21 = new WebDriverWait(driver, 120);
		WebElement refdropdown = wait21
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Default']")));
		Actions a = new Actions(driver);
		a.moveToElement(refdropdown).click().build().perform();
		driver.switchTo().activeElement();

		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement addorconfig = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Add or Configure']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addorconfig);

		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement rd = wait2.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//section/div/div[1]/div/div/div/div/div[1]/div[2]/div/span/span/input")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", rd);

		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		WebElement y = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='2020']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", y);

		WebDriverWait wait4 = new WebDriverWait(driver, 40);
		WebElement original = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Original']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", original);

		WebDriverWait wait11 = new WebDriverWait(driver, 40);
		WebElement savebutton = wait11
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Save']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", savebutton);

	}

	public void Delete() {
		WebDriverWait wait21 = new WebDriverWait(driver, 120);
		WebElement refdropdown = wait21
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Default']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", refdropdown);

		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement addorconfig = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Add or Configure']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addorconfig);

		WebDriverWait wait13 = new WebDriverWait(driver, 120);
		WebElement ard = wait13.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[2]/div[1]/div/div/div/div//button[@class='ant-btn ant-btn-icon-only']")));

		WebDriverWait wait12 = new WebDriverWait(driver, 40);
		WebElement savebutton = wait12
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Save']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", savebutton);
	}

	public boolean retryingFindClick() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {

				WebDriverWait wait = new WebDriverWait(driver, 40);
				WebElement spa = wait.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//*[@id='root']/div/section/section/section/main/div/div/div/section/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[7]/td/div")));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", spa);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void AddNew() throws InterruptedException {
		WebDriverWait wait21 = new WebDriverWait(driver, 120);
		WebElement refdropdown = wait21
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Default']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", refdropdown);

		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement addorconfig = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Add or Configure']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addorconfig);

		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement addnew = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add New']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addnew);

		WebDriverWait wait12 = new WebDriverWait(driver, 40);
		WebElement viewName = wait12
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='ant-input']")));
		 Thread.sleep(2000);
		viewName.sendKeys("test new view");
		Thread.sleep(2000);
		WebDriverWait wait11 = new WebDriverWait(driver, 40);
		WebElement save = wait11.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", save);
        Thread.sleep(3000);
        WebDriverWait wait2 = new WebDriverWait(driver, 40);
		WebElement addReferenceDataset = wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@placeholder='Add Reference Dataset']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addReferenceDataset);
		
		 Thread.sleep(4000);
	}

	
		public void selectReferenceDataSet() throws InterruptedException {
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					WebElement dataSet =driver.findElement(By.xpath("//ul//li[text()='2019']"));
					 Thread.sleep(18000);
					dataSet.click();
					
					WebElement original =driver.findElement(By.xpath("//div//ul[2]//li[3]"));
					 Thread.sleep(6000);
					original.click();
					WebDriverWait wait11 = new WebDriverWait(driver, 40);
					WebElement savebutton = wait11
							.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Save']")));
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", savebutton);
					
		}
		
	public void DeletingAddNew() {
		WebDriverWait wait21 = new WebDriverWait(driver, 120);
		WebElement refdropdown = wait21
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Default']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", refdropdown);
		driver.switchTo().activeElement();

		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement addorconfig = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Add or Configure']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addorconfig);

		WebDriverWait wait15 = new WebDriverWait(driver, 40);
		WebElement delete = wait15.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[5]/div/div[2]/div/div[2]/div[2]/section/div/div[1]/div/div/div/div/span/button")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", delete);

		WebDriverWait wait13 = new WebDriverWait(driver, 120);
		WebElement t = wait13.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[text()='Are you sure you want to delete this view?']")));
		String text = t.getText();
		System.out.println(text);
		Assert.assertEquals("Are you sure you want to delete this view?", text);

		WebDriverWait wait11 = new WebDriverWait(driver, 40);
		WebElement ok = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='OK']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ok);

		WebDriverWait wait18 = new WebDriverWait(driver, 40);
		WebElement save = wait18.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Save']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", save);

		WebDriverWait wait22 = new WebDriverWait(driver, 120);
		WebElement refdropdown1 = wait22
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Default']")));
		refdropdown1.click();

		List<WebElement> e = driver.findElements(By.xpath(
				"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
		int itemCount = e.size();

		for (int i = 0; i < itemCount; i++) {
			System.out.println(e.get(i).getText());
		}

	}

	public void ExpandingSideMenu() {
		WebDriverWait wait22 = new WebDriverWait(driver, 120);
		WebElement expand = wait22
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ant-layout-sider-trigger']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", expand);

		List<WebElement> e = driver
				.findElements(By.xpath("//ul[@class='ant-menu ant-menu-dark ant-menu-root ant-menu-inline']/li"));
		int itemCount = e.size();

		for (int i = 0; i < itemCount; i++) {
			System.out.println(e.get(i).getText());
		}

		WebDriverWait wait9 = new WebDriverWait(driver, 120);
		WebElement d = wait9
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dashboard']")));
		String dashboard = d.getText();
		System.out.println(dashboard);
		Assert.assertEquals("Dashboard", dashboard);

		WebDriverWait wait10 = new WebDriverWait(driver, 120);
		WebElement kbi = wait10
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='KBI Projections']")));
		String kbiprojections = kbi.getText();
		System.out.println(kbiprojections);
		Assert.assertEquals("KBI Projections", kbiprojections);

		WebDriverWait wait13 = new WebDriverWait(driver, 120);
		WebElement ahr = wait13.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Adjust Hours and Rates']")));
		String adjusthoursrates = ahr.getText();
		System.out.println(adjusthoursrates);
		Assert.assertEquals("Adjust Hours and Rates", adjusthoursrates);

		WebDriverWait wait14 = new WebDriverWait(driver, 120);
		WebElement b = wait14
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Budget Tree']")));
		String budgettree = b.getText();
		System.out.println(budgettree);
		Assert.assertEquals("Budget Tree", budgettree);

		WebDriverWait wait15 = new WebDriverWait(driver, 120);
		WebElement bc = wait15.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Budget Configuration']")));
		String budgetconfig = bc.getText();
		System.out.println(budgetconfig);
		Assert.assertEquals("Budget Configuration", budgetconfig);

		WebDriverWait wait19 = new WebDriverWait(driver, 120);
		WebElement bu = wait19
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Budget Utilities']")));
		String budgetutilities = bu.getText();
		System.out.println(budgetutilities);
		Assert.assertEquals("Budget Utilitiess", budgetutilities);

	}

	public void BudgetConfiguration() {

		WebDriverWait wait15 = new WebDriverWait(driver, 120);
		WebElement bc = wait15.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Budget Configuration']")));
		bc.click();

		WebDriverWait wait22 = new WebDriverWait(driver, 120);
		WebElement budgetConfiguration = wait22.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Budget Configuration']")));
		budgetConfiguration.click();
		driver.switchTo().activeElement();
		List<WebElement> e = driver.findElements(By.xpath(
				"//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
		int itemCount = e.size();

		for (int i = 0; i < itemCount; i++) {
			System.out.println(e.get(i).getText());
		}

		WebDriverWait wait13 = new WebDriverWait(driver, 120);
		WebElement c = wait13.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Charts']")));
		String charts = c.getText();
		System.out.println(charts);
		Assert.assertEquals("Charts", charts);

		WebDriverWait wait14 = new WebDriverWait(driver, 120);
		WebElement bs = wait14
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Budget Structure']")));
		String budgetstructure = bs.getText();
		System.out.println(budgetstructure);
		Assert.assertEquals("Budget Structure", budgetstructure);

		WebDriverWait wait19 = new WebDriverWait(driver, 120);
		WebElement fe = wait19.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Full Time Equivalent']")));
		String fulltimeequivalent = fe.getText();
		System.out.println(fulltimeequivalent);
		Assert.assertEquals("Full Time Equivalent", fulltimeequivalent);

	}

	public void BudgetUtilities() {

		WebDriverWait wait19 = new WebDriverWait(driver, 120);
		WebElement bu = wait19
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Budget Utilities']")));
		bu.click();

		WebDriverWait wait13 = new WebDriverWait(driver, 120);
		WebElement cd = wait13
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Copy Dataset']")));
		String copydataset = cd.getText();
		System.out.println(copydataset);
		Assert.assertEquals("Copy Dataset", copydataset);

		WebDriverWait wait14 = new WebDriverWait(driver, 120);
		WebElement ed = wait14
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Export Dataset']")));
		String ExportDataset = ed.getText();
		System.out.println(ExportDataset);
		Assert.assertEquals("Export Dataset", ExportDataset);

		WebDriverWait wait15 = new WebDriverWait(driver, 120);
		WebElement ibl = wait15
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Import Budget Lines']")));
		String ImportBudgetLines = ibl.getText();
		System.out.println(ImportBudgetLines);
		Assert.assertEquals("Import Budget Lines", ImportBudgetLines);

		WebDriverWait wait16 = new WebDriverWait(driver, 120);
		WebElement cleard = wait16
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Clear Dataset']")));
		String ClearDataset = cd.getText();
		System.out.println(ClearDataset);
		Assert.assertEquals("Clear Dataset", ClearDataset);

		WebDriverWait wait20 = new WebDriverWait(driver, 120);
		WebElement rcs = wait20.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Rebuild Cost Structures']")));
		String RebuildCostStructures = rcs.getText();
		System.out.println(RebuildCostStructures);
		Assert.assertEquals("Rebuild Cost Structures", RebuildCostStructures);

		driver.switchTo().defaultContent();
		close.click();

	}

}
