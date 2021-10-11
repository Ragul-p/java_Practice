package numbers;

public class Number_1_3_4_8_15_27
{
	//logic: 1,  3,  4,   1+3+4=8,   3+4+8=15,  4+8+15=27 

	public static void main(String[] args)
	{
		Number_1_3_4_8_15_27 n = new Number_1_3_4_8_15_27();
		n.num();
		//n.num2();
	}

	public void num2() 
	{
		int no, i=1, j=3, k=4;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		no=i+j+k; //=1+3+4 =8 
		i=j; // i=3
		j=k; // j=4
		k=no; //k=8
		System.out.println(no); //no=8
		
		no=i+j+k; //=3+4+8 =15
		i=j; //i=4
		j=k; //j=8
		k=no; //k=15
		System.out.println(no); //no=15
		
		no=i+j+k; //=4+8+15=27
		i=j; //i=8 
		j=k; //j=15
		k=no; //k=27
		System.out.println(no); //no=27
		
	}

	public void num() 
	{
		int no, i=1, j=3, k=4;
		
		System.out.println(i); 
		System.out.println(j);
		System.out.println(k);
		
		while(i<=27)
		{
		no=i+j+k; // no=1+3+4 =8,  no=3+4+8 =15, no=4+8+15=27
		i=j; // i=3, 4, 8
		j=k; // j=4, 8, 15
		k=no; //k=8, 15, 27
		System.out.println(no);
		if(no == 27) {break;}
		}
		
	}

}

/*
 
 output:-
 
1
3
4
8
15
27

*/
