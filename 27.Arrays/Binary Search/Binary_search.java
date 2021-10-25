package search_25_10_2021;

public class Binary_search
{

	public static void main(String[] args) 
	{
		Binary_search b = new Binary_search();
		b.met();
	}

	public void met() 
	{
		
		int[] number= {10,20,30,40,50,60,70,80,90,100,110};
		int key=100;
		int start=0;
		int end=number.length-1;
		
	
		
		
		while(start<=end)
		{
		int mid =(start+end)/2;
			
		      if(number[mid]==key)
		      {
			     System.out.println("Fount index position " +mid);
			     break;
		      }
		
		
		      else if(number[mid]<key)
		      {
		     	start=mid+1;
	      	}
		
		
	       else 
	       {
		  	 end=mid - 1;
		     }
		
		
	    	if(start>end)
	    	{
			  System.out.println("Nothing found ");
	     	}
		
		
		}
    
	}

}


/*
 
 output :-
 
 Fount index position 9
 
 
 */
