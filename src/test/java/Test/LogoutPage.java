package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseFile;

public class LogoutPage extends BaseFile {
BaseFile Base = new BaseFile();
@Test
public void Logout () {
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
	
	
	WebElement logoutBtn = driver.findElement(By.xpath("//span[@class=\"menu-title\"][text()=\"Logout\"]"));
	clickOnElement(logoutBtn);
	
	WebElement clearlogoutbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"][text()=\"Clear and Logout\"]"));
	clickOnElement(clearlogoutbtn);
}
}
