class TamilNadu extends SouthIndia   //-------------1.Create a class called ‘TamilNadu’ -----1.3.as sub class of ‘South India’
{
static String capital ="chennai";  //---------------3.Have static variable String capital = “Chennai”


	
	
public static void main(String[] args)  //----------1.1.with main method
{


SouthIndia si = new TamilNadu(); //-----------------7.Create instance for “SouthIndia” as below  SouthIndia si = new TamilNadu()

si.speakLanguage();
si.eat();
si.dress();
si.cultivate();
si.cultivate();
si.livingStyle();

System.out.println(India.capital);   //-------------5.Using class name “India” – access variable ‘capital’ and print the value
System.out.println(TamilNadu.capital);//------------6.Using class name “TamilNadu” – access variable ‘capital’ and print the value.

}


//--------------------------------------------------2.Add unimplemented methods
void speakLanguage()
{
System.out.println("speak language tamil"); //------2.1.Provide your own definitions wherever necessary.
}

void eat()
{
System.out.println("eat Rice and Wheat ");
}

void dress()
{
System.out.println("dress wear indian style ");
}



//--------------------------------------------------4.Add below non abstract methods
void cultivate() //---------------------------------4.1.void cultivate()
{
System.out.println("Rice and Sugar can cultivation"); //---4.3.Print ‘Rice and Sugar cane cultivation’ inside this method
}
	
	
	
void livingStyle() //---------------------------------4.4.void livingStyle()
{
System.out.println("Above average development "); //---4.5.Print ‘Above Average development’ inside this method
}

	
	
}


//----------------------8.Observe which methods and variables can be accessed using ‘si’ and note down.


/*

output:-

speak language tamil
eat Rice and Wheat 
dress wear indian style 
Rice and Sugar can cultivation
Rice and Sugar can cultivation
Above average development 
New Delhi
chennai





*/
