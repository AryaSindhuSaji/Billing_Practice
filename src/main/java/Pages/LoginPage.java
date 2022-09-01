package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(id="username")
	WebElement usernamefield;
	@FindBy(id="password")
	WebElement passwordfield;
	@FindBy(xpath ="//button[@class='btn btn-primary']")
	WebElement loginbtn;
	@FindBy(name="remember")
	WebElement remeberbox;
	@FindBy(xpath="//span[@class='help-block']//strong")
	WebElement invalidmsg;
	@FindBy(xpath="//section[@class='content-header']//following::h1")
	WebElement elementfromhome;
	@FindBy(xpath="//button[@class='btn btn-default btn-sm']")
	WebElement endtour;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement EndTourButton() {
		return endtour;
	}

	public void LoginMethod(String username,String password)
	{
	PageUtility.enterText(UserNameField(),username);
	PageUtility.enterText(PasswordField(),password);
	PageUtility.clickOnElement(LoginButtonAction());
	PageUtility.clickOnElement(EndTourButton());
	}
	
	public WebElement UserNameField()
	{
		return usernamefield;
	}
	public WebElement PasswordField() 
	{
		return passwordfield;
	}
	public WebElement LoginButtonAction()
	{
		return loginbtn;
	}
	public WebElement RemeberMeBox() 
	{
		return remeberbox;
		
	}
	
	public String InvalidMsgFetch()
	{
		
		String errormsg=PageUtility.getElementText(invalidmsg);
		return errormsg;
	}
	public WebElement HomePageText()
	{
		return elementfromhome;
		
	}

	
}