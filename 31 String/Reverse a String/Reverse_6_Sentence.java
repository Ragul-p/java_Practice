package string_29_10_2021;

public class Reverse_6_Sentence
{

	public static void main(String[] args) 
	{
		Reverse_6_Sentence s = new Reverse_6_Sentence();
		String name = "murali bose";
		
		String result = s.reverseStentence(name);
		System.out.println(result);
	}

	public String reverseStentence(String name)
	{
		
		String s1=" ";
		String s2=" ";		
		for(int i=0;i<name.length();i++)
		{
		if(name.charAt(i)==' ')
		{
		    s1=reverseWord(name,0,i-1);
		    
		}
		    s2=reverseWord(name,i+1,name.length()-1);
		}
		return s1+s2;
		
	}

	public String reverseWord(String name, int i, int j) 
	{
		
		char[] a =name.toCharArray();  
			
		while(i<j)
		{
		char temp = a[i];
		a[i]=a[j];     
		a[j]=temp;       
		i++;
		j--;
		}
		String s = new String(a);
		return s;  
		
	}

}


/*

output:-

ilarum bosemurali bose

*/
