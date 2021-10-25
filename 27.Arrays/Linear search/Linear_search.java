package search_25_10_2021;

public class Linear_search 
{

	public static void main(String[] args) 
	{
		Linear_search l = new Linear_search();
		l.met();
	}

	public void met() 
	{
		
		int[] number= {10,20,30,40,50,60,70,80};
		
		int no=80;
		
		for(int i=0;i<number.length;i++)
		{
			  if(number[i]==no)
		   	{
			 	System.out.println(no+ " Find number" +" index: " +i);
			  }
		
		}
		
		
	}

}


/*

output :-

80 Find number index: 7

*/
