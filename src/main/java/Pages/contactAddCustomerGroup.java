package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactAddCustomerGroup {

	WebDriver driver;
	
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/customer-group']")
	WebElement customergroupoption;
	@FindBy(xpath="//button[@class='btn btn-block btn-primary btn-modal']")
	WebElement customergroupaddbtn;
	@FindBy(id="name")
	WebElement customrgroupname;
	@FindBy(id="amount")
	WebElement calcpercentage;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement customergroupsavebtn;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement customergroupsearch;
	@FindBy(xpath="//td[@class='sorting_1']")
	WebElement selectedcustomergroup;
	
	
	public contactAddCustomerGroup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void CustomerGroupOption()
	{
		customergroupoption.click();
	}
	public void CustomerGroupAddBtn()
	{
		customergroupaddbtn.click();
	}
	public WebElement CustomerGroupNameField()
	{
		return customrgroupname;
	}
	public WebElement CalculationPercentageField()
	{
		return calcpercentage;
	}
	public void CustomerGroupSaveBtn()
	{
		customergroupsavebtn.click();
	}
	public WebElement customerGroupSerachField()
	{
		return customergroupsearch;
	}
	public WebElement selectedCustomerGroup()
	{
		return selectedcustomergroup;
	}
}
