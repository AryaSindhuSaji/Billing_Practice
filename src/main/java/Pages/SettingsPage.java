package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

	
	WebDriver driver;
	@FindBy(xpath="(//i[@class='fa fa-angle-left pull-right'])[11]")
	WebElement settingsOption;
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/tax-rates']")
	WebElement taxratesoption;
	@FindBy(xpath="//i[@class='fa fa-plus']")
	WebElement taxratesadd;
	@FindBy(id="name")
	WebElement taxname;
	@FindBy(id="amount")
	WebElement taxamount;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement taxratesave;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement newtaxratesearchfield;
	@FindBy(xpath="(//td[@class=\"sorting_1\"])[2]")
	WebElement selectedtax;
	
	public SettingsPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement settingsOptionClick()
	{
		return settingsOption;
	}
	public WebElement taxRatesOptionClick()
	{
		return taxratesoption;
	}
	public WebElement taxRatesAddBtn()
	{
		return taxratesadd;
	}
	public WebElement taxNameField()
	{
		return taxname;
	}
	public WebElement taxAmountField()
	{
		return taxamount;
	}
	public WebElement taxRateSaveBtnClick()
	{ 
		return taxratesave;
	}
	public WebElement taxRatesSearchField()
	{
		return newtaxratesearchfield;
	}
	public WebElement selectedTax()
	{
		return selectedtax;
	}
}
