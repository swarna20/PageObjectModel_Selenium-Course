package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods {
	
	public DuplicateLead (RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(how= How.ID, using = "createLeadForm_companyName")
	private WebElement eleCompanyName;
	public DuplicateLead enterDuplicateCompanyName(String data){
		type(eleCompanyName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//input[@value='Create Lead']")
	private WebElement eleCreateLeadButton;
	public ViewLeadPage clickCreateLeadButton(){
		click(eleCreateLeadButton);
		return new ViewLeadPage(driver, test);
	}
	

}
