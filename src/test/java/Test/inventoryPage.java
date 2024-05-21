package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseFile;

public class inventoryPage extends BaseFile {

	BaseFile Base = new BaseFile();
@Test(priority = 7)
	public void click_on_intventory() {
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("lava@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("demo1234");
		WebElement loginbtn = driver.findElement(
				By.cssSelector("button.btn.btn-block.btn-primary.btn-lg.font-weight-medium.auth-form-btn.col-12"));
		clickOnElement(loginbtn);

		WebElement inventorybtn = driver.findElement(By.xpath("//a[@href=\"#ui-basic\"]"));
		clickOnElement(inventorybtn);

		WebElement rawmaterial = driver.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Raw Material\"]"));
		clickOnElement(rawmaterial);

		WebElement Addrawmaterial = driver.findElement(By.xpath("//i[@class=\"menu-icon mdi mdi-store vsalign\"]"));
		clickOnElement(Addrawmaterial);

		WebElement enterMaterialName = driver.findElement(By.xpath("//input[@placeholder=\"Enter Material Name\"]"));
		enterMaterialName.sendKeys("kiwi");

		WebElement SelectCategorytype = driver.findElement(By.xpath("//option[text()=\"Vegetable\"]"));
		clickOnElement(SelectCategorytype);

		WebElement enterDescription = driver.findElement(By.xpath("//textarea[@placeholder=\"Enter Description\"]"));
		enterDescription.sendKeys("Brocli Vegetable");

		WebElement Selecttaxtype = driver.findElement(By.xpath("//option[text()=\"0% GST\"]"));
		clickOnElement(Selecttaxtype);

		WebElement minimumStock = driver.findElement(By.xpath("//input[@placeholder=\"Enter Minimum Stock\"]"));
		minimumStock.sendKeys("20");

		WebElement purchaseprice = driver.findElement(By.xpath("//input[@placeholder=\"Purchase Price\"]"));
		purchaseprice.sendKeys("120");

		WebElement enterhsncode = driver.findElement(By.xpath("//input[@placeholder=\"Enter HSN Code\"]"));
		enterhsncode.sendKeys("75458");

		WebElement selectintakemeasurementunit = driver
				.findElement(By.xpath("//select[@name=\"measurementUnit\"]/option[text()=\"Kilogram\"]"));
		clickOnElement(selectintakemeasurementunit);

		WebElement selectconsumptionunit = driver
				.findElement(By.xpath("//select[@name=\"consumptionUnit\"]/option[text()=\"Gram\"]"));
		clickOnElement(selectconsumptionunit);

		WebElement enterconversionrate = driver
				.findElement(By.xpath("//input[@placeholder=\"Enter Conversion Rate\"]"));
		enterconversionrate.sendKeys("1000");

		WebElement enetrexpiryalertnoofdays = driver
				.findElement(By.xpath("//input[@placeholder=\"Enter No. of Days\"]"));
		enetrexpiryalertnoofdays.sendKeys("7");

		WebElement enteropeningstock = driver.findElement(By.xpath("//input[@placeholder=\"Enter Opening Stock\"]"));
		enteropeningstock.sendKeys("50");

		WebElement submitbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary me-2\"]"));
		clickOnElement(submitbtn);

		WebElement validaterawmaterialsaddedsuccessfullytext = driver
				.findElement(By.xpath("//div[@class=\"vsalign\"][text()=\"Raw Materials added successfully!!!\"]"));
		validateText(validaterawmaterialsaddedsuccessfullytext, "validate_raw_materials_added_successfully_text");

	}

	////////////////////////////////////// Purchase///////////////////////////////////////////
