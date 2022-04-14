package com.pack.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pack.loginPages.C27503;
import com.pack.utils.XLUtils;
import com.pack.loginPages.C27428;

import recordingTests.ScreenRecorderUtil;

public class TC_C27503 extends TC_BaseClass {
	@SuppressWarnings("deprecation")
	@Test(dataProvider = "loginPage")
	public void labor(String url, String partnerCode, String loginas, String Password, String dbModel, String db,
			String dbName, String module) throws Exception {

		ScreenRecorderUtil.startRecord("Labor");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		C27503 labor = new C27503(driver);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		labor.setPartnerCode(partnerCode);
		labor.clickNext();
		logger.info("enter user name");
		labor.setUserName(loginas);
		logger.info("password entered");
		labor.setPassWord(Password);
		Thread.sleep(4000);
		labor.clickSignIn(dbModel);
		logger.info("signin clicked");
		labor.selectDataBase(db, dbName, module);
		labor.clickUnifocus();
		labor.clickEnterActualEnvironments();
		labor.multipleKBIsDays();
		labor.clickEnterActualKBIs();
		labor.selectActualsWeek();
		labor.clickEnterEmployeeProductivity();
		labor.selectJob();
		labor.clickEnterActualHours();
		labor.clickPlanning();
		labor.retryingFindClick();
		labor.clickForecastEnvironments();
		labor.clickEnterPreWork();
		labor.clickReProjectLabor();
		labor.clickScheduling();
		labor.clickEmployeeRequests();
		labor.clickShiftRequests();
		labor.clickCallIns();
		labor.clickAvailabilityRequests();
		labor.clickTimeLineScheduling();
	}

	@DataProvider(name = "loginPage")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/pack/testData/AutoLoginInfoCase.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String empdata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				empdata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}

		}
		return empdata;

	}
}
