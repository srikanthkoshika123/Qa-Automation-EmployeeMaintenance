package com.pack.testCases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.pack.loginPages.C33193;
import com.pack.loginPages.EmployeeMaintenance;
import recordingTests.ScreenRecorderUtil;
@SuppressWarnings("deprecation")
public class TC_C33193 extends TC_BaseClass{
@SuppressWarnings("deprecation")
@Test
	
	public void setup() throws  Exception {
		ScreenRecorderUtil.startRecord("setup");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 EmployeeMaintenance employeemaintenance=new EmployeeMaintenance(driver);
		employeemaintenance.clickUnifocus();
		employeemaintenance.getselect_List();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		C33193 certification=new C33193(driver);
		certification.switchFrame();
		certification.selectEmployee();
		certification.addJob();
		certification.selectAutoJob2();
		certification.selectAutoJob3();
		certification.selectCertifications();
		certification.clickDropDown();
		certification.selectIssueDate();

}
}