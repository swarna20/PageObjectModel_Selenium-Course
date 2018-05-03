/*
 * 
 */
package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

// TODO: Auto-generated Javadoc
/**
 * The Class TC004_EditLead.
 */
public class TC004_EditLead extends ProjectMethods{
	

    /**
     * Sets the data.
     */
    @BeforeClass
    public void setData() {
        testCaseName = "TC004_EditLead";
        testDescription = "Edit Lead (positive)";
        category="regression";
        authors = "swarna";
        dataSheetName = "TC004_EditLead";
        browserName ="chrome";
    }

	
	/**
	 * Edits the lead.
	 *
	 * @param compName the comp name
	 * @param altCompName the alt comp name
	 * @param updatedCompany the updated company
	 */
	@Test(dataProvider="fetchData")
	public void editLead (String compName, String updatedCompany){
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
		.clickEditButton()
		.enterUpdatedCompanyName(updatedCompany)
		.clickEditButton()
		.verifyCompanyName();
		
		
		
	}

}
