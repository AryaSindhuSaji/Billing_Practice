package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class salesCommissionAgentPage {
	
	WebDriver driver;
	@FindBy(xpath="//i[@class='fa fa-handshake-o']//following::span")
	WebElement salescommissionagentoption;
	@FindBy(xpath="//button[@data-href='https://qalegend.com/billing/public/sales-commission-agents/create']")
	WebElement salescommissionadd;
	@FindBy(id="first_name")
	WebElement firstname;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="contact_no")
	WebElement contact;
	@FindBy(id="cmmsn_percent")
	WebElement commissionpercent;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement commissionsavebtn;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement newcommissionagentsearchfield;
	@FindBy(xpath="//td[@class='sorting_1']")
	WebElement selectedagent;
	
	

	
	
	public salesCommissionAgentPage(WebDriver driver) {
		
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	public WebElement salesCommissionAgentOptionClick()
	{
		return salescommissionagentoption;
	}
	public WebElement salesCommissionAddbtnClick()
	{
		return salescommissionadd;
	}
	public WebElement salesAgentFirstname()
	{
		return firstname;
	}
	public WebElement salesAgentEmail()
	{
		return email;
	}
	public WebElement salesAgentContactnumber()
	{
		return contact;
	}
	public WebElement salesAgentCommisiionField()
	{
		return commissionpercent;
	}
	public WebElement salesAgentCommissionSaveBtnClick()
	{
		return commissionsavebtn;
	}
	public WebElement salesCommissionAgentSearchField()
	{
		return newcommissionagentsearchfield;
	}
	public WebElement selectedSalesCommissionAgent()
	{
		return selectedagent;
	}
}
