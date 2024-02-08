package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class javascripexe {
	public static void main (String[]args) {
		
		System.setProperty("WebDriver.edge.driver","C:\\Users\\MJ\\eclipse-workspace\\MavenProject\\target\\msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
		
	    
	    WebElement user=driver.findElement(By.id("email"));
	    WebElement pass=driver.findElement(By.id("pass"));
	    WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	    
	    
		JavascriptExecutor j=(JavascriptExecutor)driver;  //down cast
		j.executeScript("arguments[0].setAttribute('value','selenium')",user,pass,login);
		Object o =j.executeScript("return arguments[0].getAttribute('value')",user,pass,login);
		System.out.println(o);
		j.executeScript("arguments[2].click()",user,pass,login);		
	}
}
