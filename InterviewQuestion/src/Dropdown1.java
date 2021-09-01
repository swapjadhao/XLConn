import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
	//	driver.findElement(By.name("login")).click();
	//	Thread.sleep(5000);
		WebElement Web=driver.findElement(By.linkText("Demo"));
		
		Actions A= new Actions(driver);
		A.contextClick(Web);
		//A.moveToElement(Web);
		A.contextClick().build().perform();
	//	driver.findElement(By.xpath("//a[@id='u_0_2_SJ']")).click();
		
		//WebElement W =driver .findElement(By.id("day"));
	//	Select S= new Select(W);
		//S.selectByValue("7");
	


	}

}
