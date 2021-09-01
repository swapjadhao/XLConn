import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class TestNGTesting<FileUtils> {
	
	WebDriver driver;
	
	@BeforeClass
	public void StartBrowser()
	{
		driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Test(priority=1,description="Test1")
	public void SignIn()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
			String Ver=driver.getCurrentUrl();
		Assert.assertTrue(Ver.contains("orangehrmlive"));
		
		
	}
	
	@Test(priority=2,description="Test2",dependsOnMethods ="SignIn" )
	public void LoginAction()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		boolean B=driver.findElement(By.xpath("//div[@id=\"branding\"]/a/img")).isDisplayed();
		Assert.assertEquals(12, 13);
		Assert.assertTrue(B);
		String Text= driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(Text, "Welcome Tom");
		
	}
	
	@Test(priority=3,description="Test3",dependsOnMethods = "LoginAction")
	public void Logout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		boolean K=driver.findElement(By.id("logInPanelHeading")).isDisplayed();
		Assert.assertTrue(K);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("path"));
		File Srcf= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}

}

