abstract class India //--------------------------1.Create an abstract class called ‘India’
{

	
//-----------------------------------------------2.Have below abstract methods  void speakLanguage() ,void eat() ,void dress()
abstract void speakLanguage();

abstract void eat();

abstract void dress();

	
	
static String capital = "New Delhi";  //--------3.Have static variable String capital = “New Delhi”


	
	
	
	
public India(String primeMinister) //------------4.Have below Constructor   public India(String primeMinister) { System.out.println(“our Prime Minister is” + primeMinister); }
{

System.out.println("our Prime Minister is " + primeMinister);

}


public India()
{
}


}
