package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.DoubleClick;
import com.pack.loginPages.EmployeeMaintenance;

import recordingTests.ScreenRecorderUtil;

public class TC_DoubleClick extends TC_BaseClass{
	@Test()
	public void doubleClick() throws Exception {
		ScreenRecorderUtil.startRecord("doubleClick");
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 EmployeeMaintenance employeemaintenance=new EmployeeMaintenance(driver);
		employeemaintenance.clickUnifocus();
		employeemaintenance.getselect_List();
	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   DoubleClick doubleclick=new DoubleClick(driver);
	   doubleclick.switchFrame();
	   doubleclick.selectEmployee();
	  // doubleclick.clickJobType();
	   //doubleclick.clickEmptyCell();
	   
	}

}
