import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PrintAllLinkText 
{


	public static void main(String[] args) 
	{

	// TODO Auto-generated method stub	
WebDriver driver = new ChromeDriver();
driver.get("https://www.ford.com/");
	List<WebElement> LinkText=driver.findElements(By.tagName("a"));
	System.out.println(LinkText.size());

	
	for(int i =0;i<LinkText.size();i++)
	{
		System.out.println("Link text is = "+LinkText.get(i).getText());
	

	}
	}
	
		



}
