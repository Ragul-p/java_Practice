package string_29_10_2021;

public class Reverse_1
{

	public static void main(String[] args)
	{
		String name = "murali";
		
		char[] a = {'m','u','r','a','l','i'};
		// index     0   1   2   3   4   5
		
		char temp = a[0];//  m
		a[0]=a[5];       //  i
		a[5]=temp;       //  m
		
		temp = a[1];     //  u
		a[1]=a[4];       //  l
		a[4]=temp;       //  u
	
		temp = a[2];    //   r
		a[2]=a[3];      //   a
		a[3]=temp;      //   r
		

		for(int i=0;i<name.length();i++)
		{
		System.out.println(a[i]);
		}
		
	}

}

/*

output:-

i
l
a
r
u
m

*/
