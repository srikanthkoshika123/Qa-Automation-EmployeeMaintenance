package com.pack.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pack.loginPages.C27823;
import com.pack.loginPages.EmployeeMaintenance;
import com.pack.loginPages.C27428;

import recordingTests.ScreenRecorderUtil;

public class TC_C27823 extends TC_BaseClass{
	 @Test(dataProvider="loginPage")
		public void employeeFieldOverrides(String url, String partnerCode, String loginas, String Password,String dbModel,String db,String dbName,String module) throws  Exception {
	    ScreenRecorderUtil.startRecord("EmployeeFieldOverrides");
	    	
	    	EmployeeMaintenance employeemaintenance=new EmployeeMaintenance(driver);
			employeemaintenance.clickUnifocus();
			C27823 efo=new C27823(driver);
			efo.clickEmployeeFieldOverrides();
			efo.switchToFrame();
			efo.checkEmailAdderss();
			efo.checkTipped();
			efo.checkHoursAvaliable();
}
}