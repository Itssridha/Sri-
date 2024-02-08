package selenium;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webpage {
	public static void main (String []args) {
		WebDriverManager.edgedriver().setup();
		WebDriver s = new EdgeDriver();
		s.get("https://demo.guru99.com/test/web-table-element.php#");
		s.manage().window().maximize();
		
		List <WebElement> l =s.findElements(By.tagName("table"));
		for (int i=0;i<l.size();i++) {
			WebElement w=l.get(i);
			WebElement x=w.findElement(By.tagName("tbody"));
			
		List <WebElement> m=x.findElements(By.tagName("tr"));
		for (int j=0;j<l.size();j++) {
			WebElement r =m.get(j);
			
		List <WebElement> n=r.findElements(By.tagName("td"));
		for (int k=0;k<l.size();k++) {
			WebElement d=n.get(k);
			String text =d.getText();
			if (text.equals("492m")) {
				System.out.println(text+"present in number");
				
			}}}}}}
