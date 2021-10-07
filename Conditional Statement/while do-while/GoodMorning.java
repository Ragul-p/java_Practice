package doWhileWhile;

public class GoodMorning {

	public static void main(String[] args)
	{
	GoodMorning g = new GoodMorning();
	g.num();
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
		System.out.print("goodMorning   ");
		box = box +1;  // box=0, box=0+1 =1, box=1+1 =2, box=2+1 =3, box=3+1 =4
		}while(box<5); //0<5 ,1<5 ,2<5 ,3<5 ,4<5
		
	}

}
