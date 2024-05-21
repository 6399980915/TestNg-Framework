package Base;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/*import org.testng.annotations.Test;*/

import io.cucumber.java.After;
/*import io.cucumber.java.Before;*/
import io.cucumber.java.Scenario;




public class BaseFile {
	public static Properties prop;
	public static WebDriver driver;
	static {
		
	
	try {
    FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/resources/env.properties");
	 prop = new Properties();
	prop.load(file);
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	}
	
	
	public void setup() {
	String browsername =  prop.getProperty("browser");
	switch (browsername) {
	case "Chrome":
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		driver = new ChromeDriver();
		break;
	case "firefox":
		FirefoxOptions firefoxoption = new FirefoxOptions();
		firefoxoption.addArguments("--incognito");
		driver = new FirefoxDriver();
		break;
	case "Edge":
		EdgeOptions Edgeoption = new EdgeOptions();
		Edgeoption.addArguments("--incognito");
		driver = new EdgeDriver();
		break;
	}
		
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
	
	 
	public void selectDropDown(WebElement ele, String value, String type) {
		Select s = new Select(ele);
		switch(type) {
		case "visibletext":
			s.selectByVisibleText(value);
			break;
		case "index":
			s.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			s.selectByValue(value);
			break;
		}
	}
	  
	public void test() {
		WebElement ele = null;
		selectDropDown(ele, "0", "index");
	}
	 
	public void actionMethod(WebElement ele, String methodtype) {
		Actions a = new Actions(driver);
		switch(methodtype) {
		case "mousehover":
		a.moveToElement(ele).build().perform();
		break;
		case "click":
			a.click().build().perform();
		break;	
		}
	}
	  
	public void bootstrapDropDown(List<WebElement> list, String value) {
		for (WebElement ele: list) {
			String  eleText = ele.getText();
			if (eleText.equals(value));
			ele.click();
			break;
			
		}
	}
	 
	public void explicitWait(List<WebElement> list , WebElement ele, String type) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		switch(type) {
		case "visibilityof": 
			wait.until(ExpectedConditions.visibilityOf(ele));
			break;
		case "alertIsPresent":
			wait.until(ExpectedConditions.alertIsPresent());
			break;
		case "visibilityofAllElement":
			wait.until(ExpectedConditions.visibilityOfAllElements(list));
			break;
		case "invisilityOfElement":
			wait.until(ExpectedConditions.invisibilityOf(ele));
		}
	}
	 
	public void windowhandle(Set<String> set, String Title) {
		List<String>list = new ArrayList <String>(set);
		for(int i=0; i<list.size() ; i++) {
			String actTitle=driver.switchTo().window(list.get(i)).getTitle();
			if(actTitle.equals(Title)) {
				driver.switchTo().window(list.get(i));
			}
		}
	}
	 
	public void handleAlert(String type) {
		WaitForElement(10, "alert", null);
		Alert a = driver.switchTo().alert();
		
		switch(type) {
		case "ok":
			a.accept();
		break;	
		case "cancel":
			a.dismiss();
		break;	
		}
	}
	


	 
	public  void WaitForElement(int timeout, String condition, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		switch(condition) {
		case"alert":
			wait.until(ExpectedConditions.alertIsPresent());
		case"visibilityOf":
			wait.until(ExpectedConditions.visibilityOf(ele));
		case"clickable":
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		}
	}
	 
	public void clickOnElement(WebElement ele) {
		
		try {
			ele.click();
		}catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", ele);
			}
		}
	
	
	

	public void validateText(WebElement ele, String expected) {
		WaitForElement(10, "visibilityOf",ele);
		String actualvalue = ele.getText();
		assertEquals(actualvalue, expected);
}
@After 

	public void tearDown(Scenario s) throws IOException{
		if(s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("screenshots/"+s.getName()+".png"));
		}
		driver.quit();
	}
	
	

	public void SwitchFrame(String value, String type) {
		switch(type) {
			case"name":
				driver.switchTo().frame(value);
			break;
			case"index":	
				driver.switchTo().frame(Integer.parseInt(value));
			break;
		}
	}
	

	public void SwitchWindow(String title) {
		Set<String>allWindow= driver.getWindowHandles();
		for(String s: allWindow) {
			driver.switchTo().window(s);
		String	cureentTitle = driver.getTitle();
		if(cureentTitle.equals(title));
		}
	}
}
