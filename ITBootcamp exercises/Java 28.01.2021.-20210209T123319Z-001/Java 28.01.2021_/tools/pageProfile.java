package tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class pageProfile {

	WebDriver driver;
	Actions actions;
	By deleteAllBooksButton = By.id("submit");
	List<WebElement> table;
	By firstBook = By.xpath("//span[@id='see-book-Git Pocket Guide']/a[@href='/profile?book=9781449325862']");
	


	public WebElement getFirstBook() {
		return driver.findElement(firstBook);
	}


	public pageProfile(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getDeleteAllBooksButton() {
		return driver.findElement(deleteAllBooksButton);
	}


	public List<WebElement> getTable() {
		this.table = driver.findElements(By.className("action-buttons"));
		return table;
	}
	
	public void listOfBooks() {
		this.getTable();
	}
			
			
			
			
			
			
			
}
