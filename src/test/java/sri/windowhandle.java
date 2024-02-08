package sri;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {
	public static void main(String []args) {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_7n32aeqqe4_e&adgrpid=1315017564951826&hvadid=82188862025546&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=154767&hvtargid=kwd-82189528219307:loc-90&hydadcr=14452_2334185");
 		driver.manage().window().maximize();
 		
 		
 		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple mobile",Keys.ENTER);
 		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

 		
    	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
 		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();

		String parent=driver.getWindowHandle();

		Set<String>child=driver.getWindowHandles();
		 		

 		for (String x:child) {
 			if(!parent.equals(x)) {
 				driver.switchTo().window(x);
 		String name=driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
 		System.out.println(name);
 		
 		
 		
 		
 		
 		
 		
			}		}
	}
}
