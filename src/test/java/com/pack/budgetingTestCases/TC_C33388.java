package com.pack.budgetingTestCases;

import org.testng.annotations.Test;

import com.pack.budgeting.C33388;
import com.pack.testCases.TC_BaseClass;

import recordingTests.ScreenRecorderUtil;

public class TC_C33388 extends TC_BaseClass {
	@Test

	public void financial() throws Exception {
		ScreenRecorderUtil.startRecord("financial");
		C33388 financial = new C33388(driver);
		financial.selectDataBase();
		financial.clickUnifocus();
		financial.budgeting();
		financial.periodDropDown();
		financial.referenceViewDropdown();
		financial.addConfigure();
		financial.Delete();
		financial.retryingFindClick();
		financial.AddNew();
		financial.selectReferenceDataSet();
		financial.DeletingAddNew();
		financial.ExpandingSideMenu();
		financial.BudgetConfiguration();
		financial.BudgetUtilities();

	}
}
