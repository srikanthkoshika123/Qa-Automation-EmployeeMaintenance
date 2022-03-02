package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pack.loginPages.EmployeeMaintenance;
import com.pack.loginPages.C28156;
import com.pack.utils.XLUtils;

import recordingTests.ScreenRecorderUtil;

public class TC_C28156 extends TC_BaseClass {
	 @Test(dataProvider="StatusData")
		public void updateExistingEmployee(String empId,String address,String city,String state,String zipCode,String displayName,String effectiveDate) throws Exception {
		 ScreenRecorderUtil.startRecord("UpdateExistingEmployee");
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 EmployeeMaintenance employeemaintenance=new EmployeeMaintenance(driver);
		employeemaintenance.clickUnifocus();
		employeemaintenance.getselect_List();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    C28156 updateEmp=new C28156(driver);
	    updateEmp.switchFrame();
	    updateEmp.UpdateEmployee(empId,address,city);
	    updateEmp.SelectZipCode(state, zipCode, displayName);
	    updateEmp.clickStatus(effectiveDate);
	    updateEmp.deleteStatus();
	    
	    }
	 @DataProvider(name="StatusData")
	    String [][] getData() throws IOException
	    {
		String path=System.getProperty("user.dir")+"/src/test/java/com/pack/testData/StatusEmployee.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String empdata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				empdata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);
		}
				
		}
	    return empdata;

	}
	   
	    }


