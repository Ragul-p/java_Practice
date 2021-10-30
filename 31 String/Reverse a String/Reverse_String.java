package string_29_10_2021;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
		String name = "ragul";  
		int i=0;
		int j=name.length()-1;
		char[] a = name.toCharArray();
		while(i<j)
		{
			char temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
      
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
      
		}
	}

}

/*

output:-

l
a
g
u
r

*/
