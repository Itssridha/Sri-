package sri;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static void main(String []args) throws InterruptedException {

	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();


	
	WebElement element =driver.findElement(By.xpath("//select[@id='first']"));
//	Select a = new Select(element);
//	a.selectByIndex(1);
//	Thread.sleep(3000);
//	a.selectByValue("Microsoft");
//	a.selectByVisibleText("Yahoo");
	
//	Select a = new Select(element);
//	boolean multiple =a.isMultiple();
//	System.out.println(multiple);
	
	Select a = new Select(element);
	
//	List <WebElement> options =a.getOptions();
//	for (int i=0;i<options.size();i++) {
//	WebElement element2 =options.get(i);
//	String ddvalues=element2.getText();
//	System.out.println(ddvalues);
	
	a.selectByIndex(1);
	Thread.sleep(3000);
	a.selectByIndex(0);
	Thread.sleep(3000);
	a.selectByIndex(2);
	
	List <WebElement> allSelect =a.getAllSelectedOptions();
	for (int i=0;i<allSelect.size();i++) {

		WebElement webelement= allSelect.get(i);
		String text=webelement.getText();
		System.out.println(text);
	}
	WebElement firstselectoption =a.getFirstSelectedOption();
	String text = firstselectoption.getText();
	
	System.out.println(text);
	a.deselectAll();

	
	
}
}


