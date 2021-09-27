public class Bank// 1.class
{
	public static void main(String[] args)
	{
	
		int money= 1000; // state or field
		Bank cashier = new Bank();//2.object
		cashier.deposit();
	}
	
	public void deposit()  // behavior or (3.method)
	{
		System.out.println("depositing");
	}
	
}

/*

output:-
   depositing

*/
