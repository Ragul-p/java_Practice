package doWhile_While;

public class GoodMorning 
{
	public static void main(String[] args)
	{
	  GoodMorning g = new GoodMorning();
	  //g.num();
	    g.num2();
	}
	
	void num()
	{
/*
 1.box is zero
 2.say goodMorning
 3.increment box + 1
 4.until it box is less than 5, go to step 2
 */
		int box = 0;
		do{
		   System.out.println("goodMorning   ");
		   box = box +1;  // box=0, box=0+1 =1, box=1+1 =2, box=2+1 =3, box=3+1 =4
		  }
		  while(box<5); //0<5 ,1<5 ,2<5 ,3<5 ,4<5
	
	}
	
	void num2()
	  {
/*
1.box is zero
2.while if box is less than 5 
3.say goodMorning
4.increment box + 1
*/
		int box =0;
	    while(box<5)  //0<5 ,1<5 ,2<5 ,3<5 ,4<5
		 {
		  System.out.println("goodMorning   ");
		  box = box +1;  // box=0, box=0+1 =1, box=1+1 =2, box=2+1 =3, box=3+1 =4
		}		
	}
}

/*
output:-

goodMorning   
goodMorning   
goodMorning   
goodMorning   
goodMorning   

*/

