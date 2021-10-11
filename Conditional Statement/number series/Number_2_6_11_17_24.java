package numbers;

public class Number_2_6_11_17_24 
{
	//logic:  2,   2+4=6,  6+5=11,  11+6=17,  17+7=24

	public static void main(String[] args) 
	{
		Number_2_6_11_17_24 n =new Number_2_6_11_17_24();
		//n.num();
		  n.num2();
	}

	public void num2()
	{
		int c=3;
		int no=2;
		while(no<=24)
			{
		System.out.println(no); // no=2,  6,  11,   17,   24   
		c=c+1;  //c=3+1 =4, c=4+1 =5, c=5+1 =6, c=6+1 =7, c=7+1 =8
	//(or)c++;
		no=no+c;//no=2+4 =6, no=6+5 =11, no=11+6 =17, no=17+7 =24
			}
		
		
	}

	public void num()
	{
		int c=3;
		int no=2;
		
		System.out.println(no); // no=2
		c=c+1; //------------------c=3+1 =4
		no=no+c; //----------------no=2+4 =6
		System.out.println(no); // no=6
		c=c+1; //------------------c=4+1 =5
		no=no+c; //----------------no=6+5 =11
		System.out.println(no); // no=11
		c=c+1; //------------------c=5+1 =6
		no=no+c; //----------------no=11+6 =17
		System.out.println(no); // no=17
		c=c+1; //------------------c=6+1 =7
		no=no+c; //----------------no=17+7 =24
		System.out.println(no); // no=24
		c=c+1; //------------------c=7+1 =8
		no=no+c; //----------------no=24+8=32
		
	}

}

/*
output:-

2
6
11
17
24


*/

