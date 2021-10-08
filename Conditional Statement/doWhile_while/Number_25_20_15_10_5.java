package doWhile_While;

public class Number_25_20_15_10_5 {

	public static void main(String[] args) {
		Number_25_20_15_10_5 n = new Number_25_20_15_10_5();
		//n.num();
		  n.num2();
	}

	public void num2() 
	{
	    int no = 25;
	    do {
	        System.out.println(no + "  ");
	        no=no-5; // no=25, no=25-5=20, no=20-5=15, no=15-5=10, n0=10-5=5
	       }while(5<=no); //5<25, 6<25, 7<25, 8<25, 9<25, 10<25,....., 24<25, 25<25. 
		
	}

	public void num()
	  {  
		
		int no = 25;
		System.out.println(no);
		no=no-5;//no=25-5=20
		System.out.println(no);
		no=no-5;//no=20-5=15
		System.out.println(no);
		no=no-5;//no=15-5=10
		System.out.println(no);
		no=no-5;//no=10-5=5
		System.out.println(no);
	
		}

}

/*
 
output:-
 
25
20
15
10
5


*/
