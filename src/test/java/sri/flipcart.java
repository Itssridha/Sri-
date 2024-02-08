package sri;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipcart {

	public static void main(String []args)  {

//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("motrola mobile",Keys.ENTER);
//		
//		driver.findElement(By.xpath("//*[text()='Motorola G34 5G (Ice Blue, 128 GB)'][1]"));
//		
//		WebElement element=driver.findElement(By.xpath("//*[text()='₹11,999'][1]"));
//		String Text= element.getText();
//		on
//		System.out.println(Text);
//		
//	 	WebElement element1=driver.findElement(By.xpath("//*[text()='Buy Now']")).
//		
//		
//		WebElement element2=driver.findElement(By.id("Buy Now"));
//     	Actions c =new Actions(driver);
//	    c.click().perform();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_7n32aeqqe4_e&adgrpid=1315017564951826&hvadid=82188862025546&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=154767&hvtargid=kwd-82189528219307:loc-90&hydadcr=14452_2334185");
 		driver.manage().window().maximize();
 		
 		//WebElement element=	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("motrola mobile");
 		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("motrola mobile");
	
 //		WebElement element1=driver.findElement(By.xpath("//*[text()='G54 5G (Midnight Blue, 12GB RAM, 256GB Storage) | MediaTek Dimensity 7020 Processor | 6000mAh Battery with 30W Turbocharging | 50 MP OIS Camera with UltraPixel Technology | 6000 mAh Battery'][1]"));
		
//		WebElement element=driver.findElement(By.xpath("//*[text()='₹16,809'][1]"));
//		String Text= element.getText();
//		
//		System.out.println(Text);
		
}
}
