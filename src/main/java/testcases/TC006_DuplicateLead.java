package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{

	@BeforeClass
	public void setData(){
		    testCaseName = "TC006_DuplicateLead";
	        testDescription = "Duplicte Lead (positive)";
	        category="regression";
	        authors = "swarna";
	        dataSheetName = "TC006_DuplicateLead";
	        browserName ="chrome";
		
	}
	
	 @Test(dataProvider="fetchData")
		public void duplicateLead (String compName, String duplicateName){
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
			.clickDuplicatebutton()
			.enterDuplicateCompanyName(duplicateName)
			.clickCreateLeadButton();
				
			
		}
}
