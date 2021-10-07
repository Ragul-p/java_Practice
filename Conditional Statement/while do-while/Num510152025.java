package doWhileWhile;

public class Num510152025
{

	public static void main(String[] args) 
  {
		Num510152025 n = new Num510152025();
		n.num();
		n.num2();
	}

	private void num2() 
	{
    int no = 5;
	do {
	   System.out.print(no + "  ");
	   no=no+5; // no=5, no=5+5=10, no=10+5=15, no=15+5=20, no=20+5=25, no=25+5=30
	   }while(no<=30); //5<30, 6<30, 7<30, 8<30, 9<30, 10<30,....., 29<30, 30<30. 
	}

	private void num()
	{   
    int no = 5;
		System.out.println(no);
		no=no+5;//no=5+5 =10
		System.out.println(no);
		no=no+5;//no=10+5 =15
		System.out.println(no);
		no=no+5;//no=15+5 =20
		System.out.println(no);
		no=no+5;//no=20+5 =25
		System.out.println(no);
		no=no+5;//no=25+5 =30
		System.out.println(no);
		
	}

}

/*
output:-

5
10
15
20
25
30
5  10  15  20  25  30  

*/
