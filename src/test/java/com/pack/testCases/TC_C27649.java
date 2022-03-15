package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.C27649;

import recordingTests.ScreenRecorderUtil;

public class TC_C27649  extends TC_BaseClass{
	@Test
	
	public void setup4() throws  Exception {
		ScreenRecorderUtil.startRecord("C27649");
		C27649 setUp4=new C27649(driver);
		setUp4.clickUnifocus();
		setUp4.accounts();
		setUp4.budgetDatasets();
		setUp4.financialPeriods();
		setUp4.kbiSets();
		setUp4.payRollMap();
		setUp4.systemDefinedDatasets();
		setUp4.userDefinedDatasets();
}
}
