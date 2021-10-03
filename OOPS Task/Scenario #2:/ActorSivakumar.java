class ActorSivakumar implements Actor  //------------------1. Create class named as ActorSivakumar  ---2.implement interface ‘Actor’ to this class.
{


static String address = "Coimbatore";  //------------------4.Have static variable String address. -----5.Assign value to address as “Coimbatore”.
	
	
public ActorSivakumar()  //--------------------------------12.Handle with proper Constructor
{
System.out.println("Default constructor");
}
	
	
	
public ActorSivakumar(int no , String car)  //--------------8.Handle with proper Constructor
{
System.out.println("car no" + no);
System.out.println("car Brand" + car);
}
	
	
	
public static void main(String[] args)  //-------------------1.2.with main method
{

ActorSivakumar as = new ActorSivakumar(65,"Audi Car"); //----7.Create instance for ActorSivakumar as below ActorSivakumar as = new ActorSivakumar(65, “Audi Car”)

//-----------------------------------------------------------9.Access all the methods from ActorSivakumar class	
as.speaking();
as.act();
as.dance();
as.sing();
System.out.println(as.address + "\n");  //-------------------10.Access variable address and print the value


	
	
Actor ac = new ActorSivakumar();  //-------------------------11.Create another instance of interface ‘Actor’ using dynamic binding approach Actor ac = new Sivakumar();
//ac.speaking();
	
//-----------------------------------------------------------13.Access methods in ActorSivakumar class.
ac.act();
ac.dance();
ac.sing();
System.out.println(ac.address);  //---------------------------14.Access variable address using ‘ac’ intance and print the value


}

	
//------------------------------------------------------------6.Have instance method ‘speaking()’ with void return data type.
public void speaking()
{
System.out.println("speaking(ActorSivakumar)");
}

	
//------------------------------------------------------------3.Give your own definitions for methods from interface
	
public void act()
{
System.out.println("act(ActorSivakumar)");
}

public void dance()
{
System.out.println("dance(ActorSivakumar)");
}

public void sing()
{
System.out.println("sing(ActorSivakumar)");
}


}

//--------------------------------------15. Observe and note down the difference between two instances

/*


output:-

car no65
car BrandAudi Car
speaking(ActorSivakumar)
act(ActorSivakumar)
dance(ActorSivakumar)
sing(ActorSivakumar)
Coimbatore

Default constructor
act(ActorSivakumar)
dance(ActorSivakumar)
sing(ActorSivakumar)
 Chennai



*/
