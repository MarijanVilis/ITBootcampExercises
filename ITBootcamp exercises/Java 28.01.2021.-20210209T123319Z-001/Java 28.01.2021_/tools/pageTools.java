package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class pageTools {

	WebDriver driver;
	Actions actions;
	WebElement bookStoreButton;
	WebElement bottom;
	
	
	public WebElement getBottom() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]"));
	}


	public pageTools(WebDriver driver) {
		this.driver = driver;
		this.actions = new Actions(driver);
	}
	
	
	public WebElement getBookStoreButton() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[1]"));
	}


	public void navigateToBookStore() throws InterruptedException {
		actions.moveToElement(getBottom());
		actions.perform();
		this.getBookStoreButton().click();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
}
