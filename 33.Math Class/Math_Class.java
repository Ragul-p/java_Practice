package mathClass_1_11_2021;

public class Math_Class
{

	public static void main(String[] args) 
	{
		
		//smallest and largest value
		int a=10;
		int b=200;
		System.out.println("Maximum  : " + Math.max(a, b));
		System.out.println("Minium   : " + Math.min(a, b));
		
		
		//absolute value
		System.out.println("Absolute : " + Math.abs(a));
		
			
		//round off value
		float c = 10.2f;
		float d = 10.5f;
		System.out.println("round off : "+ Math.round(c));
		System.out.println("round off : "+ Math.round(d));
	
			
		//square root
		int square=9;
		System.out.println("Square Root: "+ Math.sqrt(square));
		
		
		//cube root
		int cube=27;
		System.out.println("Cube Root : "+ Math.cbrt(cube));
		
		
		//find the largest integer value
		double positive =  50.9;
		double negative = -50.9;
		System.out.println("ceil : " + Math.floor(positive));
		System.out.println("ceil : " + Math.floor(negative));
		
		
		// value of the first argument and  the power second argument 
		int power = 2;
		System.out.println("Power : " + Math.pow(power, power));
		
		
		//find the smallest integer 
		double power1 = 2.3;
		System.out.println("floor : " + Math.ceil(power1));
		

	}

}


/*
 
output:-
 
Maximum  : 200
Minium   : 10
Absolute : 10
round off : 10
round off : 11
Square Root: 3.0
Cube Root : 3.0
ceil : 50.0
ceil : -51.0
Power : 4.0
floor : 3.0

*/
