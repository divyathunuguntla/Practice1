package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CrossWordHomePage;

public class BookSearchTestNG {
	static WebDriver driver ;
	@BeforeTest
	public void browserLaunch() {
		System.out.println("Started");
		driver = new ChromeDriver();
	}
	
	@Test
	public static void search()
	{	
		//CrossWordHomePage obj = new CrossWordHomePage(driver);
		driver.get("https://www.crossword.in/");
		driver.manage().window().maximize();
		((CrossWordHomePage) driver).setTextinSearchbox("Harry potter");
		((CrossWordHomePage) driver).clickSearchButton();
	}
	
	@AfterTest
	public void browserClose() {
		driver.quit();
	}
}