@Test(priority = 8)
	public void click_on_purchase() {
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("lava@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("demo1234");
		WebElement loginbtn = driver.findElement(
				By.cssSelector("button.btn.btn-block.btn-primary.btn-lg.font-weight-medium.auth-form-btn.col-12"));
		clickOnElement(loginbtn);

		WebElement inventorybtn = driver.findElement(By.xpath("//a[@href=\"#ui-basic\"]"));
		clickOnElement(inventorybtn);

		WebElement purchaseBtn = driver.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Purchases\"]"));
		clickOnElement(purchaseBtn);

		WebElement createPurchaseBtn = driver
				.findElement(By.xpath("//i[@class=\"menu-icon mdi mdi-wallet-outline vsalign\"]"));
		clickOnElement(createPurchaseBtn);

		WebElement supplierDropdown = driver.findElement(By.xpath("//select[@name=\"supplier\"]"));
		clickOnElement(supplierDropdown);
		WebElement supplierDd = driver.findElement(By.xpath("//select[@name=\"supplier\"]"));
		supplierDd.sendKeys("Hrithik Pal");
		WebElement supplierEnter = driver.findElement(By.xpath("//select[@name=\"supplier\"]"));
		supplierEnter.sendKeys(Keys.ENTER);

		WebElement productDropdown = driver.findElement(By.xpath("//select[@name=\"productId\"]"));
		clickOnElement(productDropdown);
		WebElement productitem = driver.findElement(By.xpath("//select[@name=\"productId\"]"));
		productitem.sendKeys("Brocli1");
		WebElement productEnter = driver.findElement(By.xpath("//select[@name=\"productId\"]"));
		productEnter.sendKeys(Keys.ENTER);

		WebElement EnterPurhcasePrice = driver.findElement(By.xpath("//input[@name=\"purchasePrice\"]"));
		EnterPurhcasePrice.sendKeys("");

		WebElement EnterQuantity = driver.findElement(By.xpath("//input[@name=\"quantity\"]"));
		EnterQuantity.sendKeys("");

		WebElement AddBtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-sm\"]"));
		clickOnElement(AddBtn);

		WebElement submitBtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary me-2\"]"));
		clickOnElement(submitBtn);

		WebElement goBackBtn = driver.findElement(By.xpath("//span[@class=\"btn btn-danger mb-0 me-0\"]"));
		clickOnElement(goBackBtn);

		WebElement blueTikBtn = driver
				.findElement(By.xpath("//i[@class=\"fs-20 mdi mdi-check-decagram text-info vsalign\"]"));
		clickOnElement(blueTikBtn);

		WebElement approveBtn = driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
		clickOnElement(approveBtn);

		WebElement PaymentIconBtn = driver
				.findElement(By.xpath("//i[@class=\"fs-20 mdi-24px mdi mdi-cash text-primary vsalign\"]"));
		clickOnElement(PaymentIconBtn);

		WebElement PaidbyCash = driver.findElement(By.xpath("//input[@value=\"Cash\"]"));
		clickOnElement(PaidbyCash);

		WebElement saveBtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
		clickOnElement(saveBtn);
	}

////////////////////////////////////////Staff///////////////////////////////////////////////
@Test(priority = 4)
	public void click_on_staff() {
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("lava@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("demo1234");
		WebElement loginbtn = driver.findElement(
				By.cssSelector("button.btn.btn-block.btn-primary.btn-lg.font-weight-medium.auth-form-btn.col-12"));
		clickOnElement(loginbtn);

		WebElement staffBtn = driver.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Staff\"]"));
		clickOnElement(staffBtn);

		WebElement addStaffBtn = driver.findElement(By.xpath("//i[@class=\"menu-icon mdi mdi-account vsalign\"]"));
		clickOnElement(addStaffBtn);

		WebElement staffName = driver.findElement(By.xpath("//input[@placeholder=\"Enter  Name\"]"));
		staffName.sendKeys("Vineet");

		WebElement staffnumber = driver.findElement(By.xpath("//input[@placeholder=\"Enter Phone Number\"]"));
		staffnumber.sendKeys("6399980917");

		WebElement enterUsername = driver.findElement(By.xpath("//input[@placeholder=\"Enter User Name\"]"));
		enterUsername.sendKeys("vineet@gmail.com");

		WebElement enterPassword = driver.findElement(By.xpath("//input[@placeholder=\"Enter  Password\"]"));
		enterPassword.sendKeys("vineet@123");

		WebElement selectStaffDropdown = driver.findElement(By.xpath("//select[@class=\"form-select\"]"));
		selectStaffDropdown.sendKeys("Waiter");

		WebElement submitbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary me-2\"]"));
		clickOnElement(submitbtn);

	}

	/////////////////////////////////////// Manage
	/////////////////////////////////////// Dishes///////////////////////////////////////////////////
@Test(priority = 5)
	public void click_on_manage_dishes() {

		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("lava@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("demo1234");
		WebElement loginbtn = driver.findElement(
				By.cssSelector("button.btn.btn-block.btn-primary.btn-lg.font-weight-medium.auth-form-btn.col-12"));
		clickOnElement(loginbtn);

		WebElement manageDishesbtn = driver
				.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Manage Dishes\"]"));
		clickOnElement(manageDishesbtn);
		
		WebElement Categorybtn = driver
				.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Category/Menu\"]"));
		clickOnElement(Categorybtn);
		
		WebElement addcategoryBtn = driver
				.findElement(By.xpath("//span[@class=\"btn btn-primary text-white mb-0 me-0\"]"));
		clickOnElement(addcategoryBtn);
		
		WebElement enterName = driver.findElement(By.xpath("//input[@placeholder=\"Enter Menu Name\"]"));
		enterName.sendKeys("Auto");
		
		WebElement enterTag = driver.findElement(By.xpath("//input[@placeholder=\"Add a tag & hit Enter\"]"));
		enterTag.sendKeys("Testing", "Test");
		
		WebElement submitbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary me-2\"]"));
		clickOnElement(submitbtn);
		
		WebElement backBtn = driver.findElement(By.xpath("//span[@class=\"btn btn-danger mb-0 me-0\"]"));
		clickOnElement(backBtn);
		
	}
	///////////////////////////////////////// Product
	///////////////////////////////////////// Dishes/////////////////////////////////////
