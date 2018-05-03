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
 * The Class EditLeadPage.
 */
public class EditLeadPage extends ProjectMethods {
	
	/**
	 * Instantiates a new edits the lead page.
	 *
	 * @param driver the driver
	 * @param test the test
	 */
	public EditLeadPage(RemoteWebDriver driver, ExtentTest test ) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	/** The ele updated company name. */
	@FindBy(how=How.ID, using="updateLeadForm_companyName")
	private WebElement eleUpdatedCompanyName;
	
	/**
	 * Enter updated company name.
	 *
	 * @param data the data
	 * @return the edits the lead page
	 */
	public EditLeadPage enterUpdatedCompanyName(String data){
		type(eleUpdatedCompanyName, data);
		return this;
		
	}
	
	   /** The ele update button. */
   	@FindBy(how=How.XPATH, using="//input[@value='Update']")
       private WebElement eleUpdateButton;
       
       /**
        * Click edit button.
        *
        * @return the view lead page
        */
       public ViewLeadPage clickEditButton(){
       	click(eleUpdateButton);
       	return new ViewLeadPage(driver, test);
       }

}
