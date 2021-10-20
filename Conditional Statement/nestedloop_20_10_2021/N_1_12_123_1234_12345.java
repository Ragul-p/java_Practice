package nestedloop_20_10_2021;

public class N_1_12_123_1234_12345
{

	public static void main(String[] args)
	{
		N_1_12_123_1234_12345 n = new N_1_12_123_1234_12345();
		//n.met();
		//n.met2();
		//n.met3();
		//n.met4();
		//n.met5();
		//n.met6();
		//n.met7();
		n.met8();
	}

	
	
	public void met8()
	{
		int row=1;
		while(row<=5)
		{
		int col=1;
		while(col<row)  
		{
			System.out.print(" "); 
			col++;
		}
		
		int star=1;
		while(star<=6-row) // or  while(star<=i)
		{
		System.out.print(row + " ");  // (row) -->replace--> (row + " ")
		star++;
		}
		//i--;
		
		System.out.println();
		row++;
		}
	
/*	
 output:-
 
		1 1 1 1 1 
		 2 2 2 2 
		  3 3 3 
		   4 4 
		    5 
*/
	}



	public void met7() 
	{
		int row=1;
		while(row<=5)
		{
		int col=1;
		while(col<row)  
		{
			System.out.print(" "); 
			col++;
		}
		
		int star=1;
		while(star<=6-row) // or  while(star<=i)
		{
		System.out.print(row);  // ("* ") -->replace--> (row)
		star++;
		}
		//i--;
		
		System.out.println();
		row++;
		}
/*	
 output:-
 
		11111
		 2222
		  333
		   44
		    5
*/
		
	}



	public void met6() 
	{
		
		int row=1;
		while(row<=5)
		{
		int col=1;
		while(col<row)  // (col<=row)--->replace--->(col<row)
		{
			System.out.print(" "); //(" " + " ")-->replace-->(" ")
			col++;
		}
		
		int star=1;
		while(star<=6-row) // or  while(star<=i)
		{
		System.out.print("* ");
		star++;
		}
		//i--;
		
		System.out.println();
		row++;
		}
/*		
		* * * * * 
		 * * * * 
		  * * * 
		   * * 
		    * 
		    
		   
*/
	}



	public void met5() 
	{
		
		int row=1;
		while(row<=5)
		{
		int col=1;
		while(col<row)  // (col<=row)--->replace--->(col<row)
		{
			System.out.print(" " + " ");
			col++;
		}
		
		int star=1;
		while(star<=6-row) // or  while(star<=i)
		{
		System.out.print("* ");
		star++;
		}
		//i--;
		
		System.out.println();
		row++;
		}
/*
 output:-
 
		* * * * * 
		  * * * * 
		    * * * 
		      * * 
		        * 
*/
	}



	public void met4() 
	{
		
		/*
		 
		 star     row    star+row=6       star=6-row
		 5        1       5+1=6
		 4        2       4+2=6
		 3        3       3+3=6
		 2        4       2+4=6
		 1        5       1+5=6
		       
		 */
	
       // int i=5;
		int row=1;
		while(row<=5)
		{
		int col=1;
		while(col<row)  // (col<=row)--->replace--->(col<row)
		{
			System.out.print(col + " ");
			col++;
		}
		
		int star=1;
		while(star<=6-row) // or  while(star<=i)
		{
		System.out.print("* ");
		star++;
		}
		//i--;
		
		System.out.println();
		row++;
		}
	/*	
output:-

		* * * * * 
		1 * * * * 
		1 2 * * * 
		1 2 3 * * 
		1 2 3 4 * 
		
	*/
	}



	public void met3()
	{
	
		int row=1;
		while(row<=5)
		{
		int col=1;
		while(col<row)  // (col<=row)--->replace--->(col<row)
		{
			System.out.print(col + " ");
			col++;
		}
		int star=1;
		while(star<=5)
		{
		System.out.print("* ");
		star++;
		}
		
		System.out.println();
		row++;
		}
/*
 output:-
 	
		* * * * * 
		1 * * * * * 
		1 2 * * * * * 
		1 2 3 * * * * * 
		1 2 3 4 * * * * * 
*/		
	}



	public void met2() 
	{
		
		int row=1;
		while(row<=5)
		{
		int col=1;
		while(col<=row)
		{
			System.out.print(col + " ");
			col++;
		}
		int star=1;
		while(star<=5)
		{
		System.out.print("* ");
		star++;
		}
		
		System.out.println();
		row++;
		}
		
/*
 output:-
 
		1 * * * * * 
		1 2 * * * * * 
		1 2 3 * * * * * 
		1 2 3 4 * * * * * 
		1 2 3 4 5 * * * * * 

*/		
	}



	public void met() 
	{
		int row=1;
		while(row<=5)
		{
		int col=1;
		while(col<=row)
		{
			System.out.print(col + " ");
			col++;
		}
		System.out.println();
		row++;
		}
	/*	
	 output:-
	 
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 
		
	*/
	}

	
	
	
}
