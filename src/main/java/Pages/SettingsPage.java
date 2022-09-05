package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

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
	
	
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/printers']")
	WebElement receiptprinteroption;
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/printers/create']")
	WebElement addprinterbtn;
	@FindBy(id="name")
	WebElement printername;
	@FindBy(id="connection_type")
	WebElement networktypeselect;
	@FindBy(id="capability_profile")
	WebElement capabilityprofileselect;
	@FindBy(id="char_per_line")
	WebElement charactersperline;
	@FindBy(id="path")
	WebElement printerpath;
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	WebElement printersave;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement newprintersearch;
	@FindBy(xpath="//td[@class='sorting_1']")
	WebElement selectedprinter;
	
	
	@FindBy(xpath="(//i[@class='fa fa-file']//following::span)[1]")
	WebElement invoicesettingoption;
	@FindBy(xpath="//button[@data-href='https://qalegend.com/billing/public/invoice-schemes/create']")
	WebElement invoiceaddoption;
	@FindBy(xpath="(//div[@class='option-div']//following::h4)[2]")
	WebElement formatselection;
	@FindBy(id="name")
	WebElement invoicename;
	@FindBy(id="start_number")
	WebElement startnumber;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement invoicesavebtn;
	@FindBy(xpath="//section[@class='content-header']//following::h1")
	WebElement invoiceheadingforwait;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement newinvoicesearch;
	@FindBy(xpath="//td[@class='sorting_1']")
	WebElement selectedinvoice;
	
	
	
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/business-location']")
	WebElement businesslocationoption;
	@FindBy(xpath="(//i[@class='fa fa-plus'])[1]")
	WebElement bussinesslocationadd;
	@FindBy(id="name")
	WebElement locationname;
	@FindBy(id="location_id")
	WebElement locationid;
	@FindBy(id="landmark")
	WebElement landmarklocation;
	@FindBy(id="city")
	WebElement cityoflocation;
	@FindBy(id="zip_code")
	WebElement locationzipcode;
	@FindBy(id="state")
	WebElement locationstate;
	@FindBy(id="country")
	WebElement locationcountry;
	@FindBy(id="mobile")
	WebElement locationmobile;
	@FindBy(xpath="(//select[@class='form-control'])[1]")
	WebElement invoiceschemeselect;
	@FindBy(id="invoice_layout_id")
	WebElement invoicelayout;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement locationSave;
	@FindBy(xpath="//section[@class='content-header']//following::h1")
	WebElement locationhomeforwait;
	@FindBy(xpath = "//input[@class='form-control input-sm']")
	WebElement locationsearch;
	@FindBy(xpath="//td[@class='sorting_1']")
	WebElement selectedlocation;

	
	public SettingsPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Tax Rates Add 
	
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
	
	
	//Receipt printer Add
	
	public WebElement receiptPrinterOptionClick()
	
	{
		return receiptprinteroption;
	}
	public WebElement addPrinterBtnClick()
	{
		return addprinterbtn;
	}
	public WebElement printerNameField()
	{
		return printername;
	}
	public WebElement networkTypeSelect()
	{
		return networktypeselect;
	}
	public WebElement capabilityProfileSelect()
	{
		return capabilityprofileselect;
	}
	public WebElement charactersPerLineField()
	{
		return charactersperline;
	}
	public WebElement printerPathField()
	{
		return printerpath;
	}
	public WebElement printerSaveBtn()
	{
		return printersave;
	}
	public WebElement newPrinterSearchField()
	{
		return newprintersearch;
	}
	public WebElement selectedPrinter()
	{
		return selectedprinter;
	}
	
	
	//Invoice Settings
	
	public WebElement invoiceSettingOptionClick()
	{
		return invoicesettingoption;
	}
	public WebElement invoiceAddBtnClick()
	{
		return invoiceaddoption;
	}
	public WebElement invoiceFormatSelection()
	{
		return formatselection;
	}
	public WebElement invoiceNameField()
	{
		return invoicename;
	}
	public WebElement invoiceStartsFrom()
	{
		PageUtility.clearText(startnumber);
		return startnumber;
	}
	public WebElement InvoiceSaveBtnClick()
	{
		return invoicesavebtn;
	}
	public WebElement InvoiceSettingsHeading()
	{
		return invoiceheadingforwait;
	}
	public WebElement invoiceSearchField()
	{
		return newinvoicesearch;
	}
	public WebElement selctedInvoice()
	{
		return selectedinvoice;
	}
	
	
	//Business Location
	public WebElement bussinessLocationOptionClick()
	{
		return businesslocationoption;
	}
	public WebElement bussinessLocationAddBtn()
	{
		return bussinesslocationadd;
	}
	public WebElement locationNameField()
	{
		return locationname;
	}
	public WebElement LocationIdField()
	{
		return locationid;
	}
	public WebElement locatrionLandMarkField()
	{
		return landmarklocation;
	}
	public WebElement locationCityField()
	{
		return cityoflocation;
	}
	public WebElement locationZipCodeField()
	{
		return locationzipcode;
	}
	public WebElement locationStateField()
	{
		return locationstate;
	}
	public WebElement locationCountryField()
	{
		return locationcountry;
	}
	public WebElement locationMobileField()
	{
		return locationmobile;
	}
	public WebElement invoiceSchemeSelect()
	{
		return invoiceschemeselect;
	}
	public WebElement invoiceLayoutSelect()
	{
		return invoicelayout;
	}
	public WebElement locationSaveBtn()
	{
		return locationSave;
	}
	public WebElement locationHomePageForWait()
	{
		return locationhomeforwait;
	}
	public WebElement locationSearchField() 
	{
		return locationsearch;
	}
	public WebElement locationSelectedToSearch()
	{
		return selectedlocation;
	}
}
