package string_29_10_2021;

public class Reverse_4 
{

	public static void main(String[] args) 
	{
		Reverse_4 n = new Reverse_4();
		
		
		
		char[] rev1=n.reverseWord("murali");
		
		//print char[] rev1
		for(int i=0;i<rev1.length;i++)
		{
		System.out.println(rev1[i]);
		}
		
		
		
		char[] rev2=n.reverseWord("bose");
	
		//print char[] rev2
		for(int i=0;i<rev2.length;i++)
		{
		System.out.println(rev2[i]);
		}
	

	
	}

	public char[] reverseWord(String name) 
	{
		
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
		
		return a;   //return char[] Array
		
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
e
s
o
b

*/
