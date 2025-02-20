package Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;

public class GoogleSearch {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearch();
	}
	public static void googlesearch()
	{
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		GoogleSearchPage.textboxSearch(driver).sendKeys("Selenium", Keys.ENTER);
		//GoogleSearchPage.searchButton(driver).sendKeys(Keys.ENTER);
		driver.quit();
	}
}

