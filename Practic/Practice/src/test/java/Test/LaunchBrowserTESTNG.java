package Test;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;
@Test
public class LaunchBrowserTESTNG {
	 {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crossword.in/");
		driver.manage().window().maximize();
		//File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("./image.png"));
		WebElement ele = driver.findElement(By.cssSelector(".logo-desktop"));
		File file = ele.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File( "./image4.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));  
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		/*driver.navigate().forward();
		driver.navigate().refresh();
		String originalwindow = driver.getWindowHandle();
		driver.switchTo().window(originalwindow); 
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());*/
		driver.close();
		
	}
}
