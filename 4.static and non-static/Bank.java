public class Bank
{     
	static int bankBalance = 800000;//variable declaration value assignment(initialization)
	int balance ;//only variabe declaration 
	
	public static void main (String[] args)
	{
		
		
		Bank customer1 = new Bank();
		customer1.balance = 1000;
		Bank customer2 = new Bank();
		customer2.balance = 2000;
		
		System.out.println(Bank.bankBalance);//no create object call Class name to access bankbalance in static variable(not access non-static variable)
		System.out.println(customer1.bankBalance);//object  access static variable
		System.out.println(customer2.bankBalance);//object  access static variable
		System.out.println(customer1.balance);// object access non-static variable
		System.out.println(customer2.balance);//object access non-static variable
		System.out.println(bankBalance);//non-static variable directly call
		
		customer1.deposit(1000);//method calling statement
		customer2.deposit(2000);//method calling statement
	}
	  public void deposit(int deposit)
		{
			System.out.println("depositing " + deposit); 
		}
}

/*

output:-

800000
800000
800000
1000
2000
800000
depositing 1000
depositing 2000


*/

