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
 * The Class MyLeadsPage.
 */
public class MyLeadsPage extends ProjectMethods {
    
    /**
     * Instantiates a new my leads page.
     *
     * @param driver the driver
     * @param test the test
     */
    public  MyLeadsPage(RemoteWebDriver driver, ExtentTest test){
    	this.driver=driver;
    	this.test=test;
        PageFactory.initElements(driver,this);
    }

    /** The ele create lead. */
    @FindBy(how= How.LINK_TEXT, using = "Create Lead")
    private WebElement eleCreateLead;
    
    /**
     * Click create lead.
     *
     * @return the creates the lead page
     */
    public CreateLeadPage clickCreateLead(){
        click(eleCreateLead);
        return new CreateLeadPage(driver, test);
    }
    
    /** The ele find leads. */
    @FindBy(how=How.LINK_TEXT, using="Find Leads")
    private  WebElement eleFindLeads;
    
    /**
     * Click find leads.
     *
     * @return the find lead page
     */
    public FindLeadPage clickFindLeads(){
    	click(eleFindLeads);
    	return new FindLeadPage(driver, test);
    }
    
    
    @FindBy(how=How.LINK_TEXT, using="Merge Leads")
    private  WebElement eleMergeLeads;
    public MergeLeadPage clickMergeLeads(){
    	click(eleMergeLeads);
    	return new MergeLeadPage(driver, test);
    }
    
        
    
    
}
