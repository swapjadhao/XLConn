import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Employee{
	private int EmpId;
	
	public void SetEmpID(int Id)
	{
		EmpId=Id;
	}	
	/*
	 * public int GetEmpID() { this.GetEmpID(EmpId); return EmpId; }
	 */
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		Employee E= new Employee();
		E.SetEmpID(100);
		//System.out.println(E.GetEmpID());	
		
		//JavascriptExecutor JS= (JavascriptExecutor)driver
		driver.get("www.gmail.com");
		driver.findElement(By.id("Dummy")).sendKeys(Keys.ENTER);
		driver.navigate().to(Url);
		driver.navigate().back();
		driver.navigate().forward();
	}
}
