package tools;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class pageBooks {
	
	WebDriver driver;
	Actions actions;
	By logInButton = By.id("login");
	By logOutButton = By.id("submit");
	By usernameValue = By.id("userName-value");
	By firstBook = By.id("see-book-Git Pocket Guide");
	By addToCollection = By.id("addNewRecordButton");
	By profileButton = By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']//div[@class='accordion']/div[6]/div/ul[@class='menu-list']/li[3]");
	By bookStoreApi = By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']//div[@class='accordion']/div[6]/div/ul[@class='menu-list']/li[4]");
	

	
	
	public WebElement getBookStoreApi() {
		return driver.findElement(bookStoreApi);
	}
	
	public WebElement getProfileButton() {
		return driver.findElement(profileButton);
	}

	public WebElement getAddToCollection() {
		return driver.findElement(addToCollection);
	}

	public WebElement getFirstBook() {
		return driver.findElement(firstBook);
	}

	public String getUsernameValue() {
		return driver.findElement(usernameValue).getText();
	}

	public WebElement getLogOutButton() {
		return driver.findElement(logOutButton);
	}

	public pageBooks(WebDriver driver) {
		super();
		this.actions = new Actions(driver);
		this.driver = driver;
	}
	
	public WebElement getLogInButton() {
		return driver.findElement(logInButton);
	}
	
	public void clickLogInButton() {
		this.getLogInButton().click();
	}
	public void clickLogOutButton() {
		this.getLogOutButton().click();
	}
	public void clickFirstBook() {
		this.getFirstBook().click();
	}
	public void clickAddToCollection() {
		this.getAddToCollection().click();
	}
	public void clickProfileButton() {
		actions.moveToElement(getBookStoreApi());
		actions.perform();
		this.getProfileButton().click();
	}
	
	
}
