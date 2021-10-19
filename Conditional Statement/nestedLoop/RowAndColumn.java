package nestedLoop;

public class RowAndColumn
{
/*
 
   column--->   1   2   3   4   5
   
   row
    |
    1           1   2   3    4   5
    2           1   2   3    4   5
    3           1   2   3    4   5
    
    
    
 */
	public static void main(String[] args)
	{
		RowAndColumn rc=new RowAndColumn();
		//rc.num();
		rc.num2();
		

	}

	public void num2()
	{
		 int row=1;
		    while(row<=5)  //-------------------outer loop represent---> no of rows
		    {
		    	  int col=1;
		    	  while(col<=5)  //----------------inner loop represent---> no of columns
		    	  {
		    		System.out.print(col + " ");
		    		col++;
		    	  }
		    	  System.out.println();
		          row++;
		    }
		    
		/*		
		    output :
		    
		   	    1 2 3 4 5 
		   	    1 2 3 4 5 
		   	    1 2 3 4 5 
		   	    1 2 3 4 5 
		   	    1 2 3 4 5 
		*/
		   
	}

	
	
	
	
	
	public void num() 
	{
	    int count=1;
	    while(count<=5)  //-------------------outer loop represent---> no of rows
	    {
	    	  int no=1;
	    	  while(no<=5)  //----------------inner loop represent---> no of columns
	    	  {
	    		System.out.print(no + " ");
	    		no++;
	    	  }
	    	  System.out.println();
	          count++;
	    }
/*		
 output :
 
	    1 2 3 4 5 
	    1 2 3 4 5 
	    1 2 3 4 5 
	    1 2 3 4 5 
	    1 2 3 4 5 
*/
	}

	
	
	
}
