class Office//class not private ---error: modifier private not allowed here
{
	
//private variable global	
private static int formFee = 10;//static
private int formFeess = 100;// non -satic

//public variable global
public int fee = 500;

	
//private constructor
private Office()
{
System.out.println("private constructor");	
	
}
	
public Office(int no)
{
	System.out.println(" public constructor");
}
	


public static void main (String[] args)
{
	
//private variable local
// private int fee = 100;  //error: illegal start of expression

	
Office of = new Office();
of.giveSalary();
System.out.println("private global variable " + of.formFee);

}

//private method
private void giveSalary()
{
System.out.println("private method");
}

public void giveSalaryMe()
{
System.out.println("private method");
}

//public method
public void doService()
{
System.out.println("doService");
}


}

/*

output:-

private constructor
private method
private global variable 10


*/
