package nestedLoop;

public class N_12345_1234_123_12_1 
{

	public static void main(String[] args) 
	{
		N_12345_1234_123_12_1 n = new N_12345_1234_123_12_1();
		//n.num();
		n.num2();
		
	}

	
	
	public void num2() 
	{
		
		int row=5;
		while(row>=1)
		{
		int col=1;
		while(col<=row)
		{
			System.out.print(col +" ");
			col++;
		}
		System.out.println();  
		row--;
		}
/*
 output:
		
		1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1 
		
*/
	}

	
	
	
	public void num()
	{
		int no=1;
		while(no<=5)
		{
			System.out.print(no +" ");
			no++;
		}
		System.out.println();       //----------- 12345
		
	    no=1;
		while(no<=4)
		{
			System.out.print(no +" ");
			no++;
		}
		System.out.println();       //------------1234
		
		
		no=1;
		while(no<=3)
		{
			System.out.print(no +" ");
			no++;
		}
		System.out.println(); //------------------123
		
		
		
		no=1;
		while(no<=2)
		{
			System.out.print(no +" ");
			no++;
		}
		System.out.println(); //------------------12
		
		
		no=1;
		while(no<=1)
		{
			System.out.print(no +" ");
			no++;
		}                     //-------------------1
   }

	
	
}
