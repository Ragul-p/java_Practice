package string_2_11_2021;

public class CountString_2 
{

	public static void main(String[] args)
	{
		
		
        String name ="ragu ragul";
        
        char[] letters = new char [name.length()]; //create char[]
        int[] no = new int[name.length()]; // create no[]
		
		
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
		   
		letters[j]=name.charAt(j);  //to store ch[]  at string value
		no[j]=count; // to store  no[]  at count value
		
		
		
		for(int i=j+1;i<name.length();i++)
		{
			if (name.charAt(j)==name.charAt(i))   // char at same repitation 
			{
				no[j]=-5;   // to store value -5
			}
		}
	
		   System.out.println(name.charAt(j)+" count " +no[j] );
		   
		   
		}

	}

}



/*

output:-

r count -5
a count -5
g count -5
u count -5
  count 1
r count 2
a count 2
g count 2
u count 2
l count 1


*/
