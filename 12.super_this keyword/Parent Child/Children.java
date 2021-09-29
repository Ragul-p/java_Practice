public class Children extends Parent
{


String name;

//default constructor
public Children()
{
System.out.println("child default constructor");
}

//parametrize constructor
public Children(String name)
{
super(name);//to acces super class
this.name = name;
System.out.println(this.name);
System.out.println("children parametrize constructor" );
}



public static void main (String[] args)
{
Children boy = new Children("raj");

}

}


/*

output:-

parent parametrize constructor
raj
children parametrize constructor


*/
