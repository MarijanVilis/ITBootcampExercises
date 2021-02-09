package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ExcelCitac.BaseTest;

public class CartPage {
	WebDriver driver;
	WebElement flyngNinjaProductLabel;
	WebElement closeProduct;
	WebElement assertEmptyCart;
	WebElement assertFirstItem;
	WebElement assertSecondItem;
	WebElement assertThirdItem;
	WebElement assertUndoButton;
	
	public WebElement getAssertUndoButton() {
		return driver.findElement(By.className("restore-item"));
	}

	public WebElement getAssertFirstItem() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}

	public WebElement getAssertSecondItem() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td[3]/a"));
	}

	public WebElement getAssertThirdItem() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[3]/td[3]/a"));
	}

	public WebElement getAssertEmptyCart() {
		return driver.findElement(By.xpath("/html//article[@id='post-8']//p[@class='cart-empty woocommerce-info']"));
	}

	public WebElement getCloseProduct() {
		return driver.findElement(By.className("product-remove"));
	}

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFlyngNinjaProductLabel() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}
	
	public void clickCloseItemButton() {
		this.getCloseProduct().click();
	}
	
	
}
