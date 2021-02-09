package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testTools {
//	Zatim napisati program koji ide na ovaj URL = https://demoqa.com/
//		Klikne na "Book Store Application"
//		Klikne na "Login"
//		Unese kredencijale sa kojima se korisnik registrovao u prvom koraku
//		Klikne na "Login" dugme
//		Assertuje da se korisnik ulogovao
//		Izloguje se
//	Domaci nastavak od sinoc, juce ste se registrovali manuelno i automatski se ulogovali (i izlogovali), a sad imate sledece ali da napomenem prvo da ovu akciju log out ostavite za kraj, znaci ovo sta imate od danas stavite izmedju log in-a i log out-a:
//		Kada se ulogujete kliknite na dugme "Book Store"
//		Kliknite na koju god hocete knjigu
//		Tu knjigu dodate u kolekciju
//		Proverite na profilu da li vam se dodala ta knjiga
//		Stavite thread sleep 5 sekundi
//		Kliknite na "Delete All Books"
//		Proverite da li je knjiga (ili knjige, ako zelite mozete vezbati da dodate vise knjiga) obrisana sa naloga
//		Izlogujte se sa naloga
//		Za profil kreirajte klasu "pageProfile", ostale akcije pisite u pageBooks klasu koja je vec kreirana na jucerasnjem domacem zadatku
//	
	WebDriver driver;
	pageTools pageTools;
	pageBooks pageBooks;
	pageLogin pageLogin;
	pageProfile pageProfile;
	
	
	@BeforeClass
	public void preKlase(){
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		driver = new ChromeDriver();
		this.pageTools = new pageTools(driver);
		this.pageBooks = new pageBooks(driver);
		this.pageLogin = new pageLogin(driver);
		this.pageProfile = new pageProfile(driver);
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/");
		Thread.sleep(2000);
	}
	
	@Test
	public void logIn() throws InterruptedException {
		pageTools.navigateToBookStore();
		Thread.sleep(2000);
		pageBooks.clickLogInButton();
		Thread.sleep(2000);
		pageLogin.inputUsernameCredentials("Nesto89");
		pageLogin.inputPasswordCredentials("Stormrage1989!");
		pageLogin.clickLogInButton();
		Thread.sleep(2000);
		String assertValue = pageBooks.getUsernameValue();
		Assert.assertEquals(assertValue, "Nesto89");
		Thread.sleep(2000);
		pageBooks.clickLogOutButton();
		
		
	}
	//nisam uspeo da nadjem path od knjige da bi je assertovao :(
	@Test 
	public void addBook() throws InterruptedException {
		pageTools.navigateToBookStore();
		Thread.sleep(2000);
		pageBooks.clickLogInButton();
		Thread.sleep(2000);
		pageLogin.inputUsernameCredentials("Nesto89");
		pageLogin.inputPasswordCredentials("Stormrage1989!");
		pageLogin.clickLogInButton();
		Thread.sleep(2000);
		pageBooks.clickFirstBook();
		pageBooks.clickAddToCollection();
		Thread.sleep(2000);
		pageBooks.clickProfileButton();
		String assertValue1 = pageProfile.getFirstBook().getText();
		Assert.assertEquals(assertValue1, "Git Pocket Guide");
		
	}
	
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void posleClase() {
		driver.close();
	}
	
	
	

}
