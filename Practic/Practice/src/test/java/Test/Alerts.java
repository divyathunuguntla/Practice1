package Test;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class Alerts {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//JS Alert
		driver.findElement(By.xpath("//button[@onClick='jsAlert()']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Alert alert1= driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//JS confirm
		driver.findElement(By.xpath("//button[@onClick='jsConfirm()']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();	
		
		//JS prompt
		driver.findElement(By.xpath("//button[@onClick='jsPrompt()']")).click();
		Alert alert3 =  driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Testing");
		System.out.println(alert3.getText());
		
		
		driver.close();
		
	}
}
