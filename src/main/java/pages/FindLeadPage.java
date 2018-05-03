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
 * The Class FindLeadPage.
 */
public class FindLeadPage extends ProjectMethods {
	
	/** The data. */
	
		/**
		 * Instantiates a new find lead page.
		 *
		 * @param driver the driver
		 * @param test the test
		 */
		public FindLeadPage(RemoteWebDriver driver, ExtentTest test){
			this.driver = driver;
			this.test = test;
		PageFactory.initElements(driver, this);
	}
	
	/** The ele company name. */
	@FindBy(how=How.XPATH, using="(//input[@name='companyName'])[2]")
	private WebElement eleCompanyName;
	
	/**
	 * Enter company name.
	 *
	 * @param data1 the data 1
	 * @param data2 the data 2
	 * @return the find lead page
	 */
	public FindLeadPage enterCompanyName(String data){
		type(eleCompanyName, data);
		return this;
	}
	
	/** The ele find leads button. */
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	
	/**
	 * Click find leads button.
	 *
	 * @return the find lead page
	 */
	public FindLeadPage clickFindLeadsButton(){
		click(eleFindLeadsButton);
		return this;
		
	}
	
	/** The ele lead for edit. */
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleLeadForEdit;
	
	/**
	 * Click lead for edit.
	 *
	 * @return the view lead page
	 */
	public ViewLeadPage clickLeadForEdit(){
		
		click(eleLeadForEdit);
		
		return new ViewLeadPage(driver, test);
	}

}