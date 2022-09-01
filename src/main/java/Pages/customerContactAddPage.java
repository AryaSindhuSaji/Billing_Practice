package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customerContactAddPage {
	
	WebDriver driver;
	@FindBy(xpath="(//i[@class='fa fa-star'])[2]")
	WebElement customersoption;
	@FindBy(xpath="//button[@class='btn btn-block btn-primary btn-modal']")
	WebElement customercontactaddbtn;
	@FindBy(id="name")
	WebElement customername;
	@FindBy(id="contact_id")
	WebElement customercontactid;
	@FindBy(id="mobile")
	WebElement customermobile;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement customercontactsavebtn;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement customercontactsearch;
	@FindBy(xpath="(//td[@class='sorting_1']//following::td)[1]")
	WebElement newselectedcustomer;
	
	
	
	public customerContactAddPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void CutomersOptionDrp()
	{
		customersoption.click();
	}
	public void CustomerContactAddBtn()
	{
		customercontactaddbtn.click();
	}
	public WebElement CustomerNameField()
	{
		return customername;
	}
	public WebElement CustomerContactIdField()
	{
		return customercontactid;
	}
	public WebElement CustomerMobileField()
	{
		return customermobile;
	}
	public void CustomercontactSaveBtn() {
		
		customercontactsavebtn.click();
	}
	public WebElement customerContactSearchfieldClick()
	{
		return customercontactsearch;
	}
	public WebElement selectedCustomer()
	{
		
		return newselectedcustomer;
	}


}
