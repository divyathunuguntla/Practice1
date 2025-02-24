package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.CrossWordHomePage;

public class BookSearch {
	
	@Test
	public static void search()
	{
		WebDriver driver = new ChromeDriver();		
		CrossWordHomePage obj = new CrossWordHomePage(driver);
		driver.get("https://www.crossword.in/");
		driver.manage().window().maximize();
		obj.setTextinSearchbox("Harry potter");
		obj.clickSearchButton();
		driver.quit();
	}
}
