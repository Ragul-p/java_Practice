public class BO extends HO
{

public static void main(String[] args)
{
HO manager = new BO();
manager.sell();
manager.audit();
//manager.lunch();
}

public void lunch()
{
System.out.println("BO lunch");

}

/*
public void sell()
{
System.out.println("BO sell");
}
*/
}

/*

output:-

HO sell
HO audit


*/
