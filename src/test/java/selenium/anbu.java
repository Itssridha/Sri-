package selenium;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class anbu {
	public static void main (String []args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	driver.manage().window().maximize();
	
	
	List <WebElement> itable = driver.findElements(By.tagName("table"));
	  for ( int i=0;i<itable.size();i++) {
		WebElement table= itable.get(i); 
		WebElement tbody =table.findElement(By.tagName("tbody"));
		
	List <WebElement> irow = tbody.findElements(By.tagName("tr"));
	  for (int j=0;j<irow.size();j++) {
		  WebElement row= irow.get(j); 
		  
		List <WebElement> idata = row.findElements(By.tagName("td"));
			for(int k=0;k<idata.size();k++) {
				WebElement data =idata.get(k);
				String text =data.getText();
				System.out.println(text);
}}}}}