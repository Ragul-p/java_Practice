public class StaticClass
{
	
public static void main(String[] args)
{
System.out.println("static method");

StaticClass m = new StaticClass();
m.main(1);
m.main(1,2);
m.main(1,2,3);
}	


public static void main(int a)
{
System.out.println("one");
}


public static void main(int a, int b)
{
System.out.println("two");
}


public static void main(int a,int b,int c)
{
System.out.println("three");
}




}


	
/*

public static int main(String[] args)
{
System.out.println("static method");
return 20;
}

Error: Main method must return a value of type void in class StaticClass
define the main method as:
   public static void main(String[] args)

*/



/*

output:-

static method
one
two
three


*/
