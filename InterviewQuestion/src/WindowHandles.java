import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://docs.phptravels.com/");
Thread.sleep(5000);
//driver.findElement(By.xpath("(//a[@href='https://www.hotel.irctctourism.com/'])[1]")).click();
driver.findElement(By.linkText("Demo")).click();

Thread.sleep(5000);
String ParentWindow= driver.getWindowHandle();

System.out.println(ParentWindow);

Set<String> AllWindows=driver.getWindowHandles();

for(String child:AllWindows)
{
	
	if(!ParentWindow.equalsIgnoreCase(child))
	{
		driver.switchTo().window(ParentWindow);
		System.out.println(child);
		
	}
	}


























String ParentWin= driver.getWindowHandle();
Set<String> allWin=driver.getWindowHandles();

for(String Child:allWin)
{
	if(!ParentWin.equalsIgnoreCase(Child)) {
		driver.switchTo().window(Child);
		
	}
}



//driver.switchTo().alert().accept();
		

	}

}
