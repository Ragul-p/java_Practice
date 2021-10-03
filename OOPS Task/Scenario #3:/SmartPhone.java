public abstract class SmartPhone   //-------------------------------1.Create an abstract class named ‘SmartPhone’
{

	

//------------------------------------------------------------------2.Add the below abstract methods
	
	
abstract int call(int seconds); //----------------------------------2.1 int call(int seconds)


abstract void sendMessage();  //------------------------------------2.2 void sendMessage()


abstract void receiveCall();  //------------------------------------2.3 void receiveCall()

	
	

void browse()   //--------------------------------------------------3.Add non abstract method void browse()
{

System.out.println("SmartPhone browsing"); //-----------------------3.1 print "SmartPhone browsing" inside browse() method definition
}



public SmartPhone()  //----------------------------------------------4. Have constructor as below.
{
System.out.println("Smartphone under development");
}

}
