public class BO extends HO
{

int price;
int discount;
int offer = 2000;

public BO(int price ,int discount)
{
super(price,discount);
this.price  = price;
this.discount = discount;

System.out.println("actual price " + (this.price - this.discount));
}


public static void main(String[] args)
{
BO tv = new BO(1000,500);
tv.purchase();
}

public void purchase()
{
System.out.println("Bo class " + this.offer);
System.out.println("Ho class " + super.offer);
}


} 

/* 
output:-

HO 1000
HO 500
actual price 500
Bo class 2000
Ho class 1000

*/
