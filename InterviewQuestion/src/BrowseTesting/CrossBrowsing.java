package BrowseTesting;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class CrossBrowsing {

	WebDriver driver;
	
	
	
	  @Test (priority=0)
	  
	  @Parameters("browser") 
	  public void openBrowser(String Browser) {
	  if(Browser.equalsIgnoreCase("firefox")) {
	  //System.setProperty("webDriver.gecko.driver", "E:\\Swapnil\\Automation\\Jars\\Browser\\geckodriver.exe"); 
	  driver = new FirefoxDriver(); } 
	  if(Browser.equalsIgnoreCase("chrome")) {
	  
	  //System.setProperty("webdriver.chrome.driver", "E:\\Swapnil\\Automation\\Jars\\Browser\\chromedriver.exe"); 
	  driver= new ChromeDriver(); } 
	  if(Browser.equalsIgnoreCase("IE")) {
	  //System.setProperty("webdriver.ie.driver", "E:\\Swapnil\\Automation\\Jars\\Browser\\IEDriverServer.exe"); 
	  driver= new InternetExplorerDriver(); }
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.quit();
	  driver.quit();
	  
	  }
	  
	/*
	 * JavaScriptExecutor JS= (JavaScriptExecutor)driver; String S=
	 * JS.executeScript("return document.title");
	 */
			
	 
	

	/*
	 * @Test public void a_method(){ System.out.println("I'm in method E"); }
	 * 
	 * @Test(priority=-3) public void b_method(){
	 * System.out.println("I'm in method A"); }
	 * 
	 * @Test(priority=0) public void J_method(){
	 * System.out.println("I'm in method C"); }
	 * 
	 * @Test(priority=-1) public void e_method(){
	 * System.out.println("I'm in method B"); }
	 * 
	 * @Test public void A_method(){ System.out.println("I'm in method D"); }
	 */
	}
	
	
	
	
	
	

