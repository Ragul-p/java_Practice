package nestedLoop;

public class RowAndColProgram 
{

	public static void main(String[] args) 
	{
		RowAndColProgram r = new RowAndColProgram();
		//r.num_1_2_3_4_5_();
		//r.num_0_1_2_3_4_5_6_();
		r.num_3_4_5_6_7_8_();

	}

	
	
	
	public void num_3_4_5_6_7_8_() 
	{
		

		int row=1;
	    while(row<=3)  //no of rows
	    {
	    	  int col=3;
	    	  while(col<=8)  // no of columns
	    	  {
	    		System.out.print(col + " ");
	    		col++;
	    	  }
	    	  System.out.println();
	          row++;
	    }
		
	/*   
output :
 
	    3 4 5 6 7 8 
	    3 4 5 6 7 8 
	    3 4 5 6 7 8 
    */
	}




	public void num_0_1_2_3_4_5_6_()
	{
		
		int row=1;
	    while(row<=3)  //no of rows
	    {
	    	  int col=0;
	    	  while(col<=6)  // no of columns
	    	  {
	    		System.out.print(col + " ");
	    		col++;
	    	  }
	    	  System.out.println();
	          row++;
	    }
	    
	    /*
	    output :
	    
	   	   0 1 2 3 4 5 6 
	   	   0 1 2 3 4 5 6 
	   	   0 1 2 3 4 5 6 
	   	    
	   */
		
	}




	public void num_1_2_3_4_5_() 
	{
			
		int row=1;
	    while(row<=3)  //no of rows
	    {
	    	  int col=1;
	    	  while(col<=6)  // no of columns
	    	  {
	    		System.out.print(col + " ");
	    		col++;
	    	  }
	    	  System.out.println();
	          row++;
	    }
	    
/*
 output :
 
	    1 2 3 4 5 6 
	    1 2 3 4 5 6 
	    1 2 3 4 5 6 
	    
*/
	}
	
	
	
}
