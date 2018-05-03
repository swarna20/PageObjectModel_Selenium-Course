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

/**
 * The Class MergeLead.
 */
public class MergeLeadPage extends ProjectMethods {
	
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(how=How.XPATH, using="(//img[@alt='Lookup'])[1]")
	private WebElement eleFromLead;
	public FindLeadsWindowPage clickFromLeadIdIcon(){
		click(eleFromLead);
		return new FindLeadsWindowPage(driver, test);
	}
	
	@FindBy(how=How.XPATH, using="(//img[@alt='Lookup'])[2]")
	private WebElement eleToLead;
	public FindLeadsWindowPage clickToLeadIdIcon(){
		click(eleToLead);
		return new FindLeadsWindowPage(driver, test);
	}
	
	@FindBy(how=How.XPATH, using="//a[text()='Merge']")
	private WebElement eleMerge;
	public ViewLeadPage clickMergeButton(){
		click(eleMerge);
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
}
