package Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CovidReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://selfregistration.cowin.gov.in/");
		driver.findElement(By.xpath("//input")).sendKeys("7385463946");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/app-login/ion-content/div/ion-grid/ion-row/ion-col/ion-grid/ion-row/ion-col[1]/ion-grid/form/ion-row/ion-col[2]/div/ion-button")).click();
		Thread.sleep(6000);
		//WebElement Drop1=driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span"));
		driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span")).click();
		driver.findElement(By.xpath("//span[text()=' Aadhaar Card ']")).click();
		
		//Select S= new Select(Drop1);
		//S.selectByVisibleText(" Aadhaar Card ");
		
		//ion-button

	}

}
