package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsPractice {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.crossword.in/");
			driver.manage().window().maximize();
			//driver.findElement(By.className("current-cart")).click();			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.findElement(By.xpath("//input[@class='main-search__input wizzy-search-input']")).sendKeys("The Maid");
			driver.findElement(By.id("search-sub")).click();
			driver.findElement(By.xpath("//div[@id='page-wrap']//li[1]//a[1]//div[2]//img[1]")).click();
			driver.close();
			
		}
}
