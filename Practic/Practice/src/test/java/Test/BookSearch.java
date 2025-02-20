package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CrossWordHomePage;

public class BookSearch {
	static WebDriver driver;
	public static void main(String[] args) {
		search();
	}
	public static void search()
	{
		driver = new ChromeDriver();		
		CrossWordHomePage obj = new CrossWordHomePage(driver);
		driver.get("https://www.crossword.in/");
		driver.manage().window().maximize();
		obj.setTextinSearchbox("Harry potter");
		obj.clickSearchButton();
		driver.quit();
	}
}
