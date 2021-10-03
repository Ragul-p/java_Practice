public abstract class FactoryDemo extends SmartPhone  // -----------1.Create class called ‘FactoryDemo’ as abstract subclass of SmartPhone
{

	
//------------------------------------------------------------------2.Add the below abstract methods

	
	
abstract void verifyFingerPrint(); //-------------------------------2.1.void verifyFingerPrint()

	
abstract void providePattern(); //----------------------------------2.2.void providePattern()

	
	
void browse()   //--------------------------------------------------3.Add non abstract method void browse()
{
System.out.println("Factory Demo browsing");//----------------------4. print ‘Factory Demo browsing’ inside browse() method definition
}

	
	
boolean isOriginalPiece = false;//---------------------------------5.Add variable boolean isOriginalPiece and assign ‘false’ as value.

	
static int price = 0; //-------------------------------------------6. Add static variable int price and set value as 0.

}
