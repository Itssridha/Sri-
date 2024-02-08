import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cls {
	public static void main(String[] args) throws AWTException, IOException {
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_1pjxmjdce2_e&adgrpid=1320515122347239&hvadid=82532458991604&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=154776&hvtargid=kwd-82533124393923:loc-90&hydadcr=14453_2334184");
//		driver.manage().window().maximize();

//		WebElement element =driver.findElement(By.xpath("//*[text()='Account & Lists']"));
//		Actions a= new Actions(driver);
//		a.moveToElement(element).perform();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		
//		WebElement element = driver.findElement(By.id("email"));
//		
//		Actions a= new Actions(driver);
//		a.sendKeys(element, "sridharmaverick@gmail.commaverick@gmail.com").perform();
//		
//		WebElement element2=driver.findElement(By.id("pass"));
//		Actions c =new Actions(driver);
//		c.sendKeys(element2,"347623732").perform();
//		c.click().perform();
		
		WebElement element = driver.findElement(By.id("email"));
		Actions a =new Actions(driver);
		a.sendKeys(element,"sridharmaverick@gmail.com").perform();
		a.doubleClick().perform();
		
		a.contextClick().perform();
		
		Robot r= new Robot();
		
		
		for (int i=0;i<4;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	 
		
//	TakesScreenshot tk = (TakesScreenshot)driver;
//	File screenshot =tk.getScreenshotAs(OutputType.FILE);
//	File des = new File ("C:\\Users\\MJ\\eclipse-workspace\\MavenProject\\target\\screenshot\\images.png");
//	FileUtils.copyFile(screenshot, des);

		
		
	}
}

