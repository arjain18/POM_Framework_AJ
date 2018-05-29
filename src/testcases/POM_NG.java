package testcases;

import app_modules.SignIn;
import utility.ReadExcel;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class POM_NG {
	public static WebDriver driver = null;
	String URL = ReadExcel.readURL();
	String username = ReadExcel.readUsername();
	String password = ReadExcel.readPassword();
	Logger log = Logger.getLogger("devpinoyLogger");
  @Test
  public void f() {
		SignIn.Execute(driver, username, password);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver","c:\\Development\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		log.debug("******--- Its started -----********");
	
		driver.get(URL);
  }

  @AfterMethod
  public void afterMethod() {
		log.debug("******--- Its completed -----********");
		driver.quit();
  }

}
