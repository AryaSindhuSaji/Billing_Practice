package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addVariationsPage {
	
	WebDriver driver;
	@FindBy(xpath="(//i[@class='fa fa-circle-o']//following::span)[1]")
	WebElement variationsoption;
	@FindBy(xpath="//button[@class='btn btn-block btn-primary btn-modal']")
	WebElement addvariationsbtn;
	@FindBy(id="name")
	WebElement variationsname;
	@FindBy(xpath="//div[@class='col-sm-7']//following::input")
	WebElement variationvalue;
	@FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
	WebElement variationsavebtn;
	@FindBy(xpath="//td[@class='sorting_1']")
	WebElement addedvariation;
	

	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement variationsearchfield;
	@FindBy(xpath="//button[@class='btn btn-xs btn-danger delete_variation_button']")
	WebElement variationdelete;
	@FindBy(xpath="//button[@class='swal-button swal-button--confirm swal-button--danger']")
	WebElement deleteokbtn;
	@FindBy(xpath="//td[@class='dataTables_empty']")
	WebElement errormsgget;
	
	public addVariationsPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);}




	public void VariationsOptionClick()
	{
		variationsoption.click();
	}
	public void VariationsAddBtnClick()
	{
		addvariationsbtn.click();
	}
	public WebElement VariationsNameField()
	{
		return variationsname;
	}
	public WebElement VariationValueField()
	{
		return variationvalue;
	}
	public void VariationsSaveBtnClick()
	{
		variationsavebtn.click();
	}
	public WebElement CheckAddedVariation()
	{
		return addedvariation;
	}
	public WebElement VariationSearchField()
	{
		return variationsearchfield;
	}
	public void VariationDeleteBtn()
	{
		variationdelete.click();
	}
	public void DeleteOKBtnClick()
	{
		deleteokbtn.click();
	}
	public WebElement variationerrorMsgFetch()
	{
		return errormsgget;
	}

}
