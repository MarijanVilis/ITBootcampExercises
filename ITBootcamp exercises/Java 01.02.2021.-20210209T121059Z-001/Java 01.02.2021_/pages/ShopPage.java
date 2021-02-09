package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ExcelCitac.BaseTest;

public class ShopPage {
	WebDriver driver;
	WebElement flyngNinjaAddToCardButton;
	WebElement happyNinja1AddToCartButton;
	WebElement ninjaSilhoueteAddToCartButton;
	
	public WebElement getHappyNinja1AddToCartButton() {
		return driver.findElement(By.className("/html/body/div[1]/div/div[2]/div/main/div[2]/ul/li[2]/div/a[2]"));
	}

	public WebElement getninjaSilhoueteAddToCartButton() {
		return driver.findElement(By.className("/html//main[@id='main']/div[@class='columns-3']/ul//a[@href='/?add-to-cart=27']"));
	}

	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFlyngNinjaAddToCardButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
	}
	public void happyNinja1AddToCartClick() {
		this.getHappyNinja1AddToCartButton().click();
	}
	public void ninjaSilhoueteAddToCartClick() {
		this.getninjaSilhoueteAddToCartButton().click();
	}
	
}
