package BillingTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v101.page.Page;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;
import Pages.AddRole;
import Pages.DeleteRolePage;
import Pages.ExpensePage;
import Pages.HomePageAddUser;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.SettingsPage;
import Pages.StockTransferPage;
import Pages.addVariationsPage;
import Pages.contactAddCustomerGroup;
import Pages.customerContactAddPage;
import Pages.paymentAccountsPage;
import Pages.purchasePage;
import Pages.salesCommissionAgentPage;
import Pages.sellPage;
import Pages.supplierContactAddPage;
import Pages.CalculatorPage;
import Utility.PageUtility;
import Utility.WaitUtility;

public class TestCases extends BaseClass{

	public WebDriver driver;
	public static Properties prop;
	FileInputStream fs;
	LoginPage login;
	HomePageAddUser home;
	AddRole role;
	contactAddCustomerGroup contact;
	supplierContactAddPage suppliercontact;
	customerContactAddPage customercontact;
	ProductPage product;
	addVariationsPage variations;
	StockTransferPage stock;
	ExpensePage expense;
	paymentAccountsPage payments;
	CalculatorPage calc;
	DeleteRolePage deleterole;
	salesCommissionAgentPage salescommission;
	purchasePage purchase;
	sellPage sell;
	SettingsPage settings;
	@BeforeMethod
	@Parameters("Browser")
	public void BrowserInvoke(String Browser) throws IOException
	{
		prop=new Properties();
		fs=new FileInputStream("D:\\Automation\\Selenium_Java\\Billing\\src\\main\\resources\\TestData\\TestData.properties");
		prop.load(fs);
		driver=BrowserInitialization(Browser);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		login =new LoginPage(driver);
		home=new HomePageAddUser(driver);
		role=new AddRole(driver);
		contact=new contactAddCustomerGroup(driver);
		suppliercontact=new supplierContactAddPage(driver);
		customercontact=new customerContactAddPage(driver);
		product=new ProductPage(driver);
		variations=new addVariationsPage(driver);
		stock=new StockTransferPage(driver);
		expense=new ExpensePage(driver);
		payments=new paymentAccountsPage(driver);
		calc=new CalculatorPage(driver);
		deleterole=new DeleteRolePage(driver);
		salescommission=new salesCommissionAgentPage(driver);
		purchase=new purchasePage(driver);
		sell=new sellPage(driver);
		settings=new SettingsPage(driver);
	}
	@Test
	public void TC01BillingLoginValid()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(prop.getProperty("ExpUrl"), driver.getCurrentUrl());
	}
	@Test
	public void TC02BillingLogininvalid()
	{
		login.LoginMethod(prop.getProperty("username1"), prop.getProperty("password1"));
		Assert.assertEquals(login.InvalidMsgFetch(), "These credentials do not match our records.");
			
	}
	@Test
	public void TC03BillingLoginValidAndCheckBox()
	{
		PageUtility.enterText(login.UserNameField(), prop.getProperty("username"));
		PageUtility.enterText(login.PasswordField(), prop.getProperty("password"));
		PageUtility.clickOnElement(login.RemeberMeBox());
		Boolean rememberboxstatus=login.RemeberMeBox().isSelected();
		Assert.assertEquals(rememberboxstatus, true);
		PageUtility.clickOnElement(login.LoginButtonAction());
		
	}
	@Test
	public void TC04BillingAddUser()
	{
		
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		home.UserManagementDropdown();
		home.UserOption();
		home.AddUser();
		PageUtility.enterText(home.PrefixTextField(),prop.getProperty("Prefix"));
		String NewUser=RandomNameCreation("NewUsername");
		PageUtility.enterText(home.FirstnameField(),NewUser);
		PageUtility.enterText(home.LastNameField(), prop.getProperty("Lastname"));
		PageUtility.enterText(home.EmailField(), RandomNameCreation("demoemail")+"@gmail.com");
		PageUtility.selectDropdownbyText(home.RoleSelection(),"Specialist");
		PageUtility.enterText(home.PasswordTextField(), prop.getProperty("Password"));
		PageUtility.enterText(home.ConfirmPasswordTextField(), prop.getProperty("ConfirmPassword"));
		PageUtility.enterText(home.CommissionField(), prop.getProperty("Commission"));
		home.UserSaveBtnClick();
		PageUtility.enterText(home.newUserSearch(), NewUser);
		Assert.assertEquals(home.AddedUserCheck().getText(), NewUser);
		
	}
	@Test
	public void TC05BillingAddRole() 
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		home.UserManagementDropdown();
		role.RoleOptionBtnClick();
		role.AddNewRoleBtn();
		String NewRole=RandomNameCreation("NewRole");
		PageUtility.enterText(role.RoleNameTextField(),NewRole);
		role.PermissionCheckBox();
		role.roleSaveBtn();
		PageUtility.enterText(role.RoleSearchField(), NewRole);
		Assert.assertEquals(role.AddedRoleSearch().getText(), NewRole);
		
	}
	@Test
	public void TC06BillingDeleteRole() 
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		home.UserManagementDropdown();
		role.RoleOptionBtnClick();
		role.AddNewRoleBtn();
		String NewRole=RandomNameCreation("NewRole");
		PageUtility.enterText(role.RoleNameTextField(),NewRole);
		role.PermissionCheckBox();
		role.roleSaveBtn();
		PageUtility.enterText(role.RoleSearchField(), NewRole);
		PageUtility.clickOnElement(deleterole.deleteRole());
		PageUtility.clickOnElement(deleterole.deleteConfirmBtn());
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(role.RoleSearchField(), NewRole);
		String errormsg=deleterole.errorMsgFetch().getText();
		System.out.print(errormsg);
		Assert.assertEquals(errormsg, "No matching records found");
		
		
	}
	@Test
	public void TC07BillingContactAddSupplier()
	{
		
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		suppliercontact.ContactDropDownArrow();
		suppliercontact.SuppierOptionClick();
		suppliercontact.NewSupplierAddBtn();
		String NewSuppliername=RandomNameCreation("NewSupplier");
		PageUtility.enterText(suppliercontact.SupplierNameField(),NewSuppliername);
		PageUtility.enterText(suppliercontact.SupplierBusinessNameField(), prop.getProperty("SupplierBusinessName"));
		String NewSupplierContactid=RandomNameCreation("NewSupplierContactid");
		PageUtility.enterText(suppliercontact.SupplierContactIdField(),NewSupplierContactid);
		PageUtility.enterText(suppliercontact.SupplierMobileField(), prop.getProperty("SupplierMobilenumber"));
		suppliercontact.SupplierSaveBtn();
		PageUtility.navigateToRefresh(driver);
		WaitUtility.waitForElementToBeVisible(driver, suppliercontact.supplierSearchField());
		PageUtility.enterText(suppliercontact.supplierSearchField(), NewSupplierContactid);
		String selectedsSupplierID=suppliercontact.selectedSupplier().getText();
		Assert.assertEquals(selectedsSupplierID, NewSupplierContactid);
		
		
	}
	
	//pending not able to edit mobile field
	@Test
	public void TC08BillingEditAddedSupplierEmail()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		suppliercontact.ContactDropDownArrow();
		suppliercontact.SuppierOptionClick();
		suppliercontact.NewSupplierAddBtn();
		String NewSuppliername=RandomNameCreation("NewSupplier");
		PageUtility.enterText(suppliercontact.SupplierNameField(),NewSuppliername);
		PageUtility.enterText(suppliercontact.SupplierBusinessNameField(), prop.getProperty("SupplierBusinessName"));
		String NewSupplierContactid=RandomNameCreation("NewSupplierContactid");
		PageUtility.enterText(suppliercontact.SupplierContactIdField(),NewSupplierContactid);
		PageUtility.enterText(suppliercontact.SupplierMobileField(), prop.getProperty("SupplierMobilenumber"));
		suppliercontact.SupplierSaveBtn();
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(suppliercontact.supplierSearchField(),NewSuppliername);
		PageUtility.clickOnElement(suppliercontact.supplierActionBtn());
		PageUtility.clickOnElement(suppliercontact.supplierEditBtn());
		PageUtility.enterText(suppliercontact.SupplierMobileField(),"1234567898");
		
	}
	
	@Test
	public void TC09BillingContactAddCustomer()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		suppliercontact.ContactDropDownArrow();
		customercontact.CutomersOptionDrp();
		customercontact.CustomerContactAddBtn();
		String NewCustomerName=RandomNameCreation("NewCustomer");
		PageUtility.enterText(customercontact.CustomerNameField(),NewCustomerName);
		String NewCustomerID=RandomNameCreation("NewCustomerId");
		PageUtility.enterText(customercontact.CustomerContactIdField(),NewCustomerID);
		PageUtility.enterText(customercontact.CustomerMobileField(), prop.getProperty("CustomerMobilenumber"));
		customercontact.CustomercontactSaveBtn();
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(customercontact.customerContactSearchfieldClick(), NewCustomerName);
		String NewSelectedcustomer=customercontact.selectedCustomer().getText();
		Assert.assertEquals(NewSelectedcustomer, NewCustomerName);
		
		
	}
	@Test
	public void TC10BillingContactAddCustomerGroup()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		suppliercontact.ContactDropDownArrow();
		contact.CustomerGroupOption();
		contact.CustomerGroupAddBtn();
		String NewCustomerGroupName=RandomNameCreation("NewCustomerGroup");
		PageUtility.enterText(contact.CustomerGroupNameField(),NewCustomerGroupName);
		PageUtility.enterText(contact.CalculationPercentageField(), prop.getProperty("CalculationPer"));
		contact.CustomerGroupSaveBtn();
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(contact.customerGroupSerachField(), NewCustomerGroupName);
		String Selectedgroup=contact.selectedCustomerGroup().getText();
		Assert.assertEquals(Selectedgroup, NewCustomerGroupName);
		
		
	}
	@Test
	public void TC11BillingAddProduct()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		product.ProductOptionClick();
		product.AddProductOption();
		String NewProductName=RandomNameCreation("ProductName");
		PageUtility.enterText(product.ProductNameField(),NewProductName);
		PageUtility.selectDropdownbyText(product.brandNameSelectTag(), "VKC");
		PageUtility.selectDropdownbyText(product.unitSelectTag(),"Box");
		PageUtility.enterText(product.AlertQuantityTextField(), prop.getProperty("AlertQuantity"));
		PageUtility.enterText(product.EXCTaxField(), prop.getProperty("ExcTaxValue"));
		product.ProductSaveBtn();
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(product.productSearchFieldSelect(), NewProductName);
		String NewSelectedProduct=product.selectedProductGet().getText();
		Assert.assertEquals(NewSelectedProduct, NewProductName);
		
		
	}
	@Test 
	
	public void TC12BillingAddVariations()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		product.ProductOptionClick();
		variations.VariationsOptionClick();
		variations.VariationsAddBtnClick();
		String NewVariationName=RandomNameCreation("VariationName");
		PageUtility.enterText(variations.VariationsNameField(),NewVariationName);
		PageUtility.enterText(variations.VariationValueField(), prop.getProperty("VariationValue"));
		variations.VariationsSaveBtnClick();
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(variations.VariationSearchField(), NewVariationName);
		String actualvariation=PageUtility.getElementText(variations.CheckAddedVariation());
		Assert.assertEquals(actualvariation, NewVariationName);
	}
	//pending
	@Test
	public void TC13BillingDeleteVariations()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		
		//PageUtility.enterText(variations.VariationSearchField(), prop.getProperty("VariationsName"));
		
		
		//PageUtility.navigateToRefresh(driver);
		//Assert.assertEquals(product.CheckAddedVariation().isDisplayed(), false);
		product.ProductOptionClick();
		variations.VariationsOptionClick();
		variations.VariationsAddBtnClick();
		String NewVariationNametodelete=RandomNameCreation("VariationNameDelete");
		PageUtility.enterText(variations.VariationsNameField(),NewVariationNametodelete);
		PageUtility.enterText(variations.VariationValueField(), prop.getProperty("VariationValue"));
		variations.VariationsSaveBtnClick();
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(variations.VariationSearchField(), NewVariationNametodelete);
		variations.VariationDeleteBtn();
		variations.DeleteOKBtnClick();
		//PageUtility.navigateToRefresh(driver);
		//PageUtility.enterText(variations.VariationSearchField(),NewVariationNametodelete);
		String errormsg=PageUtility.getElementText(variations.variationerrorMsgFetch());
		Assert.assertEquals(errormsg, "No matching records found");
		
	}
	
	//pending not able to click search 
	@Test
	public void TC14BillingAddSellingPriceGroup()
	
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		product.ProductOptionClick();
		product.SellingPriceGroupOptionClick();
		product.SellingPriceGroupAddBtnClick();
		String NewSellingPricegroupName=RandomNameCreation("SellingPriceGroup");
		PageUtility.enterText(product.SellingPriceGroupTextField(), NewSellingPricegroupName);
		PageUtility.enterText(product.SellingPriceGroupDescBox(), prop.getProperty("SellingPriceGroupDesc"));
		product.SellingPriceGroupSaveBtn();
		PageUtility.enterText(product.sellingPriceGroupSearchField(),NewSellingPricegroupName);
		//product.sellingPriceGroupSearchField().sendKeys(NewSellingPricegroupName);
		
		/*PageUtility.enterText(product.sellingPriceGroupSearchField(),NewSellingPricegroupName);
		String expsellingpricegroupName=PageUtility.getElementText(product.selectedsellingGroupTOCheck());
		Assert.assertEquals(expsellingpricegroupName,NewSellingPricegroupName);*/
		
		
		
		
		
	}
	@Test
	public void TC15BillingAddBrand()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		product.ProductOptionClick();
		product.BrandOptionClick();
		product.BrandAddBtn();
		String NewBrandName=RandomNameCreation("NewBrand");
		PageUtility.enterText(product.BrandNameTextField(),NewBrandName);
		PageUtility.enterText(product.BarndDescField(), prop.getProperty("BrandDesc"));
		product.BrandSaveBtnClick();
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(product.BrandSearch(),NewBrandName);
		String expnewbrandname=PageUtility.getElementText(product.SelectedBrandTOCheck());
		Assert.assertEquals(expnewbrandname, NewBrandName);
		
	}
	// after add new id changed not able to fetch added 
	@Test
	public void TC16BillingAddStockAdjustment()
	{

		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		stock.StockTransferOptionClick();
		stock.AddStocktransferOption();
		String NewReferenceNumber=RandomNameCreation("Refer");
		PageUtility.enterText(stock.ReferenceNumberField(),NewReferenceNumber);
		PageUtility.selectDropdownbyText(stock.StartingLocationSelection(), "Demo Company (BL0001)");
		PageUtility.selectDropdownbyText(stock.TransferLoactionSelection(), "DeMoCompany2 (121312)");
		PageUtility.enterText(stock.ProductSearchFieldForStockTransfer(), "ProductName3350");
		stock.ProductSelectList();
		PageUtility.clickOnElement(stock.StockTransferSaveBtnClick());
		PageUtility.enterText(stock.stockTransferSearchField(), NewReferenceNumber);
		String actualref=PageUtility.getElementText(stock.selectedStockTransferRefnumber());
		System.out.println("Actual:"+actualref);
		System.out.println("Expe:"+NewReferenceNumber);
		Assert.assertEquals(actualref, NewReferenceNumber);
		
	}
	@Test
	public void TC17BillingAddExpense()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		PageUtility.clickOnElement(expense.ExpenseOptionClick());
		PageUtility.clickOnElement(expense.AddExpenseOptionClick());
		PageUtility.selectDropdownbyText(expense.businessLocation(), "DeMoCompany2 (121312)");
		PageUtility.selectDropdownbyText(expense.ExpenseCategorySelect(), "rent");
		String NewReferenceNumber=RandomNameCreation("Refer");
		PageUtility.enterText(expense.expenseRefNumber(),NewReferenceNumber);
		PageUtility.enterText(expense.TotalAmountField(), prop.getProperty("TotalAmount"));
		PageUtility.selectDropdownbyText(expense.ExpenseForSelect(), "Mrs NewUsername6912 Grey");
		PageUtility.clickOnElement(expense.AddExpSaveBtn());
		PageUtility.enterText(expense.expenseSearchTextField(), NewReferenceNumber);
		String actual=PageUtility.getElementText(expense.expenseSelectedToSearch());
		Assert.assertEquals(actual, NewReferenceNumber);
	}
	@Test
	public void TC18BillingAddExpenseCategories()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		PageUtility.clickOnElement(expense.ExpenseOptionClick());
		PageUtility.clickOnElement(expense.addExpenseCategory());
		PageUtility.clickOnElement(expense.addExpenseCateBtn());
		String NewCategoryName=RandomNameCreation("CategoryName");
		PageUtility.enterText(expense.expenseCatNameField(), NewCategoryName);
		String NewCategoryCode=RandomNameCreation("CategoryCode");
		PageUtility.enterText(expense.expenseCatCodeField(), NewCategoryCode);
		PageUtility.clickOnElement(expense.expenseSaveBtn());
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(expense.expenseCategorySearchField(), NewCategoryName);
		String actualexpensecategory=PageUtility.getElementText(expense.expenseCatogerySelectedToSearch());
		Assert.assertEquals(actualexpensecategory, NewCategoryCode);		
	}
	@Test
	public void TC19BillingAccountCreation()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		PageUtility.clickOnElement(payments.paymentAccountOptionClick());
		PageUtility.clickOnElement(payments.listAccountOptionClick());
		PageUtility.clickOnElement(payments.addNewAccountBtnClick());
		PageUtility.enterText(payments.nameAccountField(), prop.getProperty("PaymentName"));
		String NewAccountNumber=RandomNameCreation("ACCnum");
		PageUtility.enterText(payments.accountNumberField(), NewAccountNumber);
		PageUtility.enterText(payments.openingBalanceField(), prop.getProperty("OpeningBalance"));
		PageUtility.clickOnElement(payments.newAccountSaveButtonClick());
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(payments.accountSearchField(), NewAccountNumber);
		String actualnewaccnum=PageUtility.getElementText(payments.selectedAccount());
		Assert.assertEquals(actualnewaccnum, NewAccountNumber);	
	}
	@Test
	public void TC20BillingCalculator()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		PageUtility.clickOnElement(calc.calculatorClick());
		PageUtility.clickOnElement(calc.integerTwo());
		PageUtility.clickOnElement(calc.opertorPluseSymbol());
		PageUtility.clickOnElement(calc.integerEight());
		PageUtility.clickOnElement(calc.equalsSymbolClick());
		String text=calc.resultField().getAttribute("value");
		Assert.assertEquals(text,prop.getProperty("CalculationResult"));
	}
	//pending 2000 Box Value fetched
	@Test
	public void TC21BillingAddOpeningStock()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		product.ProductOptionClick();
		PageUtility.clickOnElement(product.listProduct());
		/*product.AddProductOption();
		String NewProductName=RandomNameCreation("ProductName");
		PageUtility.enterText(product.ProductNameField(),NewProductName);
		PageUtility.selectDropdownbyText(product.brandNameSelectTag(), "VKC");
		PageUtility.selectDropdownbyText(product.unitSelectTag(),"Box");
		PageUtility.enterText(product.AlertQuantityTextField(), prop.getProperty("AlertQuantity"));
		PageUtility.enterText(product.EXCTaxField(), prop.getProperty("ExcTaxValue"));
		product.ProductSaveBtn();
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(product.productSearchFieldSelect(), NewProductName);
		PageUtility.clickOnElement(product.actionBtnClickOnProduct());
		PageUtility.clickOnElement(product.openingStockOptionClick());
		PageUtility.enterText(product.quantityField(),prop.getProperty("OpeningStockQuantilty") );
		PageUtility.clickOnElement(product.openingStockSaveBtnClick());*/
		//System.out.print("product:"+ProductName8149);
		PageUtility.enterText(product.productSearchFieldSelect(), "ProductName8149");
		//String actualnewproductquantity=PageUtility.getElementText(product.newlyAddedOpeningStock());
		
		System.out.print("productquantilty:"+PageUtility.getElementText(product.newlyAddedOpeningStock()));
		
		//Assert.assertEquals(actualnewproductquantity, prop.getProperty("OpeningStockQuantilty"));
		
		
		
		
	}
	@Test
	public void TC22BillingAddSalesCommissionAgent()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		home.UserManagementDropdown();
		PageUtility.clickOnElement(salescommission.salesCommissionAgentOptionClick());
		PageUtility.clickOnElement(salescommission.salesCommissionAddbtnClick());
		String NewAgentName=RandomNameCreation("AgentName");
		PageUtility.enterText(salescommission.salesAgentFirstname(),NewAgentName);
		PageUtility.enterText(salescommission.salesAgentEmail(), prop.getProperty("AgentEmail"));
		PageUtility.enterText(salescommission.salesAgentContactnumber(), prop.getProperty("Agentcontact"));
		PageUtility.enterText(salescommission.salesAgentCommisiionField(), prop.getProperty("Agentcommission"));
		PageUtility.clickOnElement(salescommission.salesAgentCommissionSaveBtnClick());
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(salescommission.salesCommissionAgentSearchField(), NewAgentName);
		Assert.assertEquals(PageUtility.getElementText(salescommission.selectedSalesCommissionAgent()), NewAgentName);

	}
	//not able to add reference number
	@Test
	public void TC23BillingAddPurchase()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		PageUtility.clickOnElement(purchase.purchaseOptionClick());
		PageUtility.clickOnElement(purchase.addPurchaseOption());
		PageUtility.clickOnElement(purchase.addSupplier());
		String NewSuppliername=RandomNameCreation("NewSupplier");
		PageUtility.enterText(suppliercontact.SupplierNameField(),NewSuppliername);
		PageUtility.enterText(suppliercontact.SupplierBusinessNameField(), prop.getProperty("SupplierBusinessName"));
		String NewSupplierContactid=RandomNameCreation("NewSupplierContactid");
		PageUtility.enterText(suppliercontact.SupplierContactIdField(),NewSupplierContactid);
		PageUtility.enterText(suppliercontact.SupplierMobileField(), prop.getProperty("SupplierMobilenumber"));
		suppliercontact.SupplierSaveBtn();
		WaitUtility.waitForElementToBeVisible(driver,purchase.selectSupplier());
		PageUtility.enterText(purchase.referenceNumberField(), "1234456");
		PageUtility.selectDropdownByValue(purchase.purchaseSatatusSelect(), "received");
		PageUtility.selectDropdownbyText(purchase.businessLocatioSelect(), "DeMoCompany2 (121312)");
		PageUtility.clickOnElement(purchase.productAddBtn());
		WaitUtility.waitForElementToBeVisible(driver, purchase.productaddTextField());
		String NewProductName=RandomNameCreation("ProductName");
		PageUtility.enterText(product.ProductNameField(),NewProductName);
		PageUtility.selectDropdownbyText(product.brandNameSelectTag(), "VKC");
		PageUtility.selectDropdownbyText(product.unitSelectTag(),"Box");
		PageUtility.enterText(product.AlertQuantityTextField(), prop.getProperty("AlertQuantity"));
		PageUtility.enterText(product.EXCTaxField(), prop.getProperty("ExcTaxValue"));
		PageUtility.clickOnElement(purchase.quickAddedProductSaveBtn());
		PageUtility.clearText(purchase.amountPurchase());
		PageUtility.enterText(purchase.amountPurchase(), prop.getProperty("AmountForPurchase"));
		PageUtility.selectDropdownByValue(purchase.payemtMethodSelection(), "cash");
		PageUtility.clickOnElement(purchase.purchaseSaveBtn());
		
	}
	
	//not able to set date
	@Test
	public void TC24BillingAddDiscount()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		PageUtility.clickOnElement(sell.sellOptionClick());
		PageUtility.clickOnElement(sell.discountOption());
		PageUtility.clickOnElement(sell.discountAddBtn());
		String NewDiscountName=RandomNameCreation("DiscountName");
		PageUtility.enterText(sell.discountNameField(),NewDiscountName);
		PageUtility.selectDropdownByValue(sell.discountBrandField(), "93");
		PageUtility.selectDropdownByValue(sell.discountCategoryField(), "205");
		PageUtility.selectDropdownByValue(sell.discountLocationSelectField(), "3");
		PageUtility.selectDropdownByValue(sell.discountTypeFieldSelect(), "fixed");
		PageUtility.enterText(sell.discountAmountField(), prop.getProperty("DiscountAmount"));
		PageUtility.clickOnElement(sell.discountStartAtField());
		
		PageUtility.clickOnElement(sell.discountSaveBtnClick());
	}
	//Assert check
	@Test
	public void TC25BillingAddTaxRates()
	{
		login.LoginMethod(prop.getProperty("username"), prop.getProperty("password"));
		PageUtility.clickOnElement(settings.settingsOptionClick());
		PageUtility.clickOnElement(settings.taxRatesOptionClick());
		PageUtility.clickOnElement(settings.taxRatesAddBtn());
		String NewTaxName=RandomNameCreation("TaxName");
		PageUtility.enterText(settings.taxNameField(),NewTaxName);
		PageUtility.enterText(settings.taxAmountField(), prop.getProperty("TaxAmount"));
		PageUtility.clickOnElement(settings.taxRateSaveBtnClick());
		PageUtility.navigateToRefresh(driver);
		PageUtility.enterText(settings.taxRatesSearchField(), NewTaxName);
		Assert.assertEquals(PageUtility.getElementText(settings.selectedTax()), NewTaxName);
		
	}
	
	
	
	
	
	
	/*@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}*/
}
