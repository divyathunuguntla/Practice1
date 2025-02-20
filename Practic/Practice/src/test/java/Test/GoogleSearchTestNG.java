package Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTestNG {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public  void browserLaunch() 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void googlesearch()
	{
		driver.get("https://google.com");
		driver.manage().window().maximize();
		GoogleSearchPage.textboxSearch(driver).sendKeys("Selenium" , Keys.ENTER);
		//GoogleSearchPage.searchButton(driver).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void browserClose()
	{
		driver.quit();
	}
}

