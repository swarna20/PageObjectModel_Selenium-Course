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
 * The Class ViewLeadPage.
 */
public class ViewLeadPage extends ProjectMethods {

	String companyName;

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	private WebElement eleFirstName;

	public ViewLeadPage verifyFirsrName(String data) {
		verifyExactText(eleFirstName, data);
		companyName = data;
		return this;
	}

	/** The ele edit button. */
	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement eleEditButton;	
	public EditLeadPage clickEditButton() {
		click(eleEditButton);
		return new EditLeadPage(driver, test);
	}

	/** The ele company name. */
	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	private WebElement eleCompanyName;
	public ViewLeadPage getCompanyName() {
		companyName = getText(eleCompanyName);
		return this;

	}

	public void verifyCompanyName() {
		verifyPartialText(eleCompanyName, companyName);
	}

	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement eleDeletebutton;

	public MyLeadsPage clickDeletebutton() {
		click(eleDeletebutton);
		return new MyLeadsPage(driver, test);
	}

	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	private WebElement eleDuplicatebutton;

	public DuplicateLead clickDuplicatebutton() {
		click(eleDuplicatebutton);
		return new DuplicateLead(driver, test);
	}

}
