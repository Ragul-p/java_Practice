package array_26_10_2021;

public class Matrix_Multiplication 
{

	public static void main(String[] args)
	{
		
     Matrix_Multiplication m = new Matrix_Multiplication();
     //m.met();
    m.met2();
	}

	

	public void met2()
	{
	
		

		int [][] a = {{1,2},
				      {3,4}};
		
		int [][] b = {{5,10},
				      {15,20}};
		
//scan the input		
		int [][] c =new int[2][2];
		
		for(int j=0;j<c.length;j++)
		{
		for(int i=0;i<c[0].length;i++)
         {
		c[j][i]=a[j][0]*b[0][i] + a[j][1]*b[1][i];
         }
		}
		
//print the output
		for(int j=0;j<c.length;j++)
		{
		for(int i=0;i<c[0].length;i++)
         {
		System.out.print(c[j][i]+" ");
         }
		System.out.println();
		}
		
		
		
	}



	public void met()
	{
	

		int [][] a = {{1,2},
				      {3,4}};
		
		int [][] b = {{5,10},
				      {15,20}};
		
		
		int [][] c =new int[2][2];
	
		c[0][0]=a[0][0]*b[0][0] + a[0][1]*b[1][0];
		c[0][1]=a[0][0]*b[0][1] + a[0][1]*b[1][1];
		
		c[1][0]=a[1][0]*b[0][0] + a[1][1]*b[1][0];
		c[1][1]=a[1][0]*b[0][1] + a[1][1]*b[1][1];
		
		
//print the output
		
		System.out.print(c[0][0]+" ");
		System.out.print(c[0][1]+" ");
		System.out.println();
		
		System.out.print(c[1][0]+" ");
		System.out.print(c[1][1]+" ");
		
	}
}


/*
 
35 50 
75 110 


*/
