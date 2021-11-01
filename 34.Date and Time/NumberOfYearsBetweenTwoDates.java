package dateAndTime_1_11_2021;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class NumberOfYearsBetweenTwoDates
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(".....A.P.J. Abdul Kalam.....");
		System.out.println();
		System.out.println("Enter Date of Birth :- ");
		System.out.println("Enter year : ");
		int year=sc.nextInt();
		System.out.println("Enter month : ");
		int month=sc.nextInt();
		System.out.println("Enter date : ");
		int date=sc.nextInt();
		
		LocalDate d1 = LocalDate.of(year,month,date);
		

		System.out.println("Enter Date of Death :- ");
		System.out.println("Enter year : ");
		int year2=sc.nextInt();
		System.out.println("Enter month : ");
		int month2=sc.nextInt();
		System.out.println("Enter date : ");
		int date2=sc.nextInt();
		
		LocalDate d2 = LocalDate.of(year2,month2,date2);
		
		
		
		Period p = Period.between(d1, d2);	
	
		
	  System.out.println("No Of years alive in the  world :  " + p.getYears());
	          

	}

}


/*

.....A.P.J. Abdul Kalam.....

Enter Date of Birth :- 
Enter year : 
1931
Enter month : 
10
Enter date : 
15
Enter Date of Death :- 
Enter year : 
2015
Enter month : 
7
Enter date : 
27
No Of years alive in the  world :  83


*/
