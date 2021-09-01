package InterviewCode;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Data="abcdefghijklmnoprstuvwxyz";
//char[]ch=Data.toCharArray();

for(int j=0;j<Data.length();j++)
{
	char ch=Data.charAt(j);
	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		System.out.println(ch);
	}
	}



		
	}

}
