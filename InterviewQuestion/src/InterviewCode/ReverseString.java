package InterviewCode;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Data="Swapnil";		
		StringBuilder SB= new StringBuilder();		
		SB.append(Data);
		System.out.println(SB.reverse());
		
		char[]Ch= Data.toCharArray();
		for(int i=Ch.length-1;i>=0;i--)
		{
			System.out.print(Ch[i]);
		}

	}

}
