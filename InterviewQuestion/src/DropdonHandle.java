import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdonHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.seleniumeasy.com/test/");
		Thread.sleep(5000);
		//List DropDown
		/*
		 * WebElement element=
		 * driver.findElement(By.xpath("(//ul[@class='dropdown-menu'])[4]"));
		 * driver.findElement(By.xpath("(//a[text()='Yes please!'])[1]")).click();
		 * driver.findElement(By.xpath("(//a[text()='Bootstrap Progress bar'])[1]")).
		 * click();
		 */
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();	
		Thread.sleep(5000);
		//driver.findElement(By.name("birthday_day")).click();
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		
		//Select Dropdown
		//label[text()="Custom"]
		WebElement DayPath=driver.findElement(By.name("birthday_day"));
		Select S= new Select(DayPath);
		S.selectByIndex(12);
		S.selectByVisibleText("10");
	
		

	}

}
