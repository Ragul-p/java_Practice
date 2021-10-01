public class Honda extends Bike
{
int oilPrice =100;
public static void main(String[] args)
{
Bike h = new Honda();
h.ride();
System.out.println(h.oilPrice);

}

public void ride()
{
System.out.println("HondaClass ride " +  oilPrice);
}
	
public void acceleration()
{
System.out.println("acceleration");
}

public void milage()
{
System.out.println("milage");
}


}

/*

output:-

HondaClass ride 100
10


*/
