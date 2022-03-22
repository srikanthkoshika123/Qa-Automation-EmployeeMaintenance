package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.C27650;

import recordingTests.ScreenRecorderUtil;

public class TC_C27650 extends TC_BaseClass {
	@Test
	public void setup5() throws Exception {
		ScreenRecorderUtil.startRecord("C27650");
		C27650 setUp5 = new C27650(driver);
		setUp5.clickUnifocus();
		setUp5.actualkbimapping();
		setUp5.calendarplans();
		setUp5.dayoffrotationplans();
		setUp5.laborenvironments();
		setUp5.forecastkbimapping();
		setUp5.globalenvironments();
		setUp5.operatingcodes();
		setUp5.rotationplans();
		setUp5.seasons();
		setUp5.shiftcategories();
		setUp5.shiftdefinitions();
		setUp5.standardsets();
		setUp5.units();

	}
}
