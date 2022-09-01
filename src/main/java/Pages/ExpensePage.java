package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensePage {
	WebDriver driver;
	@FindBy(xpath="(//i[@class='fa fa-angle-left pull-right'])[8]")
	WebElement expenseoption;
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/expenses/create']")
	WebElement addexp;
	@FindBy(id="location_id")
	WebElement businessloc;
	@FindBy(id="expense_category_id")
	WebElement expcategory;
	@FindBy(id="ref_no")
	WebElement expenserefe;
	@FindBy(id="final_total")
	WebElement totalamount;
	@FindBy(id="expense_for")
	WebElement expensefor;
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	WebElement addexpsave;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement expensesearchfield;
	@FindBy(xpath="(//td[@class='sorting_1']//following::td)[1]")
	WebElement selectedexpense;
	
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/expense-categories']")
	WebElement addexpensecat;
	@FindBy(xpath="//button[@class='btn btn-block btn-primary btn-modal']")
	WebElement addexpcatbtn;
	@FindBy(id="name")
	WebElement expensename;
	@FindBy(id="code")
	WebElement expensecode;
	@FindBy(xpath="//button[@type='submit']")
	WebElement newexpensesavebtn;

	
	public ExpensePage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	public WebElement ExpenseOptionClick()
	{
		return expenseoption;
	}
	public WebElement AddExpenseOptionClick()
	{
		return addexp;
	}
	public WebElement businessLocation()
	{
		return businessloc;
	}
	public WebElement ExpenseCategorySelect()
	{
		return expcategory;
		
	}
	public WebElement expenseRefNumber()
	{
		return expenserefe;
	}
	public WebElement TotalAmountField()
	{
		return totalamount;
	}
	public WebElement ExpenseForSelect()
	{
		return expensefor;
		
	}
	public WebElement AddExpSaveBtn()
	{
		return addexpsave;
	}
	public WebElement expenseSearchTextField()
	{
		return expensesearchfield;
	}
	public WebElement expenseSelectedToSearch()
	{
		
		return selectedexpense;
	}
	public WebElement addExpenseCategory()
	{
		return addexpensecat;
	}
	public WebElement addExpenseCateBtn()
	{
		return addexpcatbtn;
	}
	public WebElement expenseCatNameField()
	{
		return expensename;
	}
	public WebElement expenseCatCodeField()
	{
		return expensecode;
	}
	public WebElement expenseSaveBtn()
	{
		
		return newexpensesavebtn;
	}
	
}
