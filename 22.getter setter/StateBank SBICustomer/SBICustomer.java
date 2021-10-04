public class SBICustomer
{
public static void main(String[] args)
{
	
StateBank sbi = new StateBank();
System.out.println(sbi.getBalance());
	
sbi.setBalance(500);
System.out.println(sbi.getBalance());
	
}
}

/*

output:-

1000
1500


*/
