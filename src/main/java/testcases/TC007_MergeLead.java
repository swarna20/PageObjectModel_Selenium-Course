package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods{
	
	@BeforeClass
	public void setData(){
		    testCaseName = "TC007_MergeLead";
	        testDescription = "Merge Leads (positive)";
	        category="regression";
	        authors = "swarna";
	        dataSheetName = "TC007_MergeLead";
	        browserName ="chrome";
		
	}
	
	 @Test(dataProvider="fetchData")
		public void MergeLeads (String FromComp, String Tocomp){
			new LoginPage(driver, test)
			.enterUserName("DemoSalesManager")
			.enterPassword("crmsfa")
			.clickLogin()
			.clickCRM_SFALink()
			.clickLeads()
			.clickMergeLeads()
			.clickFromLeadIdIcon()
			.enterCompanyNammeForFromLeadId(FromComp)
			.clickFindLeadsButton()
			.clickOnLeadID()
			.clickToLeadIdIcon()
			.enterCompanyNammeForToLeadId(Tocomp)
			.clickFindLeadsButton()
			.clickOnLeadID()
			.clickMergeButton();
			
	
			
				
			
		}

}
