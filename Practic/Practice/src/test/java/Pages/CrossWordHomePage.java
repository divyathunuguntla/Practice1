package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrossWordHomePage {
	static WebDriver driver;
	By searchbox = By.name("q");
	By searchbutton = By.id("search-sub");
	
	public CrossWordHomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void setTextinSearchbox(String text)
	{
		driver.findElement(searchbox).sendKeys("harry potter");
	}
	public void clickSearchButton()
	{
		driver.findElement(searchbutton).click();
	}
}
