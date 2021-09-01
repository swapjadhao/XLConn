package RSFramework.qaClick;

import java.util.Objects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {

	@Test(dataProvider="GetData")
	public void Demo3(String UN, String psw) {
		System.out.println(UN);
		System.out.println(psw);

	}
	@Test(groups= {"Smoke"})
	public void Demo4() {
		System.out.println("Demo4");

	}
	
	@DataProvider
	public Object[][] GetData()
	{
		Object[][] data= new Object[3][2];
	
		
		data[0][0]="test00";
		data[0][1]="test01";
		data[1][0]="test10";
		data[1][1]="test11";
		data[2][0]="test20";
		data[2][1]="test21";
		return data;
	
		

		
		
	}
}
