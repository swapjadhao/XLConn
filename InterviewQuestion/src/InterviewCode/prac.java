package InterviewCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		
		int k=010;
		int B=07;
		System.out.println(k);
		System.out.println(B);
		// TODO Auto-generated method stub
		Integer[] Num= {1,2,3,4,5,1,2,3,6,7};
		Arrays.sort(Num);
		System.out.println(Num[0]);
		int Max=Num[0];
		int Min=Num[0];
		for(int i=1;i<Num.length;i++)
		{		
			if(Num[i]>Max)
			{
				Max=Num[i];
			}
			
			if(Num[i]<Min)
			{
				Min=Num[i];
			}
			
			
		}
		System.out.println(Max);
		System.out.println(Min);
		
		
		String Data= "       My Name Is Swapnil";
		System.out.println(Data.trim());
		
		System.out.println(Data.replaceAll("\\s", ""));
		
		int N=123456789;
		int rev=0;
		while(N!=0)
		{
			int no=N%10;
			rev=rev*10+no;
			N=N/10;
		}
		System.out.println(rev);
		
		Integer[] Num1= {32,65,4,5,55,88,32,12,14,17};
		Arrays.sort(Num1);
		System.out.println(Arrays.toString(Num1));
		Arrays.sort(Num1, Collections.reverseOrder());
		System.out.println(Arrays.toString(Num1));
		
		Scanner scan = new Scanner(System.in);
		 String s=scan.nextLine();
        int i = scan.nextInt();
        double d= scan.nextDouble();
      



       System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        

	}

}
