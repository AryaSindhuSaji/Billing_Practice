package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;

public class CalculatorPage {
	WebDriver driver;
	@FindBy(xpath="//i[@class='fa fa-calculator fa-lg']")
	WebElement calculator;
	@FindBy(id="2")
	WebElement intergertwo;
	@FindBy(id="8")
	WebElement intergereight;
	@FindBy(id="+")
	WebElement operatorplus;
	@FindBy(id="equals")
	WebElement equalssymbol;
	@FindBy(xpath="//input[@name='result']")
	WebElement resultfield;
	
	
	
	public CalculatorPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}




	public WebElement calculatorClick()
	{
		return calculator;
		
	}
	public WebElement integerTwo()
	{
		return intergertwo;
	}
	public WebElement integerEight()
	{
		return intergereight;
	}
	public WebElement opertorPluseSymbol()
	{
		return operatorplus;
		
	}
	public WebElement equalsSymbolClick()
	{
		return equalssymbol;
	}
	public WebElement resultField()
	{
		return resultfield;
		
	}
}
