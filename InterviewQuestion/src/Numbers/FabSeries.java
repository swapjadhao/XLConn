package Numbers;

public class FabSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=10;
		int a=0,b=1,c;
		for(int i=1;i<=no;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

	}

}
