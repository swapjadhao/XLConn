import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
	driver.findElement(By.linkText("Demo")).sendKeys(selectLinkOpeninNewTab);
	
	  ArrayList tabs = new ArrayList (driver.getWindowHandles());
	    System.out.println(tabs.size());
	    driver.switchTo().window((String) tabs.get(0)); 
	
	
		Set<String> S= driver.getWindowHandles();
		
		Iterator<String> I= S.iterator();
	String NewWin= I.next();	
		driver.switchTo().window(NewWin);
		
		
		

	}

}
