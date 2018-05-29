package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	static WebElement element = null;

	public static WebElement txt_username(WebDriver driver) {
		element = driver.findElement(By.id("log"));
		return element;
	}
	
	public static WebElement txt_password(WebDriver driver) {
		element = driver.findElement(By.id("pwd"));
		return element;
		
	}
}
