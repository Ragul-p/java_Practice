public class MainMethod
{

public static void main(String[] args)
{

//upcasting(wider casting)--->small datatypes to high
int no = 5;
System.out.println("int(5) to float " + (float)no);
	
float no1 = 10.0f;
System.out.println("float(10.0) to int " + (int)no1);
	
byte no2 = 15;
System.out.println("byte(15) to int " + (int)no2);

	
	
//downcasting(narow casting)--->high to low
long no3 = 25l;
System.out.println("long(25) to int " + (int)no3);
	
double no4 = 35;
System.out.println("double(35) to float " + (float)no3);


/*
boolean result =true;
System.out.println((float)result);
error: incompatible types
*/
	
char value = 'a';
System.out.println("char(a) to int " + (int)value);
System.out.println("char(a) to float " + (float)value);

}
	
/*

output:-

int(5) to float 5.0
float(10.0) to int 10
byte(15) to int 15
long(25) to int 25
double(35) to float 25.0
char(a) to int 97
char(a) to float 97.0


*/


}
