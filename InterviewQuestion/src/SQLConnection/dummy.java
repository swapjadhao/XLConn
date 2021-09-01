package SQLConnection;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

class P
{
	void show()
{
		System.out.println("P show");
}
	}
class C extends P
{
	void show()
	{
		System.out.println("C show");
	}
}
		
public class dummy extends C  {

	public static void main(String[] args) {
ArrayList<Integer> L=new ArrayList<>();	
		L.add(10);
		L.add(20);
		L.add(30);
		L.add(12);
		L.add(15);
		L.add(1);
		L.add(9);
		Collections.sort(L);
		//Collections.reverse(L);
		System.out.println(L);
WebDriver driver = null;
		
//System.setProperty(webdriver.ie.driver, path)
JavascriptExecutor JS=(JavascriptExecutor)driver;
String TItle=(String) JS.executeScript("return document.title");

//File Screen =((TakesScreenshot)driver).g
//File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(screen, new File("c:\Selenium Testing Questions\screen.png"));

		Comparator cmp=Collections.reverseOrder();
		
		Collections.sort(L, cmp);
		System.out.println(L);
		Iterator i= L.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		// TODO Auto-generated method stub
		int Num=738546945;
		int rev=0;
		while(Num!=0)
		{
			int no= Num%10;
			rev=rev*10+no;
			Num=Num/10;
		}
		System.out.println(rev);
		
		//C p= (C) new P();
	//	p.show();
		Integer [] Arr={9,6,5,7,8,4,2,3,6,5,1,2};
		Arrays.sort(Arr);
		System.out.println(Arrays.toString(Arr));
		
	//	Arrays.sort(Collections.reverseOrder(Arr));
		String Data="My name is Swapnil";
	char[] CH= Data.toCharArray();
	Set<Character>CHE= new HashSet<>();
	
	for(char F:CH)
	{
		if(CHE.add(F)==false)
		{
			System.out.println(F);
		}
	}
	
	Integer [] Arr1={9,6,5,7,8,4,2,3,6,5,1,2};
	Set<Integer> I= new HashSet<>();
	
	for(int B: Arr1)
	{
		if(I.add(B)==false)
		{
			System.out.println(B);
		}
			
	}
	
	
		

	}
	/*
	 * WebDriver driver;
	 * 
	 * 
	 * String P= driver.getWindowHandle(); Set<String> AW=
	 * driver.getWindowHandles(); Iterator<String>I1= AW.iterator();
	 * while(I1.hasNext()) { String C= I1.next();
	 * 
	 * 
	 * }
	 * 
	 * 
	 */
	

}
