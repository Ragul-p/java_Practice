package doWhile_While;

public class Number_1_4_7_10_13 {

	public static void main(String[] args)
	{
		Number_1_4_7_10_13 n = new Number_1_4_7_10_13();
		//n.num();
		  n.num2();

	}

	public void num2() 
	{ 
		int no = 1;
	    do {
	        System.out.println(no + "   ");
	        no=no+3; // no=1, no=1+3=4, no=4+3=7, no=7+3=10, no=10+3=13
	       }while(no<=13); //1<13, 2<13, 3<13, 4<13, 5<13, 6<13, 7<13, 8<13, 9<13, 10<13, 11<13, 12<13, 13<13
		
	}

	public void num()
	 { 
		
		int no = 1;
		System.out.println(no);
		no=no+3;//no=1+3 =4
		System.out.println(no);
		no=no+3;//no=4+3 =7
		System.out.println(no);
		no=no+3;//no=7+3 =10
		System.out.println(no);
		no=no+3;//no=10+3 =13
		System.out.println(no);
			
	 }

}

/*
output:-

1
4
7
10
13


*/