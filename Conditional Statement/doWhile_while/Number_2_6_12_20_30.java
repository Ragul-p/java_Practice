package doWhile_While;

public class Number_2_6_12_20_30 {


	public static void main(String[] args)
	{
		Number_2_6_12_20_30 n =new Number_2_6_12_20_30();
		//n.num();
		  n.num2();
   
	}
	public void num2()
	{
		int no=2;
	    int no2=4;
	    do {
		    System.out.println(no + "  ");
		    no=no+no2;//no=2, no=2+4 =6, no=6+6 =12, no=12+8 =20, no=20+10 =30
		    no2=no2+2;//no2=4, no2=4+2 =6, no2=6+2 =8, no2=8+2 =10, no2=10+2 =12
	       }while(no<=30); //2<30, 3<30, 4<30, 5<30,....., 30<30 
		
	}
	
	public void num() 
	  {  
		
		int no=2;
	    int no2=4;
		System.out.println(no);
		no=no+no2; //no=2+4 =6
		no2=no2+2; //no2=4+2 =6
		System.out.println(no);
		no=no+no2; //no=6+6 =12
		no2=no2+2; //no2=6+2 =8
		System.out.println(no);
		no=no+no2; //no=12+8 =20
		no2=no2+2; //no2=8+2 =10
		System.out.println(no);
		no=no+no2; //no=20+10 =30
		no2=no2+2; //no2=10+2 =12
		System.out.println(no);
		
	 }

}

/*
 
 output:-
 
2
6
12
20
30
 

*/