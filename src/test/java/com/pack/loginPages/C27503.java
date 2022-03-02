package com.pack.loginPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

public class C27503 extends TC_BaseClass {
	WebDriver ldriver;

	public C27503(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(className = "app-iframe")
	WebElement frame;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath = "//div[@class='ant-tabs-tab-active ant-tabs-tab']//div//i[@aria-label='icon: close']//*[name()='svg']")
	WebElement close;
	@FindBy(xpath = "//span[text()='Labor']")
	WebElement labor;
	@FindBy(xpath = "//li[@title='Actuals']")
	WebElement actuals;
	@FindBy(xpath = "//li[@title='Planning']")
	WebElement planning;
	@FindBy(xpath = "//li[@title='Re-Project Labor']")
	WebElement reProjectLabor;
	@FindBy(xpath = "//li[@title='Scheduling']")
	WebElement scheduling;
	@FindBy(xpath = "//li[@title='Employee Requests']")
	WebElement employeeRequests;
	@FindBy(xpath = "//li[@title='Timeline Scheduling']")
	WebElement timeLineScheduling;

	public void clickUnifocus() {
		unifocus.click();
		String un = unifocus.getText();
		System.out.println(un);
		Assert.assertEquals("UniFocus", un);
		labor.click();
	}

	public void clickEnterActualEnvironments() throws InterruptedException {
		actuals.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement mn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//ul[@class='ant-timeline']/div[1]/div/div[2]/div/i")));
		Actions a = new Actions(driver);
		a.moveToElement(mn).click().build().perform();
		driver.switchTo().activeElement();
		List<WebElement> start = driver.findElements(By.xpath(
				"//ul[@class='ant-dropdown-menu ant-dropdown-menu-light ant-dropdown-menu-root ant-dropdown-menu-vertical']/li"));

		for (int i = 0; i <= start.size() - 1; i++) {
			if (start.get(i).getText().contains("Start")) {
				start.get(i).click();
				break;
			} else if (start.get(i).getText().contains("Update")) {
				start.get(i).click();
				break;
			}
		}
		try {
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			WebElement multipleKBIs = driver.findElement(By.xpath("//*[contains(text(), 'Multiple KBIs/Days')]"));
			multipleKBIs.click();
		} catch (NoSuchElementException e) {
			System.out.println("nosuchelement");
		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickEnterActualKBIs() throws InterruptedException {
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement mn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//ul[@class='ant-timeline']/div[4]/div/div[2]/div/i")));
		Actions a = new Actions(driver);
		a.moveToElement(mn).click().build().perform();
		driver.switchTo().activeElement();
		driver.switchTo().activeElement();
		WebElement industries = driver.findElement(By.xpath("//div[4]/div/div/ul[@role='menu']"));
		List<WebElement> start = industries.findElements(By.tagName("li"));

		for (int i = 0; i <= start.size() - 1; i++) {
			if (start.get(i).getText().contains("Start")) {
				start.get(i).click();
				break;
			} else if (start.get(i).getText().contains("Update")) {
				start.get(i).click();
				break;
			}
		}
		try {
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			WebElement actualKBIs = driver.findElement(By.xpath("//h4[normalize-space()='Actuals Week']"));

		} catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickEnterEmployeeProductivity() throws InterruptedException {
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement mn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//ul[@class='ant-timeline']/div[5]/div/div[2]/div/i")));
		Actions a = new Actions(driver);
		Coordinates cor = ((Locatable) mn).getCoordinates();
		cor.inViewPort();
		Thread.sleep(1000);
		a.moveToElement(mn).click().build().perform();
		driver.switchTo().activeElement();
		WebElement industries = driver.findElement(By.xpath("//div[5]/div/div/ul[@role='menu']"));
		List<WebElement> start = industries.findElements(By.tagName("li"));
		for (int i = 0; i <= start.size() - 1; i++) {
			if (start.get(i).getText().contains("Start")) {
				start.get(i).click();
				break;
			} else if (start.get(i).getText().contains("Update")) {
				start.get(i).click();
				break;
			}
		}
		try {
			driver.switchTo().activeElement();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			WebElement job = driver.findElement(By.xpath("//h4[normalize-space()='Job']"));

		} catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickEnterActualHours() throws InterruptedException {
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement mn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//ul[@class='ant-timeline']/div[8]/div/div[2]/div/i")));
		Actions a = new Actions(driver);
		Coordinates cor = ((Locatable) mn).getCoordinates();
		cor.inViewPort();
		Thread.sleep(1000);
		a.moveToElement(mn).click().build().perform();
		driver.switchTo().activeElement();
		WebElement industries = driver.findElement(By.xpath("//div[6]/div/div/ul[@role='menu']"));
		List<WebElement> start = industries.findElements(By.tagName("li"));
		for (int i = 0; i <= start.size() - 1; i++) {
			if (start.get(i).getText().contains("Start")) {
				start.get(i).click();
				break;
			} else if (start.get(i).getText().contains("Update")) {
				start.get(i).click();
				break;
			}
		}
		try {
			driver.switchTo().activeElement();
			driver.switchTo().activeElement();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			WebElement job = driver.findElement(By.xpath("//h4[normalize-space()='Job']"));

		} catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
		Thread.sleep(4000);
		close.click();
	}

	public void clickPlanning() throws InterruptedException {
		unifocus.click();
		labor.click();
		planning.click();
		driver.switchTo().frame(frame);
		WebElement quickView = driver.findElement(By.xpath("//span[normalize-space()='Quick View']"));
		quickView.click();
		WebElement listView = driver.findElement(By.xpath("//span[normalize-space()='List View']"));
		listView.click();
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement EnterScheduledHours = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//ul[@class='ant-timeline']/div[13]/div/div[2]/div/i")));
		Actions a = new Actions(driver);
		Coordinates cor = ((Locatable) EnterScheduledHours).getCoordinates();
		cor.inViewPort();
		Thread.sleep(1000);
		a.moveToElement(EnterScheduledHours).click().build().perform();
		Thread.sleep(8000);
	}

	public void clickForecastEnvironments() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement mn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//ul[@class='ant-timeline']/div[1]/div/div[2]/div/i")));
		Actions a = new Actions(driver);
		a.moveToElement(mn).click().build().perform();
		driver.switchTo().activeElement();
		WebElement industries = driver.findElement(By.xpath("//div[4]/div/div/ul[@role='menu']"));
		List<WebElement> start = industries.findElements(By.tagName("li"));
		for (int i = 0; i <= start.size() - 1; i++) {
			if (start.get(i).getText().contains("Start")) {
				start.get(i).click();
				break;
			} else if (start.get(i).getText().contains("Update")) {
				start.get(i).click();
				break;
			}
		}
		try {
			driver.switchTo().activeElement();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			WebElement multipleKBIs = driver.findElement(By.xpath("//span[normalize-space()='Multiple KBIs/Days']"));
			multipleKBIs.click();
		}

		catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickEnterPreWork() throws InterruptedException {
		// planning.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement EnterPreWork = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[2]/div/div/ul[@class='ant-timeline']/div[2]/div/div[2]/div/i")));
		Actions a = new Actions(driver);
		a.moveToElement(EnterPreWork).click().build().perform();

		driver.switchTo().activeElement();
		WebElement industries = driver.findElement(By.cssSelector("//div[3]/div/div/ul[@role='menu']"));

		List<WebElement> start = industries.findElements(By.tagName("li"));

		for (int i = 0; i <= start.size() - 1; i++) {
			if (start.get(i).getText().contains("Start")) {
				start.get(i).click();
				break;
			} else if (start.get(i).getText().contains("Update")) {
				start.get(i).click();
				break;
			}
		}
		try {
			driver.switchTo().activeElement();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			WebElement multipleKBIs = driver.findElement(By.xpath("//span[normalize-space()='Multiple KBIs/Days']"));
			multipleKBIs.click();
		}

		catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickEnterInputKBIForecast() throws InterruptedException {

		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement EnterInputKBIForecast = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[2]/div/div/ul[@class='ant-timeline']/div[4]/div/div[2]/div/i")));
		Actions a = new Actions(driver);
		Coordinates cor = ((Locatable) EnterInputKBIForecast).getCoordinates();
		cor.inViewPort();
		Thread.sleep(1000);
		a.moveToElement(EnterInputKBIForecast).click().build().perform();
		driver.switchTo().activeElement();
		driver.switchTo().activeElement();
		// WebElement industries =
		// driver.findElement(By.xpath("//div[4]/div/div/ul[@role='menu']"));
		List<WebElement> start = driver.findElements(By.xpath(
				"//ul[@class='ant-dropdown-menu ant-dropdown-menu-light ant-dropdown-menu-root ant-dropdown-menu-vertical']/li"));

		for (int i = 0; i <= start.size() - 1; i++) {
			if (start.get(i).getText().contains("Start")) {
				start.get(i).click();
				break;
			} else if (start.get(i).getText().contains("Update")) {
				start.get(i).click();
				break;
			}
		}

		try {
			driver.switchTo().activeElement();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			WebElement multipleKBIs = driver.findElement(By.xpath("//span[normalize-space()='Multiple KBIs/Days']"));
			multipleKBIs.click();
		}

		catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickViewEditRevenueCenterForecast() throws InterruptedException {
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement EditRevenueCenterForecast = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[2]/div/div//ul[@class='ant-timeline']/div[6]/div/div[2]/div/i")));
		Actions a = new Actions(driver);
		Coordinates cor = ((Locatable) EditRevenueCenterForecast).getCoordinates();
		cor.inViewPort();
		Thread.sleep(1000);
		a.moveToElement(EditRevenueCenterForecast).click().build().perform();
		driver.switchTo().activeElement();
		// WebElement industries =
		// driver.findElement(By.xpath("//div[6]/div/div/ul[@role='menu']"));
		List<WebElement> start = driver.findElements(By.xpath(
				"//ul[@class='ant-dropdown-menu ant-dropdown-menu-light ant-dropdown-menu-root ant-dropdown-menu-vertical']/li"));

		for (int i = 0; i <= start.size() - 1; i++) {
			if (start.get(i).getText().contains("Start")) {
				start.get(i).click();
				break;
			} else if (start.get(i).getText().contains("Update")) {
				start.get(i).click();
				break;
			}
		}
		try {
			driver.switchTo().activeElement();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			WebElement multipleKBIs = driver.findElement(By.xpath("//span[normalize-space()='Multiple KBIs/Days']"));
			multipleKBIs.click();
		}

		catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickManageSchedules() throws InterruptedException {
		// planning.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement ManageSchedules = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[2]/div/div//ul[@class='ant-timeline']/div[12]/div/div[2]/div/i")));
		Actions a = new Actions(driver);
		Coordinates cor = ((Locatable) ManageSchedules).getCoordinates();
		cor.inViewPort();
		Thread.sleep(1000);
		a.moveToElement(ManageSchedules).click().build().perform();
		driver.switchTo().activeElement();
		WebElement industries = driver.findElement(By.xpath("//div[9]/div/div/ul[@role='menu']"));
		List<WebElement> start = driver.findElements(By.xpath("li"));
		for (int i = 0; i <= start.size() - 1; i++) {
			if (start.get(i).getText().contains("Start")) {
				start.get(i).click();
				break;
			} else if (start.get(i).getText().contains("Update")) {
				start.get(i).click();
				break;
			}
		}
		try {
			driver.switchTo().activeElement();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			WebElement multipleKBIs = driver.findElement(By.xpath("//span[normalize-space()='Multiple KBIs/Days']"));
			multipleKBIs.click();
		}

		catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickEnterScheduledHours() throws InterruptedException {
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement EnterScheduledHours = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[2]/div/div//ul[@class='ant-timeline']/div[13]/div/div[2]/div/i")));
		Actions a = new Actions(driver);
		Coordinates cor = ((Locatable) EnterScheduledHours).getCoordinates();
		cor.inViewPort();
		Thread.sleep(1000);
		a.moveToElement(EnterScheduledHours).click().build().perform();
		driver.switchTo().activeElement();
		WebElement industries = driver.findElement(By.xpath("//div[10]/div/div/ul[@role='menu']"));
		List<WebElement> start = driver.findElements(By.xpath("li"));
		for (int i = 0; i <= start.size() - 1; i++) {
			if (start.get(i).getText().contains("Start")) {
				start.get(i).click();
				break;
			} else if (start.get(i).getText().contains("Update")) {
				start.get(i).click();
				break;
			}
		}
		try {
			driver.switchTo().activeElement();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			WebElement multipleKBIs = driver.findElement(By.xpath("//span[normalize-space()='Multiple KBIs/Days']"));
			multipleKBIs.click();
		}

		catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickReProjectLabor() throws InterruptedException {
		unifocus.click();
		labor.click();
		reProjectLabor.click();
		driver.switchTo().frame(frame);
		try {
			driver.switchTo().activeElement();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			WebElement ProjectedHours = driver.findElement(
					By.xpath("//div[@class='ant-form-item-control']/span[@class='ant-form-item-children']/button[1]"));
		} catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickScheduling() throws InterruptedException {
		unifocus.click();
		labor.click();
		scheduling.click();
		driver.switchTo().frame(frame);
		try {
			driver.switchTo().activeElement();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			WebElement selectKBIs = driver
					.findElement(By.xpath("//div[@class='Footer-module___footer___1k53u']//button[@type='button']"));
		} catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickEmployeeRequests() throws InterruptedException {
		unifocus.click();
		labor.click();
		employeeRequests.click();

		try {
			driver.switchTo().activeElement();
			Thread.sleep(20000);
			WebElement addRequest = driver
					.findElement(By.xpath("//button[@class='ant-btn ToolbarLeft-module___addRequestButton___2bP5a']"));

		} catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickShiftRequests() throws InterruptedException {
		unifocus.click();
		labor.click();
		employeeRequests.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement addRequest = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@title='Shift Requests']")));
		Thread.sleep(6000);
		addRequest.click();
		try {
			driver.switchTo().activeElement();
			WebDriverWait kbi = new WebDriverWait(driver, 80);
			WebElement shifts = kbi.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//div[@title='Shift Start (Soonest First)']")));
			Thread.sleep(4000);
		} catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickCallIns() throws InterruptedException {
		unifocus.click();
		labor.click();
		employeeRequests.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement callIns = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@title='Call Ins']")));
		Thread.sleep(4000);
		callIns.click();
		try {
			driver.switchTo().activeElement();
			WebDriverWait kbi = new WebDriverWait(driver, 80);
			WebElement filter = kbi.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//div[@title='Call In Date (Oldest First)']")));
			Thread.sleep(4000);
		} catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickAvailabilityRequests() throws InterruptedException {
		unifocus.click();
		labor.click();
		employeeRequests.click();
		driver.switchTo().frame(frame);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement avalability = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@title='Availability']")));
		Thread.sleep(4000);
		avalability.click();
		try {
			driver.switchTo().activeElement();
			WebDriverWait kbi = new WebDriverWait(driver, 80);
			WebElement EnteredonDate = kbi.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//div[@title='Entered on Date (Oldest First)']")));
			Thread.sleep(4000);
		} catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}

	public void clickTimeLineScheduling() throws InterruptedException {
		unifocus.click();
		labor.click();
		timeLineScheduling.click();
		driver.switchTo().frame(frame);
		try {
			driver.switchTo().activeElement();
			WebDriverWait kbi = new WebDriverWait(driver, 80);
			WebElement addShift = kbi.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='button-1033-btnIconEl']")));
			Thread.sleep(4000);
		} catch (NoSuchElementException e) {
			System.out.println("nosuchelement");

		}
		driver.switchTo().defaultContent();
		close.click();
	}
}
