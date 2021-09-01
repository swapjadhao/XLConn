package BrowseTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;


public class HeadLess1 {

	public static void main(String[] args) {
	
		 // Declaring and initialising the HtmlUnitWebDriver
        HtmlUnitDriver unitDriver = new HtmlUnitDriver();
        
        // open demo site webpage
        unitDriver.get("https://demoqa.com/");
 
 //Print the title of the page
        System.out.println("Title of the page is -> " + unitDriver.getTitle());	
		                    
        unitDriver.quit();			
		         }	
}


