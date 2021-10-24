package array_23_10_2021;

public class Athlete 
{

	public static void main(String[] args) 
	{
		 System.out.println("...Athlete Rank list...");
		 System.out.println();
    
	Athlete a = new Athlete();	
	a.first_Rank();
	a.last_Rank();
    
	}

	public void first_Rank()
	{
		Float low = Float.MAX_VALUE;
		
		String[] players = {"santhiya","manonmani","benson","murali","sathish","dhanraj"};
		         //index--->   0          1      2        3         4         5
		
		     float[] time= {25.2f,    23.6f,   28.4f,    19.2f,   16.5f,   30.3f};
		        //index--->   0          1      2        3         4         5
		
		int index=0;
		for(int i=0;i<time.length;i++)
		{	   
		      if(low>time[i])
		      {               // last loop
		       low=time[i];  // time[4]   -->  16.5f
		       index=i;     //  index=4   -->  sathish
	        }	
	     
		}
	      
		System.out.println("First Rank : " +low);
		System.out.println("Name       : " + players[index]);
		
		System.out.println();
	}
		
	

	public void last_Rank()
	{
		float high = 0.0f;
	
		String[] players = {"santhiya","mano","benson","murali","sathish","dhanraj"};
		         //index--->   0          1      2        3         4         5
    
		     float[] time= {25.2f,    23.6f,   28.4f,    19.2f,   16.5f,   30.3f};
		       //index--->   0          1       2        3         4         5
		     
	  int a=0;
		for(int i=0;i<time.length;i++)
		{	
		      if(high<time[i])
		      {                 // last loop
		       high=time[i];   // time[5]   -->  30.3f
		       a=i;           //  index=5   -->  dhanraj
	        }  
		     
		}
		System.out.println("Last Rank : " +high);
		System.out.println("Name      : " +players[a]);
	}

  
}
