package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentAccountsPage {
	
	WebDriver driver;
	@FindBy(xpath="(//i[@class='fa fa-angle-left pull-right'])[9]")
	WebElement paymentaccoption;
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/account/account']")
	WebElement listaccountoption;
	@FindBy(xpath="(//i[@class='fa fa-plus'])[1]")
	WebElement addaccountbtn;
	@FindBy(id="name")
	WebElement customername;
	@FindBy(id="account_number")
	WebElement accountnumber;
	@FindBy(id="opening_balance")
	WebElement openingbalance;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement newaccountsavebtn;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement accountsserachfield;
	@FindBy(xpath="(//td[@class='sorting_1']//following::td)[1]")
	WebElement selectedaccount;

			
	
	public paymentAccountsPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement paymentAccountOptionClick()
	{
		return paymentaccoption;
	}
	public WebElement listAccountOptionClick()
	{
		return listaccountoption;
	}
	public WebElement addNewAccountBtnClick()
	{
		return addaccountbtn;
		
	}
	public WebElement nameAccountField()
	{
		return customername;
	}
	public WebElement accountNumberField()
	{
		return accountnumber;
	}
	public WebElement openingBalanceField()
	{
		return openingbalance;
	}
	public WebElement newAccountSaveButtonClick()
	{
		return newaccountsavebtn;
	}
	public WebElement accountSearchField()
	{
		return accountsserachfield;
	}
	public WebElement selectedAccount()
	{
		return selectedaccount;
	}
	

}
