package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

public class purchasePage {
	
	WebDriver driver;
	@FindBy(xpath="(//i[@class='fa fa-angle-left pull-right'])[4]")
	WebElement purchaseoption;
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/purchases/create']")
	WebElement addpurchaseoption;
	@FindBy(xpath="//i[@class='fa fa-plus-circle text-primary fa-lg']")
	WebElement addsupplierbtn;
	@FindBy(id="ref_no")
	WebElement referencenumber;
	@FindBy(id="status")
	WebElement purchasestatus;
	@FindBy(xpath="(//select[@class='form-control select2 select2-hidden-accessible'])[2]")
	WebElement businesslocation;
	@FindBy(xpath="//button[@class='btn btn-link btn-modal']")
	WebElement productadd;
	@FindBy(id="select2-supplier_id-container")
	WebElement suppliername;
	@FindBy(id="modalTitle")
	WebElement addtproducttext;
	@FindBy(id="submit_quick_product")
	WebElement quickaddedprodsave;
	@FindBy(xpath="//input[@class='form-control payment-amount input_number']")
	WebElement amount;
	@FindBy(xpath="//select[@class='form-control col-md-12 payment_types_dropdown']")
	WebElement paymentmethodselect;
	@FindBy(id="submit_purchase_form")
	WebElement purchasesave;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement purchasesearchfield;
	@FindBy(xpath="//td[@class='sorting_1']//following::td[1]")
	WebElement selectedpurchase;
	public purchasePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement purchaseOptionClick()
	{
		return purchaseoption;
	}
	public WebElement addPurchaseOption()
	{
		return addpurchaseoption;
	}
	public WebElement addSupplier()
	{
		return addsupplierbtn;
	}
	public WebElement referenceNumberField()
	{
		return referencenumber;
	}
	public WebElement purchaseSatatusSelect()
	
	{
		return purchasestatus;
	}
	public WebElement businessLocatioSelect() 
	{
		return businesslocation;
	}
	public WebElement productAddBtn()
	{
		return productadd;
	}
	public WebElement selectSupplier()
	{
		return suppliername;
	}
	public WebElement productaddTextField()
	{
		return addtproducttext;
	}
	public WebElement quickAddedProductSaveBtn()
	{
		return quickaddedprodsave;
	}
	public WebElement amountPurchase()
	{
	
		return amount;
	}
	public WebElement payemtMethodSelection()
	{
		return paymentmethodselect;
	}
	public WebElement purchaseSaveBtn()
	{
		return purchasesave;
	}
	public WebElement purchaseSearchField()
	{
		return purchasesearchfield;
	}
	
	
	public WebElement selectedPurchaseTocheck()
	{
		return selectedpurchase;
	}
}
