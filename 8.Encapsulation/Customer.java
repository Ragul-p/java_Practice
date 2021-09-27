public class Customer
{
	
public static void main(String[] args)
{
	

Office officer = new Office(1);//to create object in Office class

// only access in public
officer.doService();
officer.giveSalaryMe();
System.out.println(officer.fee);  

}


}

/*

output:-

 public constructor
doService
private method
500

*/
