package com.pack.loginPages;


import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class SchedularTest extends TC_BaseClass {
	WebDriver ldriver;
	public SchedularTest(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  

}
	
	@FindBy(className="app-iframe")
	WebElement frame;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/button[1]")
	WebElement unifocus;
	@FindBy(xpath="//span[text()='Labor']")
    WebElement labor;
	@FindBy(xpath="//li[@title='Scheduling']")
    WebElement scheduling;
	
	
	public void clickUnifocus() {
		unifocus.click();
		String un = unifocus.getText();
		System.out.println(un);
		Assert.assertEquals("UniFocus", un);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement setup = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Setup')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", setup);

		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement laborStructure = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@title='Labor Structure']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", laborStructure);
	}

	public void switchFrame() throws InterruptedException {
		driver.switchTo().frame(frame);
	}

	public boolean selectPropertyDefault() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 120);
				WebElement propertyDefault = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/div[@aria-colindex='1']")));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", propertyDefault);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public void clickAdd() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='ant-btn ant-dropdown-trigger']//span[contains(text(),'Add')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		driver.switchTo().activeElement();
		WebElement addDivision = driver.findElement(By.xpath("//li[contains(text(),'Add Division')]"));
		addDivision.click();
		  @SuppressWarnings("deprecation")
			EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
			  eventFiringWebDriver.executeScript("document.querySelector('div[ref=\"eBodyViewport\"]').scrollTop=600");
		
		
	}
	public boolean selectPropertyDefault1() throws InterruptedException {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				      WebElement element = driver.findElement(By.xpath("//span[text()='Division 1']"));
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("arguments[0].scrollIntoView();", element);
						Thread.sleep(2000);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}
	  public void robotClass() throws AWTException, InterruptedException {
		
		  /*WebDriverWait wait = new WebDriverWait(driver, 120);
			WebElement propertyDefault = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/div[@aria-colindex='1']")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", propertyDefault);
		  Robot rb = new Robot();
		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_F);
		  
		  StringSelection stringSelection = new StringSelection("Search String");
		  Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		  clipboard.setContents(stringSelection, null);
		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  rb.keyRelease(KeyEvent.VK_V);*/


		  Thread.sleep(15000);

	  }
	  public boolean retryingFindClick() throws InterruptedException {
		  driver.switchTo().frame(frame);
			   Thread.sleep(6000);
		  boolean result = false;
	        int attempts = 0;
	        while(attempts < 2) {
	            try {
	            	
		  			 WebDriverWait wait = new WebDriverWait(driver, 120);
					   WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div > div >button.ant-dropdown-trigger:nth-child(2)")));
					   //div > div >button.ant-dropdown-trigger:nth-child(2)
					   ((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);	    
					    Actions action = new Actions(driver);
		       		    action.moveToElement(ele).build().perform();
		       			driver.switchTo().activeElement();
		 				WebElement das = driver.findElement(By.xpath("//li[text()='Filter by Job']"));
		 				das.click();
		 				Thread.sleep(4000);
	                    result = true;
	                    break;
	            } catch(StaleElementReferenceException e) {
	            }
	            attempts++;
	        }
	        return result;
	           
	            }
	        @SuppressWarnings("deprecation")
	        public void selectDateRange() throws InterruptedException{
		       WebDriverWait wait = new WebDriverWait(driver, 40);
			   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-icon-only']/i[@aria-label='icon: minus-square-o']"))); 
			  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
			   WebDriverWait wait1 = new WebDriverWait(driver, 40);
				WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-btn ant-btn-icon-only']/i[@aria-label='icon: arrows-alt']"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
				@SuppressWarnings("deprecation")
				WebDriverWait wait2 = new WebDriverWait(driver, 40);
				WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[1]//ul[1]//li[2]//ul[1]//li[3]//span[2]//span[1]"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element2);
				WebDriverWait wait3 = new WebDriverWait(driver, 40);
				WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class='ant-btn ant-btn-primary']"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element4);
				WebDriverWait wait5 = new WebDriverWait(driver, 40);
				WebElement element5 = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='uf-employee-label-container line-clamp'][normalize-space()='bharat']"))); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", element5);
				String name =element5.getText();
				System.out.println(name);   
	     }
}
