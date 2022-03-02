package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.C27648;

import recordingTests.ScreenRecorderUtil;

public class TC_C27648 extends TC_BaseClass{
@Test
	
	public void setup3() throws  Exception {
		ScreenRecorderUtil.startRecord("setup3");
		C27648 setup3=new C27648(driver);
		setup3.clickUnifocus();
		setup3.Certifications();
		setup3.EmployeeClasses();
		setup3.EmployeeFieldOverrides();
		setup3.EmployeeSets();
		setup3.EmployeeUserMaps();
		setup3.EmployeeWorkClasses();
		setup3.LocalTaxes();
		setup3.SalaryDistributions();
		setup3.ScheduleGroups();
		setup3.States();
		setup3.StatusChangeReasons();
		setup3.TaxTypes();
		setup3.TimeOffTypes();
}}


