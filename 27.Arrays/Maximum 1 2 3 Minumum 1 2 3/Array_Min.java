package interviewPreparation;

public class ArrayMax_Min 
{

	public static void main(String[] args)
	{
		
		int n[] = {9,8,7,6,5,4,3,2,1,0};
		int max = Integer.MIN_VALUE;   // max=-2147483648
	  int second=0,third=0;
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>max)
			{
			third=second;
		  second=max;
			max=n[i];	
			}
			
			else if(n[i]>second) 
			{
				second=n[i];
			}
			
			else if(n[i]>third) 
			{
				third=n[i];
			}
					
		}
		System.out.println("Maximum     : " + max);
		System.out.println("second  Max : " +second);
		System.out.println("Third Max   : "+third);
		
		
		
		
		int min=Integer.MAX_VALUE;  //min=2147483647
		int sec=0,thi=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]<min)
			{
			thi=sec;
			sec=min;
			min=n[i];
			}
			
			else if(n[i]<sec) 
			{
				sec=n[i];
			}
			
			else if(n[i]<thi) 
			{
				third=n[i];
			}
			
		}
		System.out.println("Minimum     : "+min);
		System.out.println("second Min  : "+sec);
		System.out.println("Third  Min  : "+thi);
	}

}
