package Susret21TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Domaci1 {
//	Otici na web stranicu http://www.seleniumframework.com/Practiceform/
//		Assert-ovati sva polja iz "contact us" forme
//		Popuniti sva polja iz "contact us" forme i submit-ovati formu

	WebDriver driver;
	
	@BeforeClass
	public void preKlase() {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
			driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
			Thread.sleep(2000);
	}
	@Test
	public void test1() {
		WebElement name = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[1]/input"));
		String text = name.getText();
		Assert.assertEquals("", text);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[2]/input"));
		String text1 = email.getText();
		Assert.assertEquals("", text1);
		WebElement telephone = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[3]/input"));
		String text2 = telephone.getText();
		Assert.assertEquals("", text2);
		WebElement country = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[4]/input"));
		String text3 = country.getText();
		Assert.assertEquals("", text3);
		WebElement company = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[5]/input"));
		String text4 = company.getText();
		Assert.assertEquals("", text4);
		WebElement message = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/span/textarea"));
		String text5 = message.getText();
		Assert.assertEquals("", text5);
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/p/a[1]"));
		String text6 = submit.getText();
		Assert.assertEquals("Submit", text6);
		WebElement clear = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/p/a[2]"));
		String text7 = clear.getText();
		Assert.assertEquals("clear", text7);
		
	}
	@Test
	public void test2() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[1]/input")).sendKeys("Marijan Vilis");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[2]/input")).sendKeys("fakemail@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[3]/input")).sendKeys("0621234567");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[4]/input")).sendKeys("Serbia");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[5]/input")).sendKeys("Acina vojska testera");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/span/textarea")).sendKeys("blablabla");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/p/a[1]")).click();
		
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	@AfterClass
	public void posleClase() {
		driver.close();
	}
}
