import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//dropdown
WebDriver driver = null;
WebElement Data= driver.findElement(By.id("dropdown"));
Select dropdown = new Select(Data);
dropdown.selectByIndex(1);
dropdown.selectByValue("D");
dropdown.selectByVisibleText("hg");

		
//Mouseover 
Actions action = new Actions(driver);
action.moveToElement(Data).build().perform();
		
	}

}
