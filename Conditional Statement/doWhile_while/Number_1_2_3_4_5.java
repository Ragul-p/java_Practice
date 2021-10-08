package doWhile_While;

public class Number_1_2_3_4_5
{
	
	public static void main(String[] args)
	  {
           Number_1_2_3_4_5 n = new Number_1_2_3_4_5();
          //n.num();
            n.num2();
          }

	private void num2() 
	    {
		   
		    int no = 1;
		    do{
	               System.out.println(no+ "  ");
		       no=no+1;      // no=1, no=1+1=2, no=2+1=3, no=3+1=4, no=4+1=5
		      }while(no<=5); //1<5 ,2<5   ,3<5   ,4<5   ,5<=5
	    }

	public void num() 
	{    
		
		int no = 1;
		System.out.println(no+ "");
		no=no+1;//no=2
		System.out.println(no+ "");
		no=no+1;//no=3
		System.out.println(no+ "");
		no=no+1;//no=4
		System.out.println(no+ "");
		no=no+1;//no=5
		System.out.println(no+ "");
		
	}

}
/*
 
output:-

1
2
3
4
5
 

*/
