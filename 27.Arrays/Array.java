package array_22_10_2021;

public class Array 
{

	public static void main(String[] args) 
	{
	Array a = new Array();
	a.met();
	//a.met2();
	}
	
	
	public void met2()
	{
		
		int[] total = {100,200,300,400,500};
		// length  of total
		System.out.println(total.length);
		//loop
		for(int i=0;i<total.length;i++)
		{	
		System.out.println(total[i]);
		}
		System.out.println();
		
    
    
		
		char[] name = {'r','a','g','u','l'};
		System.out.println(name.length);
		for(int i=0;i<name.length;i++)
		{	
		System.out.println(name[i]);
		}
		System.out.println();
		
    
    
		boolean[] result = {true,true,true};
		System.out.println(result.length);
		for(int i=0;i<result.length;i++)
		{	
		System.out.println(result[i]);
		}
		System.out.println();
		
    
    
		String[] fullName = {"ragul"};    
		System.out.println(fullName.length);
		for(int i=0;i<fullName.length;i++)
		{	
		System.out.println(fullName[i]);
		}
/*

output :-
		
		5
		100
		200
		300
		400
		500

		5
		r
		a
		g
		u
		l

		3
		true
		true
		true

		1
		ragul
*/
	}


	void met()
	{
		
		int[] total = {100,200,300,400,500};
		System.out.println(total[0]);
		System.out.println(total[1]);
		System.out.println(total[2]);
		System.out.println(total[3]);
		System.out.println(total[4]);
		
	}
/*
output :-
	
	100
	200
	300
	400
	500	
*/	

}
