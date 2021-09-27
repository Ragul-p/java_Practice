public class Calculator
{

public static void main(String[] args)
{

Calculator calcObj = new Calculator();
calcObj.add();// to call void add method
calcObj.add(10,10);// to call int add method

	
	
int outcome =calcObj.add(55,5);// to call int add method
System.out.println(" outcome " + outcome);

	
int outcome2 = calcObj.multiplay(outcome);// to call int multiplay method
System.out.println(" multiplay " + outcome2 );
}

	
public void add() 
{
int no1 =10;
int no2 =20;
System.out.println("add method");
System.out.println(no1 + no2);
System.out.println("Result is " + (no1 + no2));
}

	
	
public int add(int no1 ,int no2)
{       no1 =1;// to override value --->add(5 ,55)
        no2 = 2;  // to override value --->add(5 ,55)
		return no1+ no2;	
}
	
	
public int multiplay(int no1 )
{	
return no1 * no1;	
}



}

/*

output:-

add method
30
Result is 30
 outcome 3
 multiplay 9

*/
