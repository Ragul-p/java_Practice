package string_2_11_2021;

public class Count_String_3 
{
	

	public static void main(String[] args)
	{
		
		
        String name ="endless learning";
        
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
	
		}
		
// print the array and count
		System.out.println("Print all the value ");
		   for(int i=0;i<name.length();i++)
		   {
			 System.out.println(name.charAt(i) + " count " +no[i] );
		   }
		   System.out.println();
		   System.out.println();
		   
// print only positive array
			System.out.println("Print positive vlaue  ");
		   for(int i=0;i<name.length();i++)
		   {
			   if(no[i]>0)
			   {
			    System.out.println(name.charAt(i) + " count " +no[i] );
			   }
		   }
		   
		   System.out.println();
		   System.out.println();
		   
		   
// print only array count 1
			System.out.println("Print value count == 1");
		   for(int i=0;i<name.length();i++)
		   {
			   if(no[i]==1)
			   {
			    System.out.println(name.charAt(i) + " count " +no[i] );
			   }
		   }
		   System.out.println();
		   System.out.println();
		   
		   
// print  array  not space
			System.out.println("Print all the value  and not space ");
		   for(int i=0;i<name.length();i++)
		   {
			   if(no[i]>0 && name.charAt(i)!=' ')
			   {
			    System.out.println(name.charAt(i) + " count " +no[i] );
			   }
		   }
		   System.out.println();
		   System.out.println();
		   
// print  array  max
			System.out.println("Print maximum number of times ");
		   int index=0;
		   int max=Integer.MIN_VALUE;
		   for(int i=0;i<name.length();i++)
		   {
			   if(no[i]>max)
			   {
				   max=no[i];
				   index=i;
			   }
		   }
		   System.out.println("maximum " + max + " times  index  " + index);
		   System.out.println("letter " +name.charAt(index));
		   
		   

	}
	

}



/*


output:-


Print all the value 
e count -5
n count -5
d count 1
l count -5
e count -5
s count -5
s count 2
  count 1
l count 2
e count 3
a count 1
r count 1
n count -5
i count 1
n count 3
g count 1


Print positive vlaue  
d count 1
s count 2
  count 1
l count 2
e count 3
a count 1
r count 1
i count 1
n count 3
g count 1


Print value count == 1
d count 1
  count 1
a count 1
r count 1
i count 1
g count 1


Print all the value  and not space 
d count 1
s count 2
l count 2
e count 3
a count 1
r count 1
i count 1
n count 3
g count 1


Print maximum number of times 
maximum 3 times  index  9
letter e


*/
