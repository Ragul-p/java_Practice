package nestedloop_20_10_2021;

public class N_12345_1234_123_12_1 
{

	public static void main(String[] args)
	{
		N_12345_1234_123_12_1 n =new N_12345_1234_123_12_1();
		//n.met();
		//n.met2();
		//n.met3();
		//n.met4();
		//n.met5();
		//n.met6();
		//n.met7();
		//n.met8();
		n.met9();
		
	}

	
	
	
	public void met9() 
	{

		int row=5;
		while(row>=1)
		{
			
		int col=1;
		while(col<row)
		{
			System.out.print(" ");  
			col++;
		}
		
		int star=1;
		
		while(star<=6-row)  
		{
		System.out.print(star + " " ); 
		star++;
		}
		
		row--;
		System.out.println();
		}
/*	
(col + " ")--->replace--->(star)

	     1
	    12
	   123
	  1234
	 12345



 (col + " ")--->replace--->(star + " ")
 
	     1 
	    1 2 
	   1 2 3 
	  1 2 3 4 
	 1 2 3 4 5 

*/
}




	public void met8()
	{

		int row=5;
		while(row>=1)
		{
			
		int col=1;
		while(col<row)
		{
			System.out.print(" ");  // (" " + " " ) --->replace---> (" " )
			col++;
		}
		
		int star=1;
		
		while(star<=6-row)  
		{
		System.out.print(col + " "); //(col)--->replace--->(col + " ")
		star++;
		}
		
		row--;
		System.out.println();
		}
	
/*
output :-

	     5 
	    4 4 
	   3 3 3 
	  2 2 2 2 
	 1 1 1 1 1 

*/
	}




	public void met7()
	{
	

		int row=5;
		while(row>=1)
		{
			
		int col=1;
		while(col<row)
		{
			System.out.print(" ");  // (" " + " " ) --->replace---> (" " )
			col++;
		}
		
		int star=1;
		
		while(star<=6-row)  
		{
		System.out.print(col ); //("* ")--->replace--->(col)
		star++;
		}
		
		row--;
		System.out.println();
		}
/*
 
	Output:
	     5
	    44
	   333
	  2222
	 11111

*/
	}




	public void met6() 
	{
		

		int row=5;
		while(row>=1)
		{
			
		int col=1;
		while(col<row)
		{
			System.out.print(" ");  // (" " + " " ) --->replace---> (" " )
			col++;
		}
		
		int star=1;
		
		while(star<=6-row)  
		{
		System.out.print("* ");
		star++;
		}
		
		row--;
		System.out.println();
		}
		
/*
 output:-
 
	     * 
	    * * 
	   * * * 
	  * * * * 
	 * * * * * 
	
*/
	}




	public void met5() 
	{
		int row=5;
		while(row>=1)
		{
			
		int col=1;
		while(col<row)
		{
			System.out.print(" " + " ");  // (col + " " ) --->replace---> (" " + " " )
			col++;
		}
		
		int star=1;
		
		while(star<=6-row)  
		{
		System.out.print("* ");
		star++;
		}
		
		row--;
		System.out.println();
		}
/*
 	
output:-

        * 
      * * 
    * * * 
  * * * * 
* * * * * 

*/
		
	}




	public void met4() 
	{
		
		/*
		 
		 row     star    row+star=6       star=6-row
		 5        1       5+1=6
		 4        2       4+2=6
		 3        3       3+3=6
		 2        4       2+4=6
		 1        5       1+5=6
 		       
		 */
	
		      //  int i=1;
				int row=5;
				while(row>=1)
				{
					
				int col=1;
				while(col<row)
				{
					System.out.print(col + " ");
					col++;
				}
				
				int star=1;
				
				while(star<=6-row)  // or  while(star<=i)
				{
				System.out.print("* ");
				star++;
				}
				//i=i+1;
				
				row--;
				System.out.println();
				}
	
/*
 output:-
				1 2 3 4 * 
				1 2 3 * * 
				1 2 * * * 
				1 * * * * 
				* * * * * 

*/
	}




	public void met3() 
	{
		
				int row=5;
				while(row>=1)
				{
					
				int col=1;
				while(col<row)   // or while(col<=row-1)
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
				
				row--;
				System.out.println();
				}
		
			/*	
			  output:-
			  
				1 2 3 4 * * * * * 
				1 2 3 * * * * * 
				1 2 * * * * * 
				1 * * * * * 
				* * * * * 
            */
	}




	public void met2()
	{
		// row
		int row=5;
		while(row>=1)
		{
		// column	
		int col=1;
		while(col<=row)
		{
			System.out.print(col + " ");
			col++;
		}
		// print star
		int star=1;
		while(star<=5)
		{
		System.out.print("* ");
		star++;
		}
		
		row--;
		System.out.println();
		}
/*
 output:-
 
1 2 3 4 5 * * * * * 
1 2 3 4 * * * * * 
1 2 3 * * * * * 
1 2 * * * * * 
1 * * * * * 
 */
		
	}




	public void met()
	{
		int row=5;
		while(row>=1)
		{
		int col=1;
		while(col<=row)
		{
			System.out.print(col + " ");
			col++;
		}
		row--;
		System.out.println();
		}
	}
/*
output:-

	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 
*/	  
	
}
