package Susret20CitanjeFajlova;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.youtube.com/?hl=sr&gl=RS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Rick Astley Never gonna give you up");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sbse0\"]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string")).click();
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
