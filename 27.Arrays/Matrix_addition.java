package array_26_10_2021;

public class Matrix_addition {

	public static void main(String[] args) 
	{
		
	Matrix_addition m = new Matrix_addition();
	//m.met();
	m.met2();

	}

	public void met2()
	{
	

		int [][] a = {{3,4},
				      {2,1}};
		
		int [][] b = {{1,5},
				      {3,7}};
		
		
		int [][] c =new int[2][2];
		
		for(int row=0;row<c.length;row++)
		{
		      for(int col=0;col<c[0].length;col++)
		      {
		       c[row][col] = a[row][col] +  b[row][col]; 
		       }
		}
// print the output		
		for(int row=0;row<c.length;row++)
		{
		       for(int col=0;col<c[row].length;col++)
		       {
			    System.out.print(c[row][col] +" ");
		       }
		       System.out.println();
		}
		
	}

	public void met() 
	{
		int [][] a = {{3,4},
				      {2,1}};
		
		int [][] b = {{1,5},
				      {3,7}};
		
		
		int [][] c =new int[2][2];
		
		c[0][0] = a[0][0] +  b[0][0]; 
		c[0][1] = a[0][1] +  b[0][1]; 
		
		
		c[1][0] = a[1][0] +  b[1][0]; 
		c[1][1] = a[1][1] +  b[1][1]; 
		
		System.out.print(c[0][0] +" ");
		System.out.print(c[0][1] +" ");
		System.out.println();
		
		
		System.out.print(c[1][0] +" ");
		System.out.print(c[1][1] +" ");
		
	}
	
	

}

/*

output :-

4 9 
5 8 


*/
