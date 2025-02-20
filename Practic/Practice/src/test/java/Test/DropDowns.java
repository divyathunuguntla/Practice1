package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("option"));
		Select selectobj = new Select(dropdown);
		/*selectobj.selectByIndex(2);
		selectobj.selectByValue("option 2");
		selectobj.selectByVisibleText("Option 3"); */
		
		List<WebElement> alloptions = selectobj.getOptions();
		
		for(WebElement option : alloptions)
			System.out.println(option.getText());
		driver.close();
		
	}

}
