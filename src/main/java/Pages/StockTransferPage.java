package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StockTransferPage {
	WebDriver driver;
	@FindBy(xpath="(//i[@class='fa fa-angle-left pull-right'])[6]")
	WebElement stocktransferoption;
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/stock-transfers/create']")
	WebElement addstocktransfer;
	@FindBy(id="ref_no")
	WebElement referencenumber;
	@FindBy(id="location_id")
	WebElement startinglocation;
	@FindBy(id="search_product_for_srock_adjustment")
	WebElement stockproductsearch;
	@FindBy(id="transfer_location_id")
	WebElement transferlocation;
	@FindBy(xpath="(//tr[@class='product_row']//following::td)[1]")
	WebElement productselected;
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	WebElement stocktransfersave;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement stocktransfersearch;
	@FindBy(xpath="(//tr[@class='odd']//following::td)[1]")
	WebElement selectedstocktarnsferrefe;
	
	public StockTransferPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void StockTransferOptionClick()
	{
		stocktransferoption.click();
	}
	public void AddStocktransferOption()
	{
		addstocktransfer.click();
	}
	public WebElement ReferenceNumberField()
	{
		return referencenumber;	
	}
	public WebElement StartingLocationSelection()
	{
		return startinglocation;
	}
	public WebElement ProductSearchFieldForStockTransfer() {
		return stockproductsearch;
	}
	public WebElement TransferLoactionSelection()
	{
		return transferlocation;
	}
	public void ProductSelectList()
	{
		productselected.click();
	}
	public WebElement StockTransferSaveBtnClick()
	{
		return stocktransfersave;
	}
	public WebElement stockTransferSearchField()
	{
		return stocktransfersearch;
	}
	
	public WebElement selectedStockTransferRefnumber() {
		
		return selectedstocktarnsferrefe;
	}

}
