package nestedLoop;

public class N_1_12_123_1234_12345 
{

	public static void main(String[] args) 
	{
		N_1_12_123_1234_12345 n =new N_1_12_123_1234_12345();
		
		n.num();
	}
	
	
	

	public void num() 
	{
		int row=1;
	    while(row<=5)  //no of rows                          row-------- > 1<=5        2<=5      3<=5     4<=5     5<=5
	    {
	    	  int col=1;
	    	  while(col<=row)  // no of columns                col---------> 1<=1        1<=2      1<=3     1<=4     1<=5
	    	  {
	    		System.out.print(col + " ");
	    		col++;
	    	  }
	    	  System.out.println();
	          row++;
	    }
		
	}
	
	
	

}


/*

output:

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/
