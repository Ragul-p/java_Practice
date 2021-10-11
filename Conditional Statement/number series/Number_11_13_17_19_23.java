package numbers;

public class Number_11_13_17_19_23 {

	public static void main(String[] args)
	{
		//logic:  11    11+2  13+4  17+2  19+4  23+2
		//        11    13    17    19     23   25
		
		Number_11_13_17_19_23 n = new Number_11_13_17_19_23();
		n.num2();
	   // n.num();
		//n.num3();
	}

	public void num3()
	{
		 int i=11;
	        while (i<=23) 
	        {
	            System.out.print(i+" ");
	            i=i+2;
	            
	            if (i>23) 
	            {
	                break;
	            }
	            
	            System.out.print(i+" ");
	            i=i+4;
	        }
		
	}

	public void num() 
	{
		int no = 11;
		int no2 = 2;
		
	System.out.println(no);
	no=no+no2;
	System.out.println(no);
    no=no+no2+2;
	System.out.println(no);
	no=no+no2;
	System.out.println(no);
	no=no+no2+2;
	System.out.println(no);
		
	}

	public void num2()
	{
		 int no=11;
	        while (no<=23) {
	            System.out.print(no+" ");
	            no=no+2;
	            System.out.print(no+" ");
	            no=no+4;
	        }
		
	}

}

/*
 output:-
 
 11 13 17 19 23 25 
 
 */
