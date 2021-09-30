public class VasanthAndCo
{

{
System.out.println(" sales rep (non-static block)");
}
	
public VasanthAndCo()
{
System.out.println("non -static constructor");	
}

public static void main(String[] args)
{

VasanthAndCo customer = new VasanthAndCo();//object create to execute non-static block

}


}

/*
output:-

sales rep (non-static block)
non-static constructor 

*/
