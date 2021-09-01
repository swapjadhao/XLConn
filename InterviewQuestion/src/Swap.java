
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10;
		int b=20;
		
		b=b-a;
		a=b+a;
		System.out.println("b value is ="+b);
		System.out.println("a value is ="+a);
		
	String Data="Swapnil Jadhao";
	
	char[]Arr= Data.toCharArray();
	
	for(int i=Arr.length-1;i>=0;i--)
	{
		System.out.print(Arr[i]);
	}
	
	System.out.println();
	String Str= "Swapnil Jadhao";
	StringBuilder SB= new StringBuilder();
	
	SB.append(Str);
	SB.reverse();
	System.out.println(SB);
				
	}

}
