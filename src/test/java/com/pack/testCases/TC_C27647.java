package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.C27647;

import recordingTests.ScreenRecorderUtil;

public class TC_C27647 extends TC_BaseClass{
@Test
	
	public void setup2() throws  Exception {
		ScreenRecorderUtil.startRecord("setup2");
		C27647 setup2=new C27647(driver);
		setup2.clickUnifocus();
		setup2.general();
		setup2.laborscheduler();
		setup2.propertyworkrules();

}}
