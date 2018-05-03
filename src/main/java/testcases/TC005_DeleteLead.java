package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {
	
	 @BeforeClass
	    public void setData() {
	        testCaseName = "TC005_DeleteLead";
	        testDescription = "Delete Lead (positive)";
	        category="regression";
	        authors = "swarna";
	        dataSheetName = "TC005_DeleteLead";
	        browserName ="chrome";
	    }
	
	 @Test(dataProvider="fetchData")
		public void deleteLead (String compName){
			new LoginPage(driver, test)
			.enterUserName("DemoSalesManager")
			.enterPassword("crmsfa")
			.clickLogin()
			.clickCRM_SFALink()
			.clickLeads()
			.clickFindLeads()
			.enterCompanyName(compName)
			.clickFindLeadsButton()
			.clickLeadForEdit()
			.clickDeletebutton();
				
			
		}


}
