class Kathir implements Employee
{


static int leaves = 12;
public static void main(String[] args)
{


Kathir k = new Kathir();
System.out.println(k.leaves);
System.out.println(Kathir.leaves);
//Employee.leaves=20;   error: cannot assign a value to final variable leaves
k.doSomething();
k.applyLeave();

}

public void doSomething()
{
System.out.println("do something Kathir ");
}

public void applyLeave()
{
System.out.println("applay leave Kathir ");
}


}



/*  
output:-

12
12
do something Kathir 
applay leave Kathir 


*/
