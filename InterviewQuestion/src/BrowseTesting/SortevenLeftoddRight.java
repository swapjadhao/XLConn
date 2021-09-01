package BrowseTesting;

public class SortevenLeftoddRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			 
			  int arr[]={1,5,6,7,8,9,10,20,52,60};
			  System.out.println("Original Array: ");
			  for (int i = 0; i < arr.length; i++) {
			   System.out.print(arr[i]+" ");
			  }
			  arr=separateEvenOddNumbers(arr);
			  System.out.println("nArray after separating even and odd numbers : ");
			  for (int i = 0; i < arr.length; i++) {
  			   System.out.print(arr[i]+" ");
			  }
			 }
			 public static int[] separateEvenOddNumbers(int arr[])
			 {
			  int left=0;
			  int right=arr.length-1;
			  for (int i = 0; i < arr.length; i++) {
			 
			   while(arr[left]%2==0)
			   {
			    left++;
			   }
			   while(arr[right]%2==1)
			   {
			    right--;
			   }
			 
			   if(left<right)
			   {
			    int temp=arr[left];
			    arr[left]=arr[right];
			    arr[right]=temp;
			   }
			  }
			  return arr;
			 }
}

