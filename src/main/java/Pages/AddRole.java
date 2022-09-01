package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

public class AddRole {

	WebDriver driver;
	@FindBy(xpath="//button[@class='btn btn-default btn-sm']")
	WebElement endtour;
	@FindBy(xpath="//i[@class='fa fa-angle-left pull-right']")
	WebElement usermanagedrop;
	@FindBy(xpath="//i[@class='fa fa-briefcase']//following::span")
	WebElement roleoption;
	@FindBy(xpath="//a[@class='btn btn-block btn-primary']")
	WebElement addrolebtn;
	@FindBy(id="name")
	WebElement rolenemfield;
	@FindBy(xpath="(//ins[@class='iCheck-helper'])[1]")
	WebElement userpermission;
	@FindBy(xpath="(//ins[@class='iCheck-helper'])[6]")
	WebElement rolepermission;
	@FindBy(xpath="(//ins[@class='iCheck-helper'])[11]")
	WebElement supplierpermission;
	@FindBy(xpath="(//ins[@class='iCheck-helper'])[16]")
	WebElement customerpermission;
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	WebElement rolsave;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement rolesearchfield;
	@FindBy(xpath="//td[@class=\"sorting_1\"]")
	WebElement rolesearch;
	
	
	public AddRole(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void RoleOptionBtnClick()
	{
		roleoption.click();
	}
	public void AddNewRoleBtn()
	{
		addrolebtn.click();
	}
	public WebElement RoleNameTextField()
	{
		return rolenemfield;
	}
	public void PermissionCheckBox()
	{
		userpermission.click();
		rolepermission.click();
		supplierpermission.click();
		customerpermission.click();
		
	}
	public void roleSaveBtn()
	{
		rolsave.click();
	}
	public WebElement RoleSearchField()
	
	{
		return rolesearchfield;
	}
	public WebElement AddedRoleSearch()
	{
		
		return rolesearch;

	}
	
	
}
