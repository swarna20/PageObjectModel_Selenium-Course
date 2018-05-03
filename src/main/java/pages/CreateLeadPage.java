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
 * The Class CreateLeadPage.
 */
public class CreateLeadPage extends ProjectMethods {
    
    /**
     * Instantiates a new creates the lead page.
     *
     * @param driver the driver
     * @param test the test
     */
    public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
    	this.driver=driver;
    	this.test=test;
       PageFactory.initElements(driver,this);
    }

    /** The ele company name. */
    @FindBy(how= How.ID, using = "createLeadForm_companyName")
    private WebElement eleCompanyName;
    
    /**
     * Enter company name.
     *
     * @param data the data
     * @return the creates the lead page
     */
    public CreateLeadPage enterCompanyName(String data){
        type(eleCompanyName, data);
        return this;
    }

    /** The ele first name. */
    @FindBy(how= How.ID, using = "createLeadForm_firstName")
    private WebElement eleFirstName;
    
    /**
     * Enter first name.
     *
     * @param data the data
     * @return the creates the lead page
     */
    public CreateLeadPage enterFirstName(String data){
        type(eleFirstName, data);
        return this;
    }

    /** The ele last name. */
    @FindBy(how= How.ID, using = "createLeadForm_lastName")
    private WebElement eleLastName;
    
    /**
     * Enter last name.
     *
     * @param data the data
     * @return the creates the lead page
     */
    public CreateLeadPage enterLastName(String data){
        type(eleLastName, data);
        return this;
    }

    /** The ele email. */
    @FindBy(how= How.ID, using = "createLeadForm_primaryEmail")
    private WebElement eleEmail;
    
    /**
     * Enter email address.
     *
     * @param data the data
     * @return the creates the lead page
     */
    public CreateLeadPage enterEmailAddress(String data){
        type(eleEmail, data);
        return this;
    }

    /** The ele phone number. */
    @FindBy(how= How.ID, using = "createLeadForm_primaryPhoneNumber")
    private WebElement elePhoneNumber;
    
    /**
     * Enterele phone number.
     *
     * @param data the data
     * @return the creates the lead page
     */
    public CreateLeadPage enterelePhoneNumber(String data){
        type(elePhoneNumber,data);
        return this;
    }

    /** The ele create lead. */
    @FindBy(how=How.XPATH, using="//input[@value='Create Lead']")
    private WebElement eleCreateLead;
    
    /**
     * Click create leadbutton.
     *
     * @return the view lead page
     */
    public ViewLeadPage clickCreateLeadbutton(){
        click(eleCreateLead);
        return  new ViewLeadPage(driver, test);
    }



}
