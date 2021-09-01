package RSFramework.qaClick;

import org.testng.annotations.*;

import org.testng.annotations.Test;

public class day1 {
	
	
	
@Parameters({"Url","APIUrl"})
	@Test
	public void Demo1(String UrlName, String New1) {
	System.out.println(UrlName);
		System.out.println(New1);

	}
	@Test(groups= {"Smoke"})
	public void Demo2() {
		System.out.println("Demo2");

	}
}
