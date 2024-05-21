package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseFile;

public class ReportsPage extends BaseFile{
BaseFile Base = new BaseFile();

@Test
public void Reports() {
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
	
	
	WebElement ReportsBtn = driver.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Reports\"]"));
	clickOnElement(ReportsBtn);
	
	WebElement ValidateReports = driver
			.findElement(By.xpath("//h3[@class=\"ukhd mb-3\"][text()=\"Reports\"]"));
	validateText(ValidateReports, "Reports");
}
@Test
public void click_on_Every_Reports() {
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
	
	
	WebElement ReportsBtn = driver.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Reports\"]"));
	clickOnElement(ReportsBtn);
	
	WebElement ValidateReports = driver
			.findElement(By.xpath("//h3[@class=\"ukhd mb-3\"][text()=\"Reports\"]"));
	validateText(ValidateReports, "Reports");
	//////////////////////////////GST Report////////////////////////////
	WebElement gstReport = driver.findElement(By.xpath("//h5[@class=\"list-group-item-heading mb-0\"][text()=\"GST Report\"]"));
	clickOnElement(gstReport);
	
	WebElement ValidateGstReports = driver
			.findElement(By.xpath("//h3[@class=\"ukhd mb-3\"][text()=\"GST Report\"]"));
	validateText(ValidateGstReports, "GST Report");
	
	WebElement clickBackbutton = driver.findElement(By.xpath("//span[@class=\"btn btn-danger mb-0 me-0\"]"));
	clickOnElement(clickBackbutton);
	/////////////////////////Daily Sales Report///////////////////////
	WebElement DailySalesReport = driver.findElement(By.xpath("//h5[@class=\"list-group-item-heading mb-0\"][text()=\"Daily Sales Report\"]"));
	clickOnElement(DailySalesReport);
	
	WebElement ValidateDailySalesReports = driver
			.findElement(By.xpath("//h3[@class=\"ukhd mb-3\"][text()=\"Daily Sales Report\"]"));
	validateText(ValidateDailySalesReports, "Daily Sales Report");
	
	WebElement clickBackbutton1 = driver.findElement(By.xpath("//span[@class=\"btn btn-danger mb-0 me-0\"]"));
	clickOnElement(clickBackbutton1);
	
	///////////////////////////Order type Report////////////////////////////
	WebElement OrdertypeReport = driver.findElement(By.xpath("//h5[@class=\"list-group-item-heading mb-0\"][text()=\"Orders Report\"]"));
	clickOnElement(OrdertypeReport);
	
	WebElement ValidateOrdersReports = driver
			.findElement(By.xpath("//h3[@class=\"ukhd mb-3\"][text()=\"Orders Report\"]"));
	validateText(ValidateOrdersReports, "Orders Report");
	
	WebElement clickBackbutton2 = driver.findElement(By.xpath("//span[@class=\"btn btn-danger mb-0 me-0\"]"));
	clickOnElement(clickBackbutton2);
	
	//////////////////////////customised Report////////////////////////////
	WebElement CustomisedReports = driver.findElement(By.xpath("//h5[@class=\"list-group-item-heading mb-0\"][text()=\"Customised Sales Reports\"]"));
	clickOnElement(CustomisedReports);
	
	WebElement ValidateCustomisedReports = driver
			.findElement(By.xpath("//h3[@class=\"ukhd mb-3\"][text()=\"Customised Sales Report\"]"));
	validateText(ValidateCustomisedReports, "Customised Sales Report");
	
	WebElement clickBackbutton3 = driver.findElement(By.xpath("//span[@class=\"btn btn-danger mb-0 me-0\"]"));
	clickOnElement(clickBackbutton3);
}
}
