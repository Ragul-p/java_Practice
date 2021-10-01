public class Bus
{

public static void main(String[] args)
{
//Anonymous object
new Bus().getTicket();
new Bus().getChange();

//static binding object	
Bus conductor = new Bus();
conductor.getTicket();
conductor.getChange();
}


public void getTicket()
{
System.out.println("get ticket");
}

public void getChange()
{
System.out.println("get Change");
}

	
}


/*

output:-

get ticket
get Change
get ticket
get Change

*/
