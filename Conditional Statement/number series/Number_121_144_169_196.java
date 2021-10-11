package numbers;

public class Number_121_144_169_196 
{
	 //logic: 121+23=144, 144+25=169, 169+27=196, 196+29=225

	public static void main(String[] args) 
	{
	Number_121_144_169_196 n = new Number_121_144_169_196();
	//n.num();
	n.num2();

	}

	public void num2()
	{
		int no=121, no2=23;
		while(no<=255)
		{
		System.out.println(no);
		no=no+no2;
		no2=no2+2;
		}
		
	}

	public void num()
	{
		int no=121, no2=23;
		System.out.println(no);
		no=no+no2;
		no2=no2+2;
		System.out.println(no);
		no=no+no2;
		no2=no2+2;
		System.out.println(no);
		no=no+no2;
		no2=no2+2;
		System.out.println(no);
		no=no+no2;
		no2=no2+2;
		System.out.println(no);
		
	}

}

/*
 output:-
 
121
144
169
196
225

*/
