package com.pack.testCases;

import org.testng.annotations.Test;

import com.pack.loginPages.C27652;

import recordingTests.ScreenRecorderUtil;

public class TC_C27652 extends TC_BaseClass {
	@Test

	public void setup7() throws Exception {
		ScreenRecorderUtil.startRecord("setup7");
		C27652 setUp7 = new C27652(driver);
		setUp7.clickUnifocus();
		setUp7.masterkbicode();
		setUp7.masterlaborstructure();
		setUp7.brand();
		setUp7.portfolio();
		setUp7.region();

	}
}