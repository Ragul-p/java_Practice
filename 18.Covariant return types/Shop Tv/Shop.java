public class Shop 
{


public static void main(String[] args)
{

Shop sh = new Shop();
Tv s = sh.showTv();
s.delivery();
}


public Tv showTv()//covariant return method
{
System.out.println("shop");
Tv sony = new Tv();	
return sony;
}

	
	

}


/*

output:-

shop
tv delivery


*/
