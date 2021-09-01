package SQLConnection;

class Demo1 {
	private void show() {
		System.out.println("In Demo");
	}
}
public class OverrideMethod extends Demo1 {
	void show() {
		System.out.println("In Main");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideMethod o= new OverrideMethod();
		o.show();
		Demo1 D= new OverrideMethod();
		D.// Show method not visible here 
	}

}
