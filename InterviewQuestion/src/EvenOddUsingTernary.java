import java.util.Scanner;

public class EvenOddUsingTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num= new Scanner(System.in);
		System.out.println("Enetr Nunmber - ");
		int A= num.nextInt();
		String Result= (A % 2==0)? "even" : "odd";
		
		System.out.println(Result);

	}

}
