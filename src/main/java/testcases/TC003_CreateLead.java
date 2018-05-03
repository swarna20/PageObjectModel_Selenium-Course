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
 * The Class TC003_CreateLead.
 */
public class TC003_CreateLead extends ProjectMethods {


    /**
     * Sets the data.
     */
    @BeforeClass
    public void setData() {
        testCaseName = "TC003_CreateLead";
        testDescription = "Create Lead (positive)";
        category="regression";
        authors = "swarna";
        dataSheetName = "TC003_CreateLead";
        browserName ="chrome";
    }


    /**
     * Creates the lead.
     *
     * @param comName the com name
     * @param fName the f name
     * @param lName the l name
     * @param email the email
     * @param phoneNum the phone num
     */
    @Test(dataProvider="fetchData")
      public void createLead(String comName, String fName, String lName, String email, String phoneNum){
        new LoginPage(driver, test)
                .enterUserName("DemoSalesManager")
                .enterPassword("crmsfa")
                .clickLogin()
                .clickCRM_SFALink()
                .clickLeads()
                .clickCreateLead()
                .enterCompanyName(comName)
                .enterFirstName(fName)
                .enterLastName(lName)
                .enterEmailAddress(email)
                .enterelePhoneNumber(phoneNum)
                .clickCreateLeadbutton()
                .verifyFirsrName(fName);


    }
}
