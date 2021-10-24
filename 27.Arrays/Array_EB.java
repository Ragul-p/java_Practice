package array_22_10_2021;

import java.util.Scanner;

public class Array_EB 
{

	public static void main(String[] args) 
	{
	Array_EB e = new Array_EB();
	e.num();
	}

  
  
	public void num() 
	{
		int average=0;
		int total=0;
		int greatest=0;
		int n=1;
		int low = Integer.MAX_VALUE;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many month EB bill Reading : ");
		int month=sc.nextInt();
		
		int[] bill =new int[month];
	
		
	  for(int i=0;i<bill.length;i++)
	  {
		  System.out.println("Enter "+n +" month amount");
		  n++;
		  bill[i]=sc.nextInt();
		
		  
		  if(bill[i]>greatest)
		  {
			 greatest=bill[i]; 
		  }
		  
		   
		  if(bill[i]<low)
		  {
			low=bill[i];  
		  }
		  
		  total=total+bill[i];
		  
		  average=total/month;
		  
		  
	  }
		System.out.println("Total amount : " +total);
		System.out.println("Average amount : " +average);
		System.out.println("Highest amount : " + greatest);
		
	}

}

/*

How many month EB bill Reading : 
5

Enter 1 month amount
200
Enter 2 month amount
300
Enter 3 month amount
420
Enter 4 month amount
150
Enter 5 month amount
430

Total amount : 1500
Average amount : 300
Highest amount : 430
Lowest amount  : 150

*/
