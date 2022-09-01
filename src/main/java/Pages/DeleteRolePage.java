package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteRolePage {
	
	WebDriver driver;
	@FindBy(xpath="//button[@class='btn btn-xs btn-danger delete_role_button']")
	WebElement roledeletebtn;
	@FindBy(xpath="//button[@class='swal-button swal-button--confirm swal-button--danger']")
	WebElement deleteconfirmbtn;
	@FindBy(xpath="//td[@class='dataTables_empty']")
	WebElement notelementmsg;
	public DeleteRolePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement deleteRole()
	{
		return roledeletebtn;
	}
	public WebElement deleteConfirmBtn()
	{
		return deleteconfirmbtn;
	}
	public WebElement errorMsgFetch()
	{
		return notelementmsg;
	}
}
