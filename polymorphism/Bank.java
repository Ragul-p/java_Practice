public class Bank
{

public static void main (String[] args)
{

Bank customer = new Bank();
customer.deposit(1000);// argument passing(input)
customer.deposit("raj");
customer.deposit(500.5);
customer.deposit(500.5f);
customer.deposit(true);
}

public void deposit(int box)
{
System.out.println("depositing " + box);
}
public void deposit(String name)
{
System.out.println("depositing " + name);
}
public void deposit(double box)
{
System.out.println("depositing " + box);
}
public void deposit(float box)
{
System.out.println("depositing " + box);
}
public void deposit(boolean box)
{
System.out.println("depositing " + box);
}

}

/*

output:-

depositing 1000
depositing raj
depositing 500.5
depositing 500.5
depositing true


*/
