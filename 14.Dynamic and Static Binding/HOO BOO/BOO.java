public class BOO extends HOO
{


int bonus  = 2000;
public static void main(String[] args)
{

HOO  manager =  new BOO();
manager.develop();
manager.test();
manager.pongal();  
}

public void develop()
{
System.out.println("develop website ");
}

public void test()
{
System.out.println("test website ");
}

public void pongal()
{
System.out.println("BOO pongal bonus " + bonus);
}

}

/*

output:-


develop website 
test website
BOO pongal bonus 2000



*/
