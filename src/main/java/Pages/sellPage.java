package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sellPage {

	WebDriver driver;
	@FindBy(xpath="(//i[@class='fa fa-angle-left pull-right'])[5]")
	WebElement sellOption;
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/discount']")
	WebElement discountoption;
	@FindBy(xpath="(//i[@class='fa fa-plus'])[1]")
	WebElement discountadd;
	@FindBy(id="name")
	WebElement discountname;
	@FindBy(id="brand_id")
	WebElement dicountbrand;
	@FindBy(id="category_id")
	WebElement category;
	@FindBy(xpath="//select[@name='location_id']")
	WebElement location;
	@FindBy(xpath="//select[@name='discount_type']")
	WebElement discounttype;
	@FindBy(id="discount_amount")
	WebElement discountamount;
	@FindBy(id="starts_at")
	WebElement startsat;
	@FindBy(id="ends_at")
	WebElement endat;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement discountsavebtn;
	
	
	
	public sellPage(WebDriver driver) 
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement sellOptionClick() {
		return sellOption;
	}

	public WebElement discountOption() {
		
		return discountoption;
	}
	public WebElement discountAddBtn()
	{
		return discountadd;
	}
	public WebElement discountNameField()
	{
		return discountname;
	}
	public WebElement discountBrandField()
	{
		return dicountbrand;
	}
	public WebElement discountCategoryField()
	{
		return category;
	}
	public WebElement discountLocationSelectField()
	{
		return location;
	}
	public WebElement discountTypeFieldSelect()
	{
		return discounttype;
	}
	public WebElement discountAmountField()
	{
		return discountamount;
	}
	public WebElement discountStartAtField()
	{
		return startsat;
	}
	public WebElement discountEndsAtField()
	{
		return endat;
	}
	public WebElement discountSaveBtnClick()
	{
		return discountsavebtn;
	}
}
