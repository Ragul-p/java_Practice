package nestedLoop;

public class Star_5_4_3_2_1 
{

	public static void main(String[] args) 
	{
		Star_5_4_3_2_1 s = new Star_5_4_3_2_1();
		s.star();
		//s.star_1_2_3_4_5_();
	}

	public void star_1_2_3_4_5_() 
	{
		int row=1;
	    while(row<=5)  //no of rows                         
	    {
	    	  int col=1;
	    	  while(col<=row)  // no of columns             
	    	  {
	    		System.out.print("* ");
	    		col++;
	    	  }
	    	  System.out.println();
	          row++;
	/*

	 output:
	          * 
	          * * 
	          * * * 
	          * * * * 
	          * * * * * 
     */

	    }
		
	}

	public void star()
	{
		int row=1;
		while(row<=5)
		{
		int col=5;
		while(col>=row)
		{
			System.out.print("* ");
			col--;
		}
		System.out.println();
		row++;
		}
		
		
	}

}


/*

output :

* * * * * 
* * * * 
* * * 
* * 
* 

*/
