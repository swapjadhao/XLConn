package Pattern;

interface I1
{
	abstract void show(int a);
	}

interface I2
{
	abstract  void show();
	}
abstract class PatternPrac implements I1,I2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PatternPrac P= new PatternPrac(12);
		P.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("1");
		
	}


	
}
