package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.C27651;

import recordingTests.ScreenRecorderUtil;

public class TC_C27651 extends TC_BaseClass {
	@Test

	public void setup() throws Exception {
		ScreenRecorderUtil.startRecord("setup");
		C27651 setUp6 = new C27651(driver);
		setUp6.clickUnifocus();
		setUp6.BlackoutDates();
		setUp6.EarningCategories();
		setUp6.EmployeeEventDocumentTemplates();
		setUp6.Holidays();
		setUp6.HolidayTypes();
		setUp6.JobCategories();
		setUp6.PayGroups();
		setUp6.PayRateReasons();
		setUp6.PunchToEarningMapping();
		setUp6.TACodes();
		setUp6.TimeClocks();
	}
}
