package Test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseFile;
public class InventorySupplierPage extends BaseFile {
	BaseFile Base = new BaseFile();

	
	@Test(priority = 3)
	public void click_on_supplier_button() {
		
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	WebElement username = 	driver.findElement(By.xpath("//input[@name=\"username\"]"));
	username.sendKeys("lava@gmail.com");
	WebElement password = 	driver.findElement(By.xpath("//input[@name=\"password\"]"));
	password.sendKeys("demo1234");
	WebElement loginbtn = driver.findElement(By.cssSelector("button.btn.btn-block.btn-primary.btn-lg.font-weight-medium.auth-form-btn.col-12"));
	clickOnElement(loginbtn);
	
	WebElement inventorybtn = driver.findElement(By.xpath("//a[@href=\"#ui-basic\"]"));
	clickOnElement(inventorybtn);
	
    WebElement supplierBtn = driver.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Suppliers\"]"));
    clickOnElement(supplierBtn);
    
	WebElement AddSupplierBtn = driver.findElement(By.xpath("//i[@class=\"menu-icon mdi mdi-truck vsalign\"]"));
	clickOnElement(AddSupplierBtn);
	
	WebElement supplierName = driver.findElement(By.xpath("//input[@placeholder=\"Enter Name\"]"));
	supplierName.sendKeys("Supplier123");
	
	WebElement supplierMobileno = driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]"));
	supplierMobileno.sendKeys("6399980915");
	
	WebElement enterEmail = driver.findElement(By.xpath("//input[@placeholder=\"Enter Email\"]"));
	enterEmail.sendKeys("Suppliername123@gmail.com");
	
	WebElement suppierAddress = driver.findElement(By.xpath("//textarea[@placeholder=\"Enter Address\"]"));
	suppierAddress.sendKeys("Sanjay place");
	
	WebElement submitbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary me-2\"][text()=\"Submit\"]"));
	clickOnElement(submitbtn);
		}	
	public void click_add_supplier_button() {
	WebElement AddSupplierBtn = driver.findElement(By.xpath("//i[@class=\"menu-icon mdi mdi-truck vsalign\"]"));
	clickOnElement(AddSupplierBtn);
		}
	

	public void enter_supplier_name() {
	WebElement supplierName = driver.findElement(By.xpath("//input[@placeholder=\"Enter Name\"]"));
	supplierName.sendKeys("Supplier123");
		}
	
	public void Enter_Supplier_Mobile_no() {
	WebElement supplierMobileno = driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]"));
	supplierMobileno.sendKeys("6399980915");
			
		}
	public void enter_email() {
	WebElement enterEmail = driver.findElement(By.xpath("//input[@placeholder=\"Enter Email\"]"));
	enterEmail.sendKeys("Suppliername123@gmail.com");
	    }


}
