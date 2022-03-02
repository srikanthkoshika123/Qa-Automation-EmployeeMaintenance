package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.C27509;

import recordingTests.ScreenRecorderUtil;

public class TC_C27509  extends TC_BaseClass{
@Test
	
	public void setup() throws  Exception {
		ScreenRecorderUtil.startRecord("setup");
		C27509 setup=new C27509(driver);
		setup.clickUnifocus();
		setup.earningtypes();
		setup.flowpatterns();
		setup.flowplans();
		setup.forecaststructure();
		setup.market();
		setup.revenue();
		setup.interfaces();
		setup.labourstandarads();
		setup.labourstructure();
		setup.mobileconfig();
		setup.workrules();
		
	}			
}

