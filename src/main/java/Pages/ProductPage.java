package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

public class ProductPage {

	WebDriver driver;
	@FindBy(xpath="(//i[@class='fa fa-angle-left pull-right'])[3]")
	WebElement productoption;
	@FindBy(xpath="(//a[@href='https://qalegend.com/billing/public/products/create'])[1]")
	WebElement addproduct;
	@FindBy(id="name")
	WebElement productname;
	@FindBy(id="brand_id")
	WebElement brandnameselect;
	@FindBy(id="unit_id")
	WebElement unitselect;	
	@FindBy(id="alert_quantity")
	WebElement alertquantitytext;
	@FindBy(id="single_dpp")
	WebElement exctax;
	@FindBy(xpath="//button[@class='btn btn-primary submit_product_form']")
	WebElement productsavebtn;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement productsearchfield;
	@FindBy(xpath="//td[@class='sorting_1']")
	WebElement selectedproduct;
	@FindBy(xpath="//button[@class='btn btn-info dropdown-toggle btn-xs']")
	WebElement actionbtnonproduct;
	@FindBy(xpath="//a[@class='add-opening-stock']")
	WebElement stockopeningoption;
	@FindBy(xpath="(//input[@class='form-control input-sm input_number purchase_quantity input_quantity'])[1]")
	WebElement quantityfield;
	@FindBy(id="add_opening_stock_btn")
	WebElement openingstocksavebtn;
	@FindBy(xpath="(//td[@class='sorting_1']//following::td)[2]")
	WebElement selectedproductquantity;
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/products']")
	WebElement listproduct;
	
	
	@FindBy(xpath="(//i[@class='fa fa-circle-o'])[2]")
	WebElement sellingpricegroupoption;
	@FindBy(xpath="(//i[@class='fa fa-plus'])[1]")
	WebElement sellingpricegroupaddbtn;
	@FindBy(id="name")
	WebElement sellinggroupnamefield;
	@FindBy(name="description")
	WebElement sellingpricergroupdesc;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement sellingpricegroupsave;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement sellingpricegroupsearch;
	@FindBy(xpath="//td[@class='sorting_1']")
	WebElement selectedsellingpricegroup;
	@FindBy(xpath="//section[@class='content-header']//following::h1")
	WebElement waitforsellinggrouphome;
	
	@FindBy(xpath="//i[@class='fa fa-diamond']")
	WebElement brandoption;
	@FindBy(xpath="//button[@class='btn btn-block btn-primary btn-modal']")
	WebElement brandaddbtn;
	@FindBy(id="name")
	WebElement brandnamefield;
	@FindBy(id="description")
	WebElement branddesc;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement brandsavebtn;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement brandsearchfield;
	@FindBy(xpath="//td[@class='sorting_1']")
	WebElement selectedbrand;
	public ProductPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	public WebElement ProductOptionClick()
	{
		return productoption;
	}
	public WebElement AddProductOption()
	{
		return addproduct;
	}
	public WebElement ProductNameField()
	{
		return productname;
	}
	public WebElement brandNameSelectTag() {
		
		return brandnameselect;
	}
	public WebElement unitSelectTag()
	{
		return unitselect;
	}
	public WebElement AlertQuantityTextField()
	{
		return alertquantitytext;
	}
	public WebElement EXCTaxField()
	{
		
		return exctax;
	}
	public WebElement ProductSaveBtn()
	{
		return productsavebtn;
	}
	public WebElement productSearchFieldSelect()
	{
		return productsearchfield;
	}
	public WebElement selectedProductGet()
	{
		return selectedproduct;
	}
	
	public WebElement actionBtnClickOnProduct()
	{
		return actionbtnonproduct;
	}
	public WebElement openingStockOptionClick()
	{
		return stockopeningoption;
	}
	public WebElement quantityField()
	{
		quantityfield.clear();
		return quantityfield;
	}
	public WebElement openingStockSaveBtnClick()
	{
		return openingstocksavebtn;
	}
	public WebElement newlyAddedOpeningStock()
	{
		return selectedproductquantity;
	}
	public WebElement listProduct()
	{
		return listproduct;
	}
	
	
	
	
	
	
	
	public WebElement SellingPriceGroupOptionClick()
	
	{
		return sellingpricegroupoption;
	}
	public WebElement SellingPriceGroupAddBtnClick()
	{
		return sellingpricegroupaddbtn;
	}
	public WebElement SellingPriceGroupTextField()
	{
		return sellinggroupnamefield;
	}

	public WebElement SellingPriceGroupDescBox() {
		
		return sellingpricergroupdesc;
	}
	public WebElement SellingPriceGroupSaveBtn()
	{
		return sellingpricegroupsave;
	}
	public WebElement sellingPriceGroupSearchField()
	{
		return sellingpricegroupsearch;
	}
	public WebElement selectedsellingGroupTOCheck()
	{
		return selectedsellingpricegroup;
	}
	public WebElement sellingGroupWaitElement()
	{
		return waitforsellinggrouphome;
	}
	
	
	
	
	
	public WebElement BrandOptionClick()
	{
		return brandoption;
	}
	public WebElement BrandAddBtn()
	{
		return brandaddbtn;
	}
	public WebElement BrandNameTextField()
	{
		return brandnamefield;
	}
	public WebElement BarndDescField()
	{
		return branddesc;
	}
	public WebElement BrandSaveBtnClick()
	{
		return brandsavebtn;
	}

	public WebElement BrandSearch()
	{
		return brandsearchfield;
	}
	public WebElement SelectedBrandTOCheck()
	{
		return selectedbrand;
	}

	
}
