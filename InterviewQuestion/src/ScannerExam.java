import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner SC = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name= SC.next();
		System.out.println("Enter yout age");
		int age= SC.nextInt();
		System.out.println("Enter Gender");
		char Gender= SC.next().charAt(0);
		System.out.println("Name is ="+name);
		System.out.println("Age is ="+age);
		System.out.println("Gender is ="+Gender);
	
		
	}

}
