package Numbers;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 20, res;
		String Sym = "*x`";
		switch (Sym) {
		case "+":
			res = a + b;
			System.out.println(res);
			break;
			
		case "-":
			if(a>b)
			{
			res = a - b;
			}
			else
			{
				res=b-a;
			}
			System.out.println(res);
			break;
			
		case "*":
			res = a * b;
			System.out.println(res);
			break;
			
		default: 
			System.out.println("Invali modifier");
		break;

		}
		

	}

	
}
