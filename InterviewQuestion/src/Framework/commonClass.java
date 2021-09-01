package Framework;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/index.php?rp=/login");
		
		//Thread.sleep(5000);
		List<WebElement> Classes= driver.findElements(By.xpath("//div[@class='form-group']"));
		//Classes.get(1).sendKeys("Swapnil");
		Thread.sleep(5000);
		System.out.println(Classes.size());
		for(WebElement ele: Classes)
		{
			
		}
		
		//System.out.println(Classes.size());
		/*
		 * Iterator I=Classes.iterator(); while(I.hasNext()) { WebElement
		 * Data=(WebElement) I.next(); System.out.println("*****"+Data);
		 * Thread.sleep(5000); Data.sendKeys("Swapnil"); }
		 * 
		 * String js = "arguments[0].setAttribute('value','"+Swapnil+"')";
		 * ((JavascriptExecutor) driver).executeScript(js, myElement);
		 * //Thread.sleep(3000); System.out.println(Classes); //Thread.sleep(2000);
		 * //System.out.println("******"+path);
		 * 
		 * //driver.findElement(By.) //Classes.get(1).sendKeys("Swapnil Jadhao");
		 * //Classes.get(2).sendKeys("Jadhao");
		 */

	}

}
