package scannerClass_21_10_2021;

import java.util.Scanner; // import Scanner Class

public class ScannerClass 
{

	public static void main(String[] args) 
	{
		ScannerClass s = new ScannerClass();
		    s.Int();
		  //s.met();
	}


public void Int()
	{
		Scanner sc = new Scanner(System.in); //Object creation in Scanner Class
		                       //Input Stream (System.in)
		
		System.out.println("Enter no1 ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter no2 ");
		int num2 = sc.nextInt();
		
		System.out.println("num1+num2 : " + (num1+num2));
/*

Output:-

Enter no1 
50
Enter no2 
50
num1+num2 : 100

 */
	}



public void met()
{
	
 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Name : ");
	String name=sc.next();
	System.out.println("your name :" + name);

/*

output:-

Enter First Name : 
ragul p
your name :ragul

 */

	
	
	
/*
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First and Last Name : ");
	String name1=sc.nextLine();
	System.out.println("your name :" + name1);
*/	
	
	
	/*

output:-

Enter First and Last Name : 
ragul p
your name :ragul p

	 */
		
}

}
