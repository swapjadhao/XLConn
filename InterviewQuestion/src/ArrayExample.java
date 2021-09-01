import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// array Declaration		
		int []a;
		int b[];
		//Declaration and creation
		int []d= new int[100];
		
		int Data[]= new int[1000];
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chhrome.driver", "E/chromedriver.exe");
		String StringData[]=new String[1000];
		//int [] G= new int[-10];
		try
		{
		
		driver.manage().window().maximize();
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//form[@class=\"ng-untouched ng-pristine ng-valid\"]/div[2]/button")).click();
		driver.findElement(By.linkText("HOTELS")).click();
		//driver.switchTo().alert().accept();
		}
		finally
		{
		//driver.close();
		driver.quit();
		}
		
	}

}
