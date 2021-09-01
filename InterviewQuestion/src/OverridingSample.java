import java.util.List;

import org.openqa.selenium.WebDriver;

class Testj
{
		void show()
			{
			System.out.println("Test1 show method");
			}
}

class OverridingSample extends Testj {
	
	
	void show()
	{
		System.out.println("Override class show method");
	}

	//WebDriver driver = new WebDriver();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingSample A= new OverridingSample();
		A.show();
		
		Testj B= new Testj();
		B.show();

	}
	List<String> list= new List<String>();
}
