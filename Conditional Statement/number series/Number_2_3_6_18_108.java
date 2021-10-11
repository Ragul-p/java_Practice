package numbers;

public class Number_2_3_6_18_108
{
	// Logic: 2   3   2*3  3*6    6*18  
	//        2   3    6    18     108

	public static void main(String[] args)
	{
		Number_2_3_6_18_108 n = new Number_2_3_6_18_108();
		//n.num();
		//n.num2();
		n.num3();
	

	}

	public void num3()
	{
		int i=2,j=3;
	    int n;
	    System.out.print(i+" "); //----- i=2
	    System.out.print(j+" ");  //---- j=3
	        
	   while(j<108)     
	   {
		n=i*j; // n=2*3=6, n=3*6=18, n=6*18=108  
		i=j; // i=3, i=6, i=18
		j=n; // j=6, j=18, j=108
		
		if(i==108) {break;}
        System.out.print(n+" "); // n=6, n=18, n=108
	   }
		
		
	}

	public void num2() 
	{
		
		int i=2,j=3;
	    int n;
	    System.out.print(i+" "); //--------- =2
	    System.out.print(j+" "); //--------- =3
	        
	        
		n=i*j; //--------------------------- n=2*3 =6
        System.out.print(n+" "); //--------- = 6
        
        i=j; //----------------------------- i=3
        j=n; //----------------------------- j=6
        n=i*j; //--------------------------- n=3*6 =18
        
        System.out.print(n+" "); //--------- =18
       
        i=j; //----------------------------- i=6
        j=n; //----------------------------- j=18
        n=i*j;  //-------------------------- =n6*18 =108
        System.out.print(n+" "); // -------- = 108
		
	}

	public void num()
	{
		
	int no =2;
		
		System.out.println(no);
		System.out.println(no+1);
		System.out.println(no*(no+1));
		System.out.println((no+1)*(no*(no+1)));
		System.out.println((no*(no+1))*(no+1)*(no*(no+1)));
		
	}

}

/*
output:-

2 3 6 18 108 

*/
