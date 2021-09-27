public class India
{

static String capital = "new delhi";//--->class specific----->global variable
String citizenName;//-------------------->object specific---->global variable

public static void main(String[] args)
{

India citizen = new India();
citizen.citizenName="ragul";
System.out.println(citizen.citizenName);
System.out.println(citizen.capital);


}


}

/*

output:-

ragul
new delhi


*/
