package Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Elements {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crossword.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("q")).sendKeys("the maid");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("The Maid", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> options = driver.findElements(By.className("facet-head-title"));
		for(WebElement ele : options)
		{
			System.out.println(ele.getText());
		}
		//driver.findElement(By.id("search-sub")).click();
		/*File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./image2.png")); */
		driver.close();
		
	}
}
