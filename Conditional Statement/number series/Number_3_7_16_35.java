package numbers;

public class Number_3_7_16_35 
{ 
	//logic:   (3+3)+1=7, (7+7)+2=16, (16+16)+3=35, (35+35)+4=74
	//2logic:  (3*2)+1=7, (7*2)+2=16, (16*2)+3=35,  (35*2)+4=74

	public static void main(String[] args) 
	{
		Number_3_7_16_35 n = new Number_3_7_16_35();
	  //n.num();
		n.num2();

	}

	public void num2() 
	{

		int no=3,no2=1;
		while(no<=74)
		{
		System.out.println(no); // no=3 ,no=7,        no=16,            no=35,            no=74
		no=(no+no)+no2; //    no=(3+3)+1 =7, no=(7+7)+2 =16, no=(16+16)+3 =35, no=(35+35)+4 =74
	   //(or)no=(no*2)+no2;
		no2=no2+1; //no2=1+1 =2, no2=2+1 =3, no2=3+1 =4, no2=4+1 =5
		}
	
		
	}

	public void num()
	{
		
		int no=3,no2=1;
		
		System.out.println(no); //-----no=3
		no=(no+no)+no2; //-------------no=(3+3)+1 =7
		no2=no2+1; //------------------no2=1+1 =2
		System.out.println(no); //-----no=7
		no=(no+no)+no2; //-------------no=(7+7)+2 =16
		no2=no2+1; //------------------no2=2+1 =3
		System.out.println(no); //-----no=16
		no=(no+no)+no2; //-------------no=(16+16)+3 =35
		no2=no2+1; //------------------no2=3+1 =4
		System.out.println(no); //-----no=35
		no=(no+no)+no2; //-------------no=(35+35)+4 =74
		no2=no2+1; //------------------no2=4+1 =5
		System.out.println(no); //-----no=74
		
	}

}

/*
 output:-
 
3
7
16
35
74


*/
