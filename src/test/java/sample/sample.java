package sample;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class sample {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdeiver.edge.driver","C:\\Users\\MJ\\eclipse-workspace\\MavenProject\\target\\msedgedriver.exe");
		WebDriver  driver=new EdgeDriver();
		//driver.get("https://www.facebook.com/"); // (get.) slow to loading
		//driver.navigate().to("https://www.facebook.com/");  // compare to get it works fast
		String url="https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_1rlu76yi08_e&adgrpid=1315017564951826&hvadid=82188862025546&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=154767&hvtargid=kwd-82189526801617:loc-90&hydadcr=14452_2334185";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
    	driver.switchTo().newWindow(WindowType.TAB);
		String CurrentUrl =driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		if (url.equals(CurrentUrl)) {
			System.out.println("given url is correct");
		}
		
		else {
			System.out.println("url is not matched");
		}
			
		String title =driver.getTitle();
		System.out.println(title);
		
		String pagesource=driver.getPageSource();
		System.out.println( pagesource);
		driver.close();
		driver.quit();
		
		
////		WebElement element=driver.findElement(By.xpath("//*[text()='Account & Lists']"));
////		Actions a =new Actions(driver);
////		a.moveToElement(element).perform();
////		WebDriverManager.edgedriver().setup();
////		
//		WebDriver  driver1=new EdgeDriver();
//		String url1="https://www.facebook.com/";
//		driver1.get(url1);
//		
//		driver1.manage().window().maximize();
//		
//		WebElement element1=driver1.findElement(By.id("email"));
//		Actions b =new Actions(driver1);
//		b.sendKeys(element1,"sridharmaverick@gmail.com").perform();
//		b.click().perform();
//
//		WebElement element2=driver1.findElement(By.id("pass"));
//		Actions c =new Actions(driver1);
//		c.sendKeys(element2,"347623732").perform();
//		c.click().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
