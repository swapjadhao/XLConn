import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"Today is Thrusday"
		
		String Data="Today is Thrusday";

		
		Integer []a= {2,5,4,9,6,3,2,1,4,7,8,5,4,9,6,3,1};
Arrays.sort(a,Collections.reverseOrder());
System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		//a[@class="btn btn-primary"]
		//div[@id="autoLaunch"]/a
		
		/*
		 * WebDriver driver = null; String ParentWindow= driver.getWindowHandle();
		 * Set<String> ALlWindow=driver.getWindowHandles();
		 * 
		 * for(String Child:ALlWindow) { if(!ParentWindow.equalsIgnoreCase(Child)) {
		 * driver.switchTo().window(Child); } }
		 */
		


	
		
	
		
		
		

		
		
		
	}

}
