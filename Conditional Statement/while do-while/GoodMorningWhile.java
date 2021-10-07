package doWhileWhile;

public class GoodMorningWhile {

	public static void main(String[] args) 
	{
			GoodMorningWhile g = new GoodMorningWhile();
			g.num();
	}
			
			void num()
			{
/*
 1.box is zero
 2.while if box is less than 10 
 3.say goodMorning
 4.increment box + 1
 */
				int box =0;
				while(box<5)  //0<5 ,1<5 ,2<5 ,3<5 ,4<5
				{
				System.out.print("goodMorning   ");
				box = box +1;   // // box=0, box=0+1 =1, box=1+1 =2, box=2+1 =3, box=3+1 =4
				}
				
			}
			
}
