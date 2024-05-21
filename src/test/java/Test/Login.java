package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import Base.BaseFile;


public class Login extends BaseFile{
	



BaseFile Base = new BaseFile();


public static WebDriver driver;	

@Test(priority = 0)
public void user_validate_the_username_and_password() {
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
}

/*
 * public void click_the_login_button() {
 * 
 * WebElement loginbtn = driver.findElement(By.cssSelector(
 * "button.btn.btn-block.btn-primary.btn-lg.font-weight-medium.auth-form-btn.col-12"
 * )); clickOnElement(loginbtn); }
 */

}
