public class B extends A
{


public static void main(String[] args)
{
A b = new B();
b.m1();
b.m2();


}

public void m1()
{
System.out.println("m1  B ");
}
	
public void m2()
{
System.out.println("m2  B ");
}



}

/*

output:-

m1  B 
m2  B 


*/
