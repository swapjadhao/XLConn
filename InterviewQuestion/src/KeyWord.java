final class KeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=6;
		final int b=7;
		System.out.println(a++);
		
		
		for(int R=0;R<5;R++)
		{
			for(int C=0;C<R;C++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int R=0;R<6;R++)
		{
			for(int C=6;C>R;C--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		for(int R=0;R<6;R++)
		{
			for(int C=5;C>R;C--)
			{
				System.out.print(" ");
			}
			
			for (int h = 1; h <= R; h++) {
				System.out.print("*");
			}
			
			System.out.println();
		
		//System.out.println(b++);// final keyword can't be modified
	}

	}
}

