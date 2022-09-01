package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAddUser {
	
	WebDriver driver;
	
	@FindBy(xpath="//i[@class='fa fa-angle-left pull-right']")
	WebElement usermanagedrop;
	@FindBy(xpath="//ul[@class='treeview-menu menu-open']//child::span")
	WebElement useroption;
	@FindBy(xpath="//a[@class='btn btn-block btn-primary']")
	WebElement adduserbtn;
	@FindBy(id="surname")
	WebElement prefix;
	@FindBy(id="first_name")
	WebElement firstname;
	@FindBy(id="last_name")
	WebElement lastname;
	@FindBy(id="email")
	WebElement email;
	@FindBy(xpath="//select[@class='form-control select2 select2-hidden-accessible']")
	WebElement roleselect;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="confirm_password")
	WebElement confirmpassword;
	@FindBy(id="cmmsn_percent")
	WebElement commission;
	@FindBy(id="submit_user_button")
	WebElement usersubmitbtn;
	@FindBy(xpath="(//td[@class='sorting_1']//following::td)[1]")
	WebElement addeduser;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement newusersearch;
	
	public HomePageAddUser(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void UserManagementDropdown() {
		
		usermanagedrop.click();
		
	}
	public void UserOption() {
		useroption.click();
	}

	public void AddUser() {
		adduserbtn.click();
	}
	public WebElement PrefixTextField()
	{
		return prefix;
	}
	public WebElement FirstnameField()
	{
		return firstname;
		
	}
	public WebElement LastNameField()
	{
		return lastname;
	}
	public WebElement EmailField()
	{
		return email;
	}
	public WebElement RoleSelection()
	{
		
		return roleselect;
	}
	public WebElement PasswordTextField() {
		return password;
	}
	public WebElement ConfirmPasswordTextField()
	{
		return confirmpassword;
	}
	public WebElement CommissionField()
	{
		return commission;
	}
	public void UserSaveBtnClick()
	{
		usersubmitbtn.click();
	}
	public WebElement AddedUserCheck()
	{
		return addeduser;
	}
	public WebElement newUserSearch()
	{
	return newusersearch;
	}
}

