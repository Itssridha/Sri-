package sri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main (String []args) {
		
		System.setProperty("WebDriver.edge.driver","C:\\Users\\MJ\\eclipse-workspace\\MavenProject\\target\\msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    driver.manage().window().maximize();
	    
	    
	   WebElement drag= driver.findElement(By.xpath(" //a[contains(text(),'BANK')]"));
	   
	    WebElement drop=driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
	    

	    
	    Actions a= new Actions(driver);
	    
	    a.dragAndDrop(drag,drop).perform();
	
	}
}
