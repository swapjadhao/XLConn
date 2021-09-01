import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import Cursors.Iterator;

public class Riughwork {

	public static void main(String[] args) {
		WebDriver driver = null;
		
		String Data="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char[]ch= Data.toCharArray();
		
		for(int i=ch.length-1;i>1;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();

		
		/*
		 * Actions A= new Actions(driver); A.doubleClick(E).perform(())
		 */
		
		FileInputStream fis= new FileInputStream(path);
		HSSFWorkbook WB = new XSSF
				
				JavaScriptExecutor js= (JavaScriptExecutor)driver;
		js.executeScript("document.getElementID")
		
		
		
		
		
		
		int Num1=123456789;
		int rev=0;
		
		while(Num1!=0)
		{
		int no=Num1%10;
		rev=rev*10+no;
		Num1= Num1/10;
		
		}
		
		System.out.println(rev);
		
		
		// TODO Auto-generated method stub

		/*
		 * WebDriver driver = null;
		 * 
		 * String Parent= driver.getWindowHandle(); Set<String> AllWindow=
		 * driver.getWindowHandles();
		 * 
		 * java.util.Iterator<String> I= AllWindow.iterator(); while(I.hasNext()) {
		 * String Child=I.next();
		 * 
		 * if(!Parent.equalsIgnoreCase(Child)) {
		 * driver.switchTo().window(Child).getTitle(); } }
		 */
		
		Integer[] Num= {9,5,6,4,8,7,3,2,1,0};
		Arrays.sort(Num);
		System.out.println(Arrays.toString(Num));
	Arrays.sort(Num,Collections.reverseOrder());
	System.out.println(Arrays.toString(Num));
	
	ArrayList<Integer> AL= new ArrayList<>();
	AL.add(0);
	AL.add(5);
	AL.add(9);
	AL.add(8);
	AL.add(6);
	AL.add(2);
	AL.add(3);
	AL.add(1);
	AL.add(7);
	System.out.println(AL);
	
Collections.sort(AL);
System.out.println(AL);
Comparator cmp= Collections.reverseOrder();
Collections.sort(AL,cmp);
System.out.println(AL);


//Convert WebDriver Object to TakeScreenShot object
TakesScreenshot src= ((TakesScreenshot)driver);
//used to create image file
File FileSrc=src.getScreenshotAs(OutputType.FILE);

		/*
		 * File Storage= new File(//path); FileUtils.copyFile(FileSrc,Storage);
		 */
		
	
		
		
	}

}
