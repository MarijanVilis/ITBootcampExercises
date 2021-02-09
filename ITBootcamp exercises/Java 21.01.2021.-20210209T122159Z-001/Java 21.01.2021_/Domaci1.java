package Susret18Html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Domaci1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Marijan Vilis");
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("marijanvilis2@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}
}