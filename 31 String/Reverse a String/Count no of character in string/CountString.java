package string_2_11_2021;

public class CountString
{
	
	public static void main(String[] args)
	{
		
		String name ="ragul ragul";
		
		
		for(int j=0;j<name.length();j++)
		{
			
		int count=0;
		char ch=name.charAt(j);
		
		   for(int i=0;i<name.length();i++)
		   {
			     if(ch==name.charAt(i))
			     {
			      count++;
			     }
		   }
		   System.out.println(name.charAt(j) + "  count "+ count +" times");
		}
	
    
    
	}

}

/*

output:-

r  count 2 times
a  count 2 times
g  count 2 times
u  count 2 times
l  count 2 times
   count 1 times
r  count 2 times
a  count 2 times
g  count 2 times
u  count 2 times
l  count 2 times

*/
