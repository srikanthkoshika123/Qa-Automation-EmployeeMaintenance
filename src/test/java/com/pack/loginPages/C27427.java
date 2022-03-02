package com.pack.loginPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pack.testCases.TC_BaseClass;

public class C27427 extends TC_BaseClass{
	WebDriver ldriver;
	public C27427(WebDriver 	rdriver){
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver, this);       	  		
	
}
	@FindBy(className="app-iframe")
	WebElement frame;
	@FindBy(xpath="//body//div//div[@class='ant-modal-body']//div//div//div//div[1]//div[1]//div[2]//div[1]//span[1]//input[1]")
    WebElement Empid;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[2]//div[1]//div[2]//div[1]//span[1]//input[1]")
	WebElement DisplayName;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[3]//div[1]//div[2]//div[1]//span[1]//input[1]")
	WebElement FirstName;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[4]//div[1]//div[2]//div[1]//span[1]//input[1]")
	WebElement middleName;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[5]//div[1]//div[2]//div[1]//span[1]//input[1]")
	WebElement lastName;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[6]//div[1]//div[2]//div[1]//span[1]//input[1]")
	WebElement Email;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[7]//div[1]//div[2]//div[1]//span//span//input[1]")
	WebElement hireDate;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[8]//div[1]//div[2]//div[1]//span//span//input[1]")
	WebElement seniority;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//div//div[9]//div[1]//div[2]//div[1]//span[1]//div//div//div")
	WebElement workClass;
	@FindBy(xpath="//div[@class='ant-modal-body']//div//div//form[@class='ant-form ant-form-horizontal']//div//div[@id='TIPPED']")
	WebElement tipped;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement next;
	@FindBy(xpath="//div[@title='Expand All']//button")
	WebElement selectjob;
	@FindBy(xpath="//div[contains(@class,'AddEditJobModal-module___jobField___17X0F')]//input")
	WebElement jobdate;
	@FindBy(xpath="//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___jobField___17X0F']")
	WebElement jobrank;
	@FindBy(xpath="//div[@class='AddEditJobModal-module___payTypeSelect___3RptZ ant-select ant-select-enabled']")
	WebElement paytype;
	@FindBy(xpath="//li[text()='Salaried Non Exempt']")
	WebElement pay;
	@FindBy(xpath="//input[@value='40.00']")
	WebElement weeklyContractHours;
	@FindBy(xpath="//input[@value='5.00']")
	WebElement contractDays;
	@FindBy(xpath="//label[@class='AddEditJobModal-module___wageCheckbox___TQnIf ant-checkbox-wrapper']//input[@type='checkbox']")
	WebElement ar;
	@FindBy(xpath="//body//div//div[@class='AddEditJobModal-module___initialWageContent___IWN61']//div//div//div[1]//input[1]")
	WebElement hr;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement save;
	
	public void switchFrame() throws InterruptedException {
	driver.switchTo().frame(frame);
	WebElement addnew = driver.findElement(By.xpath("//button[normalize-space()='Add New']"));
	Thread.sleep(4000);
	addnew.click();	
	}
	public void addNewemployee(String id,String dname,String fname,String mname,String lname,String email,String jdate,String sdate) throws InterruptedException {
	Empid.sendKeys(id);
	Assert.assertEquals(true, Empid.isEnabled());
	System.out.println(Empid.isEnabled());
	DisplayName.sendKeys(dname);
	Assert.assertEquals(true, DisplayName.isEnabled());
	System.out.println(DisplayName.isEnabled());
	FirstName.sendKeys(fname);
	middleName.sendKeys(mname);
	lastName.sendKeys(lname);
	Email.sendKeys(email);
	hireDate.sendKeys(jdate);
	seniority.sendKeys(sdate);
	}
	public void selectWorkClass(String option) throws InterruptedException {
	Thread.sleep(2000);
	workClass.click();
     List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
             
     for(int i = 0; i<=allOptions.size()-1; i++) {
         if(allOptions.get(i).getText().contains(option)) { 
             allOptions.get(i).click();
             break;
              
         }
     }
	
	
	}
	public void selectTipped(String tip) throws InterruptedException {
		tipped.click();
		List<WebElement> Options = driver.findElements(By.xpath("//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
		 
		   for (WebElement item: Options ) {
		        if(item.getText().equalsIgnoreCase(tip)){
		                item.click();
		                 break;
		                 }
		   }
		   next.click();
		     }
	public void selectJob(String jobName,String job,String jobDate,String jobRank) throws InterruptedException {
	Thread.sleep(4000);
	selectjob.click();
	WebElement Type =driver.findElement(By.xpath(jobName));
	Thread.sleep(4000);
	Type.click();
	jobdate.sendKeys(Keys.CONTROL+ "a");
	jobdate.sendKeys(Keys.DELETE);
	jobdate.sendKeys(jobDate);
	jobrank.sendKeys(Keys.CONTROL+ "a");
	jobrank.sendKeys(Keys.DELETE);
	jobrank.sendKeys(jobRank);
		
	}
	public void selectEffectiveDate(String effectiveDate) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement effectivedate = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='input-field uf-input-field AddEditJobModal-module___wageField___5cszH ant-input-affix-wrapper']/input")));
		effectivedate.sendKeys(Keys.CONTROL+ "a");
		effectivedate.sendKeys(Keys.DELETE);
		effectivedate.sendKeys(effectiveDate);
	}
		public void selectpayType(String payType,String hr,String wch,String ch,String annual,String sd,String sAr,String Piece) throws InterruptedException {
		paytype.click();
		 List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
	     
	     for(int i = 0; i<=allOptions.size()-1; i++) {
	         if(allOptions.get(i).getText().contains(payType)) { 
	             allOptions.get(i).click();
	             break;     
	         }
	     }
	       if(payType.equals("Hourly")) {
        	 WebElement hourly=driver.findElement(By.xpath("//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
        	 hourly.sendKeys(Keys.CONTROL+ "a");
        	 hourly.sendKeys(Keys.DELETE,hr);
        	 Thread.sleep(5000);
        	 
         }
	      else if(payType.equals("Salaried Non Exempt")) {
	        	 weeklyContractHours.sendKeys(Keys.CONTROL+ "a");
	     		weeklyContractHours.sendKeys(Keys.DELETE,wch);
	     		contractDays.sendKeys(Keys.CONTROL+ "a");
	     		contractDays.sendKeys(Keys.DELETE,ch);
	     		 ar.click();
	     		WebElement aRate=driver.findElement(By.xpath("//body//div//div[@class='AddEditJobModal-module___initialWageContent___IWN61']//div//div//div[1]//input[1]"));
	     		aRate.sendKeys(Keys.CONTROL+ "a");
	     		aRate.sendKeys(Keys.DELETE,annual);
	     		 Thread.sleep(5000);
	         }
	        
          
           else if(payType.equals("Salaried Exempt")) {
        	   WebElement salary=driver.findElement(By.xpath("//div[text()='Salary 8']"));
        	   salary.click();
        	   List<WebElement> salaryexempt = driver.findElements(By.xpath("//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
      	     
      	     for(int i = 0; i<=salaryexempt.size()-1; i++) {
      	         if(salaryexempt.get(i).getText().contains(sd)) { 
      	        	salaryexempt.get(i).click();
      	             break;     
      	         }
      	     }
      	   WebElement ear=driver.findElement(By.xpath("//label[@class='AddEditJobModal-module___wageCheckbox___TQnIf ant-checkbox-wrapper']//input[@type='checkbox']"));
      	   Thread.sleep(3000);
      	   ear.click();
      	  WebElement er=driver.findElement(By.xpath("//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
      	  er.sendKeys(Keys.CONTROL+ "a");
 		  er.sendKeys(Keys.DELETE,sAr);
    	   Thread.sleep(7000);
	         }
           else if(payType.equals("Piece")) {
        	   WebElement piece=driver.findElement(By.xpath("//input[@class='ant-input input-field uf-input-field AddEditJobModal-module___wageField___5cszH']"));
        	   Thread.sleep(2000);
	           piece.sendKeys(Piece); 
	           Thread.sleep(5000);
	         }
		}	
	    public void selectWorkingHours() throws InterruptedException {
	    Thread.sleep(4000);	
	    save.click();
	   
	   }
}
