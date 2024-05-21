package Test;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Base.BaseFile;

public class PosPage extends BaseFile {
	BaseFile Base = new BaseFile();

	/////////////////////////////////// Pos
	@Test(priority = 1)
	public void click_the_Pos_button() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
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

		/////////////////// Click On Pos Button ////////////////////////////////////
		WebElement Posbtn = driver.findElement(By.cssSelector("span.btn.btn-primary.posbtn.me-2"));
		clickOnElement(Posbtn);

		/////////////////// Click table no 2 ////////////////////////////////////
		WebElement deliverybtn = driver.findElement(By.xpath("//span[@class=\"name\"][text()=\"2\"]"));
		clickOnElement(deliverybtn);

///////////////////Click itembtn////////////////////////////////////
		WebElement itembtn = driver.findElement(By.xpath("//span[text ()=\"Gulab Jamun\"]"));
		clickOnElement(itembtn);

///////////////////Click Addbtn////////////////////////////////////
		WebElement Addbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"][text()=\"Add\"]"));
		clickOnElement(Addbtn);

		WebElement SearchBar = driver.findElement(By.xpath("//input[@placeholder=\"Search Here\"]"));
		SearchBar.sendKeys("wow");

		WebElement newitembtn = driver.findElement(By.xpath("//span[@class=\"name\"][text()=\"Bao Wow Pav\"]"));
		clickOnElement(newitembtn);

		WebElement AgainAddbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"][text()=\"Add\"]"));
		clickOnElement(AgainAddbtn);

///////////////////Click Savebtn////////////////////////////////////
		WebElement Savebtn = driver.findElement(By.xpath("//span[@class=\"themeclr\"][text()=\"Save Bill\"]"));
		clickOnElement(Savebtn);

///////////////////Click Paybtn////////////////////////////////////
		WebElement Paybtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary mt-3\"]"));
		clickOnElement(Paybtn);

///////////////////Click Paidbtn////////////////////////////////////
		WebElement Paidbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-success mt-3\"]"));
		clickOnElement(Paidbtn);
	}

	/*
	 * //Search Beer public void click_on_search_bar_and_search_beer() { WebElement
	 * SearchBeer =
	 * driver.findElement(By.xpath("//input[@placeholder=\"Search Here\"]"));
	 * SearchBeer.sendKeys("Beer");
	 * 
	 * }
	 */
	/*
	 * 
	 * //click on Beer item public void select_the_Beer_item_button() { WebElement
	 * beeritembtn =
	 * driver.findElement(By.xpath("//span[@class=\"name\"][text()=\"Beer\"]"));
	 * clickOnElement(beeritembtn); }
	 */

	public void enter_customer_paid_amount() {
		WebElement CustomerPaid = driver.findElement(By.xpath("//input[@name=\"customerPaid\"]"));
		CustomerPaid.sendKeys("50");

	}

	public void click_on_paid_button() {
		WebElement Paidbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-success mt-3\"]"));
		clickOnElement(Paidbtn);
	}

	// POS Delivery Case
	// Delivery Button
	
	public void click_the_delivery_button() {
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

		
		WebElement Posbtn = driver.findElement(By.cssSelector("span.btn.btn-primary.posbtn.me-2"));
		clickOnElement(Posbtn);
		
		WebElement deliverybtn = driver.findElement(By.xpath("//button[@class=\"btn deliverybtn mx-2\"]"));
		clickOnElement(deliverybtn);
		
		
		WebElement SelectChessePizza = driver.findElement(By.xpath("//span[@class=\"name\"][text()=\"Cheese Pizza\"]"));
		clickOnElement(SelectChessePizza);
		
		WebElement addQuantityBtn = driver.findElement(By.xpath("//i[@class=\"fa fa-plus\"]"));
		clickOnElement(addQuantityBtn);
		
		WebElement Addbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"][text()=\"Add\"]"));
		clickOnElement(Addbtn);
		
		
		
		WebElement deliveryboy = driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]"));
		/* clickOnElement(deliveryboy); */
		deliveryboy.sendKeys("staff123(Delivery Guy)");
		
		WebElement enterdropdown = driver.findElement(By.xpath("//div[@class=\\\" css-19bb58m\\\"]"));
		enterdropdown.sendKeys(Keys.ENTER);
		
	
	
	}

	// Select Chesse Pizza Item
	public void click_on_chesse_pizza_item() {
		WebElement SelectChessePizza = driver.findElement(By.xpath("//span[@class=\"name\"][text()=\"Cheese Pizza\"]"));
		clickOnElement(SelectChessePizza);
	}

	// add Quantity Button

	public void click_on_quantity_plus_button() {
		WebElement addQuantityBtn = driver.findElement(By.xpath("//i[@class=\"fa fa-plus\"]"));
		clickOnElement(addQuantityBtn);
	}

	public void validate_the_delivery_boy_dropdown() {
		WebElement deliveryboy = driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]"));
		/* clickOnElement(deliveryboy); */
		deliveryboy.sendKeys("staff123(Delivery Guy)");
	}

	public void enter_dropdown() {
		WebElement enterdropdown = driver.findElement(By.xpath("//div[@class=\\\" css-19bb58m\\\"]"));
		enterdropdown.sendKeys(Keys.ENTER);
		/* enterdropdown.sendKeys("staff123(Delivery Guy)"); */ }

	/*
	 * JavascriptExecutor jse = (JavascriptExecutor) driver;
	 * jse.executeScript("arguments[0].value='staff123(Delivery Guy)",
	 * enterdropdown); }
	 */

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Counter Case
	@Test(priority = 2)
	public void counter_button() {
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
		
		WebElement Posbtn = driver.findElement(By.cssSelector("span.btn.btn-primary.posbtn.me-2"));
		clickOnElement(Posbtn);
		
		WebElement counterbtn = driver.findElement(By.xpath("//button[@class=\"btn counterbtn\"]"));
		clickOnElement(counterbtn);
		WebElement SelectChessePizza = driver.findElement(By.xpath("//span[@class=\"name\"][text()=\"Cheese Pizza\"]"));
		clickOnElement(SelectChessePizza);
		
		WebElement addQuantityBtn = driver.findElement(By.xpath("//i[@class=\"fa fa-plus\"]"));
		clickOnElement(addQuantityBtn);
		
		WebElement Addbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"][text()=\"Add\"]"));
		clickOnElement(Addbtn);
		
		WebElement SearchBar = driver.findElement(By.xpath("//input[@placeholder=\"Search Here\"]"));
		SearchBar.sendKeys("wow");

		WebElement newitembtn = driver.findElement(By.xpath("//span[@class=\"name\"][text()=\"Bao Wow Pav\"]"));
		clickOnElement(newitembtn);

		WebElement AgainAddbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"][text()=\"Add\"]"));
		clickOnElement(AgainAddbtn);
		
		WebElement Savebtn = driver.findElement(By.xpath("//span[@class=\"themeclr\"][text()=\"Save Bill\"]"));
		clickOnElement(Savebtn);

///////////////////Click Paybtn////////////////////////////////////
		WebElement Paybtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary mt-3\"]"));
		clickOnElement(Paybtn);

///////////////////Click Paidbtn////////////////////////////////////
		WebElement Paidbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-success mt-3\"]"));
		clickOnElement(Paidbtn);
		
		WebElement successtext = driver.findElement(By.xpath("//div[text()=\"Payment settled successfully\"]"));
		validateText(successtext, "Payment settled successfully");
	}



	

}