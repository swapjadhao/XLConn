package PatternPrac;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.xpath("//div[text()='Recruiters']")).click();
		driver.findElement(By.xpath("//div[text()='Companies']")).click();
		//driver.findElement(By.xpath("//div[text()='Tools']")).click();
		String Actual="HR Manager - HR Executive - HR Recruiter Consultants - Naukri.com";
		String Parent= driver.getWindowHandle();
		
		
		Set<String>handles=driver.getWindowHandles();
		//List<String>AllWindow=(List<String>) driver.getWindowHandles();
		//Iterator<String> I1= AllWindow.iterator();
		System.out.println(AllWindow.size());
		driver.switchTo().window(AllWindow.get(1));
		/*
		 * while(I1.hasNext()) { String child_W=I1.next();
		 * 
		 * if(!Parent.equalsIgnoreCase(child_W)) {
		 * 
		 * System.out.println(driver.switchTo().window(child_W).getTitle()); }
		 * 
		 * 
		 * 
		 * }
		 */

	}
}
