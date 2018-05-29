package app_modules;

import org.openqa.selenium.WebDriver;

import pom.Home_Page;
import pom.Login_Page;

public class SignIn {
	
	public static void Execute(WebDriver driver, String username, String password) {
	Home_Page.lnk_MyAccount(driver).click();
	Login_Page.txt_username(driver).sendKeys(username);
	Login_Page.txt_password(driver).sendKeys(password);
	}
}
