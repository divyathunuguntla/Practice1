package Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			//driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
			driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			/*WebElement tileA = driver.findElement(By.xpath("//*[@name='A']"));
			WebElement tileD = driver.findElement(By.xpath("//*[@name='D']"));		
			Actions action = new Actions(driver);
			action.moveToElement(tileA);
			action.build().perform();
			action.clickAndHold();
			action.moveToElement(tileD);
			action.release().perform(); */
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			WebElement dragable = driver.findElement(By.id("draggable"));
			WebElement droppable = driver.findElement(By.id("droppable"));
			Actions action = new Actions(driver);
			action.dragAndDrop(dragable, droppable);
			action.build().perform();
			Thread.sleep(3000);
			driver.quit();
			System.out.println("Done");
		}
}
