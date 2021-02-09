package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageLogin {

	WebDriver driver;
	By userNameInputField = By.id("userName");
	By passwordInputField = By.id("password");
	WebElement logInButton;
	
	public pageLogin(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getLogInButton() {
		return driver.findElement(By.id("login"));
	}

	public WebElement getUserNameInputField() {
		return driver.findElement(userNameInputField);
	}

	public WebElement getPasswordInputField() {
		return driver.findElement(passwordInputField);
	}
	
	public void inputUsernameCredentials(String username) {
		this.getUserNameInputField().sendKeys(username);
	}
	
	public void inputPasswordCredentials(String password) {
		this.getPasswordInputField().sendKeys(password);
	}
	public void clickLogInButton() {
		this.getLogInButton().click();
	}

	
	
}
