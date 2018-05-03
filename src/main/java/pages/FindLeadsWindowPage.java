package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsWindowPage extends ProjectMethods {
	
	public FindLeadsWindowPage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.NAME, using="companyName")
	private WebElement eleCompanyName;
	public FindLeadsWindowPage enterCompanyNammeForFromLeadId(String data){
		switchToWindow(1);
		type(eleCompanyName, data);
		return this;
		
	}

	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	private WebElement eleClickFindLeadButton;
	public FindLeadsWindowPage clickFindLeadsButton(){
		click(eleClickFindLeadButton);
		return this;

	}
	
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleClickLeadId;
	public MergeLeadPage clickOnLeadID(){
		click(eleClickLeadId);
		switchToWindow(0);
		return new MergeLeadPage(driver, test);

	}
	
	public FindLeadsWindowPage enterCompanyNammeForToLeadId(String data){
		switchToWindow(1);
		type(eleCompanyName, data);
		return this;
		
	}

	
	

	
	

}
