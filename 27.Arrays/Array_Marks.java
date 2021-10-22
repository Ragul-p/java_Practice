package array_22_10_2021;

import java.util.Scanner;

public class Array_Marks 
{
 
public static void main (String[] args) 
{
	Array_Marks m = new Array_Marks();
	m.num();
}
	

	void num()
	{
		int total=0;
		int highest=0;
		int n=1;
		int c=0;
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your name : ");
	    String name =sc.next();
	    
	    System.out.println("Enter no of subject : ");
	    int count=sc.nextInt();
	    
	    int[] marks = new int[count];
	 
	  
	    for(int i=0;i<marks.length;i++)
	    {
	    	System.out.println("Enter "+n+" subject marks ");
	    	n++;
	    	marks[i]=sc.nextInt();
	    	
	    	
	    	total=total+marks[i];
	    	
	    	if(marks[i]>highest)
	    	{
	    		highest = marks[i];
	    	}
	    	
	    	if(marks[i]>=90)
	    	{
	    		c++;
	    	}
        
	    }
	    System.out.println("Your name : " + name);
	    System.out.println("total marks : " + total);
	    System.out.println("highest marks : " + highest);
	    System.out.println("80 above subject : " + c);
	   
	}
}

/*

output :-

Enter your name : 
ragul
Enter no of subject : 
5
Enter 1 subject marks 
99
Enter 2 subject marks 
98
Enter 3 subject marks 
97
Enter 4 subject marks 
96
Enter 5 subject marks 
95
Your name : ragul
total marks : 485
highest marks : 99
80 above subject : 5

*/
