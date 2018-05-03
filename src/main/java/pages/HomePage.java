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
 * The Class HomePage.
 */
public class HomePage extends ProjectMethods{
	
	/**
	 * Instantiates a new home page.
	 *
	 * @param driver the driver
	 * @param test the test
	 */
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
		
	
	/** The ele log out. */
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	/**
	 * Click log out.
	 *
	 * @return the login page
	 */
	public LoginPage clickLogOut() {
		click(eleLogOut);
		return new LoginPage(driver,test);
	}
	
	/** The ele logged name. */
	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Demo Sales Manager')]]")
	private WebElement eleLoggedName;
	
	/**
	 * Verify logged in name.
	 *
	 * @param text the text
	 * @return the home page
	 */
	public HomePage verifyLoggedInName(String text) {
		verifyPartialText(eleLoggedName, text);
		return this;
	}

	/** The ele CR M SFA link. */
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement eleCRM_SFALink;
	
	/**
	 * Click CR M SFA link.
	 *
	 * @return the my home page
	 */
	public MyHomePage clickCRM_SFALink(){
		click(eleCRM_SFALink);
		return new MyHomePage(driver, test);
	}
	
	
	

}
