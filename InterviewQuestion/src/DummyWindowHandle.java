import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.phptravels.com/");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//a[@href='https://www.hotel.irctctourism.com/'])[1]")).click();
		driver.findElement(By.linkText("Demo")).click();
	String Parent= driver.getWindowHandle();
	Set<String>AllW= driver.getWindowHandles();
	
	for(String Child:AllW)
	{
		if(!Parent.equalsIgnoreCase(Child));
		{
			driver.switchTo().window(Child);
		}
	}
		
		

	}

}
