package Test.Integration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	
	public static void main(String args[]) throws InterruptedException
	{
		// System.setProperty("webdriver.chrome.driver", "E:\\Swapnil\\Automation\\Browser_Exe\\chromedriver_Letest.exe"); 
		//  WebDriver driver= new ChromeDriver();
	  System.setProperty("webdriver.gecko.driver", "E:\\Swapnil\\Automation\\Jars\\Browser\\geckodriver.exe"); 
		  WebDriver driver = new FirefoxDriver();
		  //Swapnil
		  //Swapnil
		  //Swapnil
		 driver.manage().window().maximize();
	
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	  
	  System.out.println("Title is= "+driver.getTitle());
		driver.findElement(By.xpath("//*[@id='radio-btn-example']/fieldset/label[1]")).click();
	  
	  // Radio button clicks
	 List<WebElement> TotalRadBtn= driver.findElements(By.xpath("//input[@name='radioButton']"));
	 System.out.println("Total Number of RadioButton "+TotalRadBtn.size());
	 Thread.sleep(2000);
	 
	 for(int i=0;i<TotalRadBtn.size();i++)
	 {
		 TotalRadBtn.get(i).click();
		 Thread.sleep(1000);
	 }
	 
	 // AutoComplete
	 
	driver.findElement(By.id("autocomplete")).sendKeys("India");
	driver.findElement(By.id("autocomplete")).sendKeys("");
	Thread.sleep(3000);
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
	
	// Select Dropdown
	
	WebElement Drop= driver.findElement(By.id("dropdown-class-example"));
	
	Select S= new Select(Drop);
	S.selectByIndex(1);
	Thread.sleep(1000);
	S.selectByValue("option2");
	Thread.sleep(1000);
	S.selectByVisibleText("Option3");
	Thread.sleep(1000);
	}

}
