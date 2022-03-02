package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.LoginPage;
import com.pack.loginPages.C27504;

import recordingTests.ScreenRecorderUtil;

public class TC_C27504 extends TC_BaseClass{
	@Test
	public void tANDa() throws  Exception {
		
		ScreenRecorderUtil.startRecord("TandA");
	    C27504 tANDa=new C27504(driver);
	    tANDa.clickUnifocus();
	    tANDa.clickReviewPayPeriod();
	    tANDa.approveShifts();
	    tANDa.whoIsInOut();
	    tANDa.clickAttendancePointsandEvents();
	    tANDa.clickBenefits();
	    tANDa.clickEnterEarnings();
	    tANDa.clickHolidayPay();
	    tANDa.clickPunchImageReview();
	    tANDa.clickApproveEarnings();
	   
}
}