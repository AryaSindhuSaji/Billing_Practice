package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentsAccountPage {
	
	WebDriver driver;
	@FindBy(xpath="(//i[@class='fa fa-money'])[1]")
	WebElement paymentsaccountoption;
	
	public PaymentsAccountPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement PaymentsAccountOptionClick()
	{
		return paymentsaccountoption;
	}

}
