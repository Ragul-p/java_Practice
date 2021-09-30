public class Child extends Parent
{

int i = 10;
static int j = 20;

String mobile = "i phone";


public static void main(String[] args)
{
//static binding
Child ch = new Child();
ch.watchNews();
ch.takeRest();
ch.work();

//dynamic binding
Parent p =new Child();//parent class object child class memory
p.watchNews();//acces in child
p.takeRest();//access in parent
p.work();//access in child


System.out.println(p.i);//access in parent
System.out.println(p.j);//access in parent

System.out.println(p.mobile);//access in parent
}

public void watchNews()
{
System.out.println(" child class mobile news");
}

public static void work()
{
System.out.println("child class working child");
}

}


/*

output:-

 child class mobile news
parent class rest
child class working child
 child class mobile news
parent class rest
child class working child
100
200
normal phone

*/
