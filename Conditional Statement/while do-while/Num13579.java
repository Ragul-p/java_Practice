package doWhileWhile;

public class Num13579 
{

	public static void main(String[] args) 
  {
	Num13579 n =new Num13579();
	n.num();
	n.num2();
  }

	private void num2() 
	{
		  int no = 1;
		  do {
			   System.out.print(no +"  ");
			   no=no+2; //1, 1+2=3, 3+2=5, 5+2=7, 7+2=9
		     }while(no<=10);//1<10, 2<10, 3<10, 4<10, 5<10, 6<10, 7<10, 8<10, 9<10, 10<10
	}

	private void num() 
	{   
    int no = 1;
		System.out.println(no);
		no=no+2;//1+2=3
		System.out.println(no);
		no=no+2;//3+2=5
		System.out.println(no);
		no=no+2;//5+2=7
		System.out.println(no);
		no=no+2;//7+2=9
		System.out.println(no);
		no=no+2;
	}

}

/*
  output:-
 1
3
5
7
9
1  3  5  7  9 

*/
