package sri;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {
	public static void main (String []args) throws InterruptedException {

		String alert ="https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";	
		
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get(alert);
	
	driver.manage().window().maximize();
	
	WebElement element =driver.findElement(By.name("alert"));
	element.click();
	Thread.sleep(2000);
	Alert simplealert=driver.switchTo().alert();
	simplealert.accept();
	
	WebElement element2 =driver.findElement(By.name("confirmation"));
	element2.click();
	Thread.sleep(2000);
	Alert confirmalert=driver.switchTo().alert();
	confirmalert.dismiss();
	
	WebElement element3 =driver.findElement(By.name("prompt"));
	element3.click();
	Thread.sleep(2000);
	Alert promptalert =driver.switchTo().alert();
	String name="sridhar";
	promptalert.sendKeys(name);
	
	String alertMessage =promptalert.getText();
	System.out.println(alertMessage);
	 
}
}

