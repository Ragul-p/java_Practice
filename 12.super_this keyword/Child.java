public class Child
{

public Child()
{
//this(100);
System.out.println("welcome to our shop");
}
	
public Child(int price)
{
this();// current class cunstructor explicit call
System.out.println("price " + price);	 
}

public static void main(String[] args)
{

//Child ch =new Child();
Child ch1 =new Child(100);
Child ch2 =new Child();
}


}

/*

output:-

welcome to our shop
price 100
welcome to our shop


*/
