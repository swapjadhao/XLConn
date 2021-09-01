

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptUse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "path");
		System.setProperty("webdriver.ie.driver", "path");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo");
		WebElement test= driver.findElement(By.xpath("//*[@id='Main']/section[1]/div/div/div[1]/h4/strong"));
		//WebElement Test= driver.findElement(By.id("SIvCob"));
		Actions A= new Actions(driver);
		A.doubleClick(test).build().perform();
	
		
		FirefoxProfile ssl= new FirefoxProfile();
		ssl.setAcceptUntrustedCertificates(true);
		ssl.setAssumeUntrustedCertificateIssuer(true);
		JavascriptExecutor JS= (JavascriptExecutor) driver;
		
		String Title= (String) JS.executeScript("return document.title");
		System.out.println(Title);
		WebElement ele= driver.findElement(By.xpath("//span[text()='Features']"));
		WebElement Link=driver.findElement(By.xpath("(//a[@href='//www.phptravels.net/admin'])[1]"));
		
		A.moveToElement(ele).perform();
		Thread.sleep(5000);
		A.contextClick(Link).perform();;
		
		
		
		
	//ScreenShot code
		File Shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(Shot,"E:\\Swapnil\\Personal\\Resume\\Screen.png");//apache Jars

	}

}
