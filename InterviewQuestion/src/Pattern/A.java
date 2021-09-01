package Pattern;

public interface A {
	
	abstract void Show1();

}
interface B {
	abstract void Show();

}
class Demo implements A,B
{

	@Override
	public void Show1() {
		// TODO Auto-generated method stub
		System.out.println("Show1");
	}
	
	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
		
	}
	
	public static void main(String []args)
	{
		
		String Data="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char[]Arr= Data.toCharArray();
		
		for(int i=Arr.length-1;i>=0;i--)
		{
			System.out.print(Arr[i]);
}
		
		
	}

	
	}

