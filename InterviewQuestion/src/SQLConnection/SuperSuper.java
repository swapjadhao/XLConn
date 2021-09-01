package SQLConnection;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SuperSuper extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	class A extends B
	{
		void A()
		{
			Set<Character> S= new HashSet<>();
			System.out.println("A");
		}
		
	}
	class B
	{
		void B()
		{
			System.out.println("B");
		}
	}
	WebDriver driver;
	
	TakesScreenshot src= ((TakesScreenshot)driver);
	File SrcShot= src.getScreenshotAs(OutputType.FILE);
	File DesFIle= new File(FileWIthPath);
	
	FileUtils.copyFile()

}
