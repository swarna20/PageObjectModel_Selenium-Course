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
 * The Class MyHomePage.
 */
public class MyHomePage extends ProjectMethods {

    /**
     * Instantiates a new my home page.
     *
     * @param driver the driver
     * @param test the test
     */
    public MyHomePage(RemoteWebDriver driver, ExtentTest test) {
    	this.driver= driver;
    	this.test=test;
        PageFactory.initElements(driver, this);
    }

    /** The ele leads. */
    @FindBy(how= How.LINK_TEXT,using="Leads")
    private WebElement eleLeads;
    
    /**
     * Click leads.
     *
     * @return the my leads page
     */
    public MyLeadsPage clickLeads(){
        click(eleLeads);
        return new MyLeadsPage(driver, test);

    }
}
