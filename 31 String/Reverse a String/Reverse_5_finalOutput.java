package string_29_10_2021;

public class Reverse_5_finalOutput {


	public static void main(String[] args) 
	{
		Reverse_4 n = new Reverse_4();
		
		char[] reverse1=n.reverseWord("murali");
		String s1=new String(reverse1); // convert char[] reverse1 into String
		//System.out.println(s1);    //output: ilarum
	
		
		
		char[] reverse2=n.reverseWord("bose");
		String s2=new String(reverse2);   // convert char[] reverse2 into String
		//System.out.println(s2);      //output: esob
	

		String reverseAll =s1+s2;       //concordinate String s1 + s2
		//System.out.println(revAll);//output: ilarumesob
		
		
		char[] finalOutput=n.reverseWord(reverseAll); 
		String finalOut = new String(finalOutput); // convert char[] finalOutput into String
		System.out.println("Reverse Word : "+finalOut);
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

Reverse Word : bosemurali


*/
