package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pack.loginPages.EmployeeMaintenance;
import com.pack.loginPages.SchedularTest;
import com.pack.loginPages.C30317;
import com.pack.utils.XLUtils;

import recordingTests.ScreenRecorderUtil;

public class TC_C30317 extends TC_BaseClass{
	@Test(dataProvider="JobTabData")
	public void updateExistingEmployeeJobsTab(String empid,String employee,String jobName,String payType,String hourly,String wch,String ch,String annual,String se,String sar,String piece,String EmpId,String jobType,String payType2,String hourlyRate,String AnnualRate1,String seAnnualRate1,String pieceRate,String jobType1,String job,String jobName1,String payType1,String hourly1,String wch1,String ch1,String annual1,String se1,String sar1,String piece1,String jobs,String empName) throws Exception {
	ScreenRecorderUtil.startRecord("UpdateExistingEmployeeJobTab");
	 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	 EmployeeMaintenance employeemaintenance=new EmployeeMaintenance(driver);
	employeemaintenance.clickUnifocus();
	employeemaintenance.getselect_List();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
    C30317 updateJobs=new C30317(driver);
    updateJobs.switchFrame();
    updateJobs.clickdate(empid,employee,jobName);
    updateJobs.selectpayType(payType,hourly,wch,ch,annual,se,sar,piece);
    updateJobs.addNewEffectiveDate(EmpId);
    updateJobs.retryingFindClick(jobType);
    updateJobs.SelectEdit(payType2,hourlyRate,AnnualRate1,seAnnualRate1,pieceRate);
    updateJobs.clickJobType(jobType1);
    updateJobs.clickDeleteEmp();
    updateJobs.clickAddJob(job,jobName1);
    updateJobs.selectpayType(payType1,hourly1,wch1,ch1,annual1,se1,sar1,piece1);
    updateJobs.clickUnifocus();
    updateJobs.retryingFindClick();
    updateJobs.selectDateRange(jobs,empName);
	}
	 @DataProvider(name="JobTabData")
	    String [][] getData() throws IOException
	    {
		String path=System.getProperty("user.dir")+"/src/test/java/com/pack/testData/UpdateJobTab (2).xlsx";
		
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
