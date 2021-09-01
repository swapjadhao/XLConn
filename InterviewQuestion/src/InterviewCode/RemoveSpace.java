package InterviewCode;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveSpace RS = new RemoveSpace();
		RS.RemoveStart_EndSpace("    I am Swapnil     Jadhao   ");
		RS.RemoveSpaceBetween("    I am Swapnil     Jadhao   ");

	}

	public void RemoveStart_EndSpace(String Data) {
		System.out.println(Data);
		System.out.println(Data.trim());
	}

	public void RemoveSpaceBetween(String Data) {

		System.out.println(Data);
		System.out.println(Data.replaceAll("\\s", ""));

	}
}
