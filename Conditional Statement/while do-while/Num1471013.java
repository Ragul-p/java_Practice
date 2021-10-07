package doWhileWhile;

public class Num1471013
{

	public static void main(String[] args)
  {
		Num1471013 n = new Num1471013();
		n.num();
		n.num2();
	}

	private void num2() 
	{ 
    int no = 1;
	do {
	   System.out.print(no + "   ");
	   no=no+3; // no=1, no=1+3=4, no=4+3=7, no=7+3=10, no=10+3=13, no=13+3=16
	   }while(no<=16); //1<16, 2<16, 3<16, 4<16, 5<16, 6<16, 7<16, 8<16, 9<16, 10<16,11<16, 12<16,13<16, 14<16, 15<16, 16<16
	}

	private void num()
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
		no=no+3;//no=13+3 =16
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
16
1   4   7   10   13   16  

*/
