package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.C27506;

import recordingTests.ScreenRecorderUtil;

public class TC_C27506 extends TC_BaseClass{
	@Test

	public void admin() throws Exception
	{
		ScreenRecorderUtil.startRecord("admin");
		C27506 adminstration=new C27506(driver);
		adminstration.clickUnifocus();
		adminstration.audit();
		adminstration.employeeMaintenance();
		adminstration.EditPayRates();
		adminstration.manageEmployeeBadges();
		adminstration.useradminstration();
		adminstration.manageGroup(); 
		adminstration.taskschedulersetup();
		adminstration.taskschedulerlog();
		adminstration.myProcesses();
		
	}

}
