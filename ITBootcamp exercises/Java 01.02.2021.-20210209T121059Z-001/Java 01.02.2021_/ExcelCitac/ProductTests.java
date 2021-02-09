package ExcelCitac;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.ShopPage;
import tests.LogInTests;

public class ProductTests extends BaseTest{  //napravili smo basetest klasu i u nju stavili before i after class i samo extendujes na ove testove 
//	WebDriver driver;
//	MyAccountPage myAccountPage;
//	MainPage mainPage;
//	ShopPage shopPage;
//	CartPage cartPage;
//	
//	@BeforeClass
//	public void preKlase() {
//		System.setProperty("webdriver.chrome.driver",
//				"driver-lib\\chromedriver.exe");
//		
//		this.driver = new ChromeDriver();
//		this.myAccountPage = new MyAccountPage(driver);
//		this.mainPage = new MainPage(driver);
//		this.shopPage = new ShopPage(driver);
//		this.cartPage = new CartPage(driver);
//		driver.manage().window().maximize();
//	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
	}
	
//	@Test (priority = 0)
//	public void addProductToCart() throws InterruptedException {
//		mainPage.navigateToShopTab();
//		Thread.sleep(2000);
//		shopPage.getFlyngNinjaAddToCardButton().click();
//		Thread.sleep(2000);
//		mainPage.navigateToCartTab();
//		Thread.sleep(2000);
//		String textForAssert = cartPage.getFlyngNinjaProductLabel().getText();
//		Assert.assertEquals(textForAssert, "Flying Ninja");
//		}
	
//	@Test (priority = 5)
//	public void deleteProductFromCart() throws InterruptedException {
//		addProductToCart();
//		cartPage.clickCloseItemButton();
//		String textForAssert = cartPage.getAssertEmptyCart().getText();
//		Assert.assertEquals(textForAssert, citacIzExela.getStringData("DeleteItem", 1, 1));
//	}
	
//	@Test (priority = 10)
//	public void addThreeItemsInCart() throws InterruptedException {
//		mainPage.navigateToShopTab();
//		Thread.sleep(2000);
//		shopPage.getFlyngNinjaAddToCardButton().click();
//		Thread.sleep(2000);
//		shopPage.happyNinja1AddToCartClick();
//		Thread.sleep(2000);
//		shopPage.ninjaSilhoueteAddToCartClick();
//		Thread.sleep(2000);
//		mainPage.navigateToCartTab();
//		String textForAssert1 = cartPage.getAssertFirstItem().getText();
//		Assert.assertEquals(textForAssert1, citacIzExela.getStringData("Add3Items", 2, 1));
//		String textForAssert2 = cartPage.getAssertSecondItem().getText();
//		Assert.assertEquals(textForAssert2, citacIzExela.getStringData("Add3Items", 3, 1));
//		String textForAssert3 = cartPage.getAssertThirdItem().getText();
//		Assert.assertEquals(textForAssert3, citacIzExela.getStringData("Add3Items", 4, 1));
//		
//	}
	
	@Test (priority = 15)
	public void addTwoItemsDeleteOne() throws InterruptedException {
		mainPage.navigateToShopTab();
		Thread.sleep(2000);
		shopPage.getFlyngNinjaAddToCardButton().click();
		Thread.sleep(2000);
		shopPage.happyNinja1AddToCartClick(); //ne mogu da nadjem path pa da se ubijem :D
		Thread.sleep(2000);
		mainPage.navigateToCartTab();
		Thread.sleep(2000);
		cartPage.clickCloseItemButton();
		String textForAssert = cartPage.getAssertUndoButton().getText();
		Assert.assertEquals(textForAssert, citacIzExela.getStringData("AddTwoDeleteOne", 1, 1));
		
		
	}
	
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
//	@AfterClass
//	public void pposleKlase() {
//		driver.close();
//		System.out.println("Izvrsava se posle klase");
//	}
}
