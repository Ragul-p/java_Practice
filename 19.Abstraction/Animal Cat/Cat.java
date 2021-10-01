public class Cat extends Animal
{
public void sound()
{
System.out.println(" mwwwwwmmm ");
}

public void sleep()
{
System.out.println(" well sleep  CAT ");
}

	public static void main (String [] args)
	{
		Animal a = new Cat();
		a.sound();
		a.sleep();
	}
}

/*

output:-

 mwwwwwmmm 
 well sleep  CAT 
 
 */
