package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.loginPages.EmployeeMaintenance;
import com.pack.loginPages.LoginPage;

import recordingTests.ScreenRecorderUtil;


public class TC_TestCase_01 extends TC_BaseClass {
	 @Test
		public void loginTest() throws  Exception {
	    ScreenRecorderUtil.startRecord("loginPage");
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	LoginPage lp=new LoginPage(driver);
	    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	lp.setPartnerCode(partnerCode);
	    	lp.clickNext();
		    logger.info("enter user name");
	     	lp.setUserName(loginas);
	     	logger.info("password entered");
	        lp.setPassWord(Password);
			Thread.sleep(4000);
	    	lp.clickSignIn();
	    	logger.info("signin clicked");
	    	Thread.sleep(2000);
	       
	    	if(driver.getTitle().equalsIgnoreCase("singularity")) {
	    		Assert.assertTrue(true);
	    		
	    	}
	    	else {
	    		
	    		Assert.assertTrue(false);
	    	}	
	  }
}