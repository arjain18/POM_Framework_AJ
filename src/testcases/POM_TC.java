package testcases;
import app_modules.SignIn;
import utility.ReadExcel;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POM_TC {
	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","c:\\Development\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Logger log = Logger.getLogger("devpinoyLogger");
		log.debug("******--- Its started -----********");
		String URL = ReadExcel.readURL();
		String username = ReadExcel.readUsername();
		String password = ReadExcel.readPassword();
		driver.get(URL);
		SignIn.Execute(driver, username, password);
		log.debug("******--- Its completed -----********");
		driver.quit();
		
	}
}