@Test(priority = 6)
	public void click_on_dishes_products() {

		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("lava@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("demo1234");
		WebElement loginbtn = driver.findElement(
				By.cssSelector("button.btn.btn-block.btn-primary.btn-lg.font-weight-medium.auth-form-btn.col-12"));
		clickOnElement(loginbtn);
		
		WebElement manageDishesbtn = driver
				.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Manage Dishes\"]"));
		clickOnElement(manageDishesbtn);
		

		WebElement ProductDishBtn = driver
				.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Dishes/Products\"]"));
		clickOnElement(ProductDishBtn);
		
		WebElement AddProductDishBtn = driver
				.findElement(By.xpath("//span[@class=\"btn btn-primary text-white mb-0 me-0\"]"));
		clickOnElement(AddProductDishBtn);
		
		WebElement menuCategoryDropdown = driver.findElement(By.xpath("//input[@id=\"react-select-2-input\"]"));
		menuCategoryDropdown.sendKeys("Automation");
		WebElement Dropdown = driver.findElement(By.xpath("//input[@id=\"react-select-2-input\"]"));
		Dropdown.sendKeys(Keys.ENTER);
		
		WebElement enterName = driver.findElement(By.xpath("//input[@placeholder=\"Enter Menu Name\"]"));
		enterName.sendKeys("Veg kabab Paratha");
		
		WebElement dishType = driver.findElement(By.xpath("//input[@id=\"veg\"]"));
		clickOnElement(dishType);
		
		WebElement timeForPreparation = driver.findElement(By.xpath("//select[@name=\"preparation_time\"]"));
		timeForPreparation.sendKeys("5");
		
		WebElement enterBase = driver.findElement(By.xpath("//input[@placeholder=\"Price\"]"));
		enterBase.sendKeys("100");
		
		WebElement promoPrice = driver.findElement(By.xpath("//input[@placeholder=\"Promo Price\"]"));
		promoPrice.sendKeys("99");
		
		WebElement taxDropdown = driver.findElement(By.xpath("//select[@class=\"form-select\"][@name=\"tax\"]"));
		clickOnElement(taxDropdown);
		
		WebElement Dropdown1 = driver.findElement(By.xpath("//option[@value=\"0\"][text()=\"0% GST\"]"));
		clickOnElement(Dropdown1);
		
		WebElement taxTypeDropdown = driver
				.findElement(By.xpath("//select[@class=\"form-select\"][@name=\"tax_type\"]"));
		clickOnElement(taxTypeDropdown);
		
		WebElement Dropdown2 = driver.findElement(By.xpath("//option[text()=\"Include\"]"));
		clickOnElement(Dropdown2);
		
		WebElement Dinein = driver.findElement(By.xpath("//input[@name=\"dine_in\"]"));
		clickOnElement(Dinein);
		WebElement Delivery = driver.findElement(By.xpath("//input[@name=\"delivery\"]"));
		clickOnElement(Delivery);
		WebElement Pickup = driver.findElement(By.xpath("//input[@name=\"pick_up\"]"));
		clickOnElement(Pickup);
		
		WebElement description = driver.findElement(By.xpath("//textarea[@placeholder=\"Enter Description\"]"));
		description.sendKeys("Automation Testing");
		
		WebElement submitbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary me-2\"]"));
		clickOnElement(submitbtn);
	}

	
	/////////////////////////////// Recipes///////////////////////////////////////////////
	
	public void click_on_inventory() {
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("lava@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("demo1234");
		WebElement loginbtn = driver.findElement(
				By.cssSelector("button.btn.btn-block.btn-primary.btn-lg.font-weight-medium.auth-form-btn.col-12"));
		clickOnElement(loginbtn);
		
		WebElement inventorybtn = driver.findElement(By.xpath("//a[@href=\"#ui-basic\"]"));
		clickOnElement(inventorybtn);
		
		WebElement recipesBtn = driver.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Recipes\"]"));
		clickOnElement(recipesBtn);
	}


}
