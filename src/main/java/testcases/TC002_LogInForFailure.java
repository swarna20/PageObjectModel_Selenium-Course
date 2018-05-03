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
 * The Class TC002_LogInForFailure.
 */
public class TC002_LogInForFailure extends ProjectMethods{
	
	/**
	 * Sets the data.
	 */
	@BeforeClass
	public void setData() {
		testCaseName = "TC002_LogInForFailure";
		testDescription = "Login (nagitive)";
		category="sanity";
		authors = "gayathri";
		dataSheetName = "TC002_LoginFailure";
		browserName ="chrome";
	}
	
	/**
	 * Log in and log out.
	 *
	 * @param uName the u name
	 * @param pwd the pwd
	 * @param errMsg the err msg
	 */
	@Test(dataProvider="fetchData")
	public void logInAndLogOut(String uName,String pwd,String errMsg) {
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLoginFailure()
		.verifyErrMsg(errMsg);
		
	}

}
