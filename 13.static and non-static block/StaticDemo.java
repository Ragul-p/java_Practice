public class StaticDemo
{

static//static block not class to extcute automatically call
{
System.out.println("static block first ");
}

static//static block not class to extcute automatically call
{
System.out.println("static block second ");
}

public static void main(String[] args)
{
System.out.println("main static method");
}


}

/*
output:-

static block first 
static block second 
main static method


*/
