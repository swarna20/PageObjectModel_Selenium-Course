/*
 * 
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginPage.
 */
public class LoginPage extends ProjectMethods{

	/**
	 * Instantiates a new login page.
	 *
	 * @param driver the driver
	 * @param test the test
	 */
	public LoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	/** The ele user name. */
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName ;
	
	/**
	 * Enter user name.
	 *
	 * @param data the data
	 * @return the login page
	 */
	public LoginPage enterUserName(String data) {
		type(eleUserName,data);
		return this;
	}

	/** The elepassword. */
	@FindBy(how=How.ID,using="password")
	private WebElement elepassword;
	
	/**
	 * Enter password.
	 *
	 * @param data the data
	 * @return the login page
	 */
	public LoginPage enterPassword(String data) {
		type(elepassword, data);
		return this;
	}


	/** The ele login. */
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	
	/**
	 * Click login.
	 *
	 * @return the home page
	 */
	public HomePage clickLogin() {
		click(eleLogin);
		//HomePage hp = new HomePage();
		return new HomePage(driver, test);
	}

	/** The ele error msg. */
	@FindBy(how=How.ID,using="errorDiv")
	private WebElement eleErrorMsg;
	
	/**
	 * Verify err msg.
	 *
	 * @param text the text
	 * @return the login page
	 */
	public LoginPage verifyErrMsg(String text) {
		verifyPartialText(eleErrorMsg, text);
		return this;
	}

	
	/**
	 * Click login failure.
	 *
	 * @return the login page
	 */
	public LoginPage clickLoginFailure() {
		click(eleLogin);
		return this;
	}

}
