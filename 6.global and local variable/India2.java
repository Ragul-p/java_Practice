public class India2
{
static String capital = "new delhi ";
String citizenName; // only global variable - default value assign
int age;
float height;
boolean nri;
String fatherName;

public static void main (String[] args)
{
India2 citizen = new India2();

citizen.citizenName = "ragul";//value assign
System.out.println(citizen.citizenName);
System.out.println(capital);

/*
int a; local variable must be initialize
System.out.println(a);//error: variable a might not have been initialized
*/
	
System.out.println(citizen.citizenName);//value not assign
System.out.println(citizen.age);//value not assign
System.out.println(citizen.height);//value not assign
System.out.println(citizen.nri);//value not assign
System.out.println(citizen.fatherName);//value not assign



}



}


/*

output:-

ragul
new delhi 
ragul
0
0.0
false
null

*/
