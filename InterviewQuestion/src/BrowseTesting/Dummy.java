package BrowseTesting;

import java.sql.DriverManager;

public class Dummy {

	public static void main(String[] args) {
		
		int arr[]={1,3,5,7,9,2,4,6,8,10};
	int left=0;
	int right=arr.length-1;
	
	for(int i=0;i<arr.length;i++)
	{
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
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	}
	
	//Array1 : [Python, JAVA, PHP, C#, C++, SQL]
			//	Array2 : [MySQL, SQL, SQLite, Oracle, PostgreSQL, DB2, JAVA]
				//Common element is : [JAVA, SQL]
			
			String [] data= {"Python", "JAVA"};
			String [] data1= {"Python", "C#", "C++",  "PostgreSQL"};
			
			for(int i=0;i<data.length;i++)
			{
				for(int k=0;k<data1.length;k++)
				{
					
					if(data[i]==(data1[k]))
					{
						//System.out.println("*");
						System.out.println(data[i].toString());
					}
				}
			}

		}
		
	}
	