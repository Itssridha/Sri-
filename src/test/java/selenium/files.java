package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class files {

	public static void main (String []args) throws Exception {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Misspellings&gad_source=1&gclid=CjwKCAiAq4KuBhA6EiwArMAw1PNhplh5Mw1Z-T3dYib-lo67VPwew8lLV7CmNmfbOPi5PCxHs3w1jBoCceMQAvD_BwE&gclsrc=aw.ds");
	driver.manage().window().maximize();
	
	WebElement w =driver.findElement(By.xpath("//button[text()='Upload Resume']"));
	w.click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("D:\\auto it\\file upload.exe");
	
	
	}
	
}

