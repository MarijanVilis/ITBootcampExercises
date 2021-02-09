package Susret19Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Domaci1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to(" https://demoqa.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/button")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]")).getText();
		System.out.println("Tekst od \"Click me\" dugmeta je: " + text);
		driver.manage().deleteCookieNamed("_gat_gtag_UA_109033876_1");
		driver.manage().deleteCookieNamed("_gid");
		driver.manage().deleteCookieNamed("_ga");
		Thread.sleep(10000);
		driver.close();
		
		
	}

}
