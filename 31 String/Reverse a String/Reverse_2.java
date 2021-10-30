package string_29_10_2021;

public class Reverse_2 
{

	public static void main(String[] args)
	{
		String name = "murali";
		char[] a =name.toCharArray();   //   {'m','u','r','a','l','i'};
		
		
		int i=0;
		int j=name.length()-1;
		
		
		while(i<j)
		{
		char temp = a[i];
		a[i]=a[j];     
		a[j]=temp;       
		i++;
		j--;
		}
		
		
		for(i=0;i<name.length();i++)
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
