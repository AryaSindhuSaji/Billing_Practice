package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class supplierContactAddPage {
	
	WebDriver driver;
	@FindBy(xpath="(//i[@class='fa fa-angle-left pull-right'])[2]")
	WebElement contactdrp;
	@FindBy(xpath="//a[text()=' Suppliers']")
	WebElement suppliersoption;
	@FindBy(xpath="(//i[@class='fa fa-plus'])[1]")
	WebElement supplieraddbtn;
	@FindBy(id="name")
	WebElement suppliername;
	@FindBy(id="supplier_business_name")
	WebElement supplierbusname;
	@FindBy(id="contact_id")
	WebElement suppliercontactid;
	@FindBy(id="mobile")
	WebElement suppliermobile;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement suppliercontactsavebtn;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement suppliercontactsearchfield;
	@FindBy(xpath="//td[@class='sorting_1']")
	WebElement selectedsupplier;
	@FindBy(xpath="//button[@class='btn btn-info dropdown-toggle btn-xs']")
	WebElement supplieractionbtn;
	@FindBy(xpath="//a[@class='edit_contact_button']")
	WebElement supplieredit;
	@FindBy(xpath="(//td[@class='sorting_1\']//following::td)[3]")
	WebElement newcontactid;
	@FindBy(xpath="(//td[@class='sorting_1']//following::td)[3]")
	WebElement editedmobilenumber;
	@FindBy(xpath="//button[text()='Update']")
	WebElement updatebtn;
	@FindBy(xpath="//section[@class='content-header']")
	WebElement elementforwait;
	
	
	public supplierContactAddPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement ContactDropDownArrow()
	{
		return contactdrp;
	}
	public WebElement SuppierOptionClick()
	{
		return suppliersoption;
	}
	public WebElement NewSupplierAddBtn()
	{
		return supplieraddbtn;
	}
	public WebElement SupplierNameField()
	{
		return suppliername;
	}
	public WebElement SupplierBusinessNameField()
	{
		return supplierbusname;
	}
	public WebElement SupplierContactIdField()
	{
		return suppliercontactid;
	}
	public WebElement SupplierMobileField()
	{
		return suppliermobile;
	}
	public WebElement SupplierSaveBtn() {
		
		return suppliercontactsavebtn;
	}
	public WebElement supplierSearchField()
	{
		return suppliercontactsearchfield;
	}
	public WebElement selectedSupplier()
	{
		return selectedsupplier;
		
	}
	public WebElement supplierActionBtn()
	{
		
		return supplieractionbtn;
				
	}
	public WebElement supplierEditBtn()
	{
		return supplieredit;
	}
	public WebElement supplierEditedMobile()
	{
		return editedmobilenumber;
	}
	public WebElement supplierUpdateBtn()
	{
		return updatebtn;
	}
	public WebElement elementForWait()
	{
		return elementforwait;
	}

}
