package string_29_10_2021;

public class Reverse_3_palindromeOrNot 
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
		
		String name2 = new String(a); // char array convert into String
		
		System.out.println(name2);  //print the String
		
		
		if(name.equals(name2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}

}


/*

output:-

ilarum
Not Palindrome

*/
