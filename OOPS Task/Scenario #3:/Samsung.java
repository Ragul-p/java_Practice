public class Samsung extends FactoryDemo   //--------1.Create class called ‘Samsung’ with main method as sub class of FactoryDemo.
{

public static void main(String[] args) //-------------2.main method
{

Samsung sam = new Samsung(); //----------------------5.Create instance for Samsung class called sam
sam.browse(); //-------------------------------------6.Access browse() method using sam instance.
System.out.println(sam.price);//---------------------7.Access price variable using sam instance.

}

static int price = 5000;   //-------------------------4.Add static variable int price and set value as 5000.

//----------------------------------------------------3.Add unimplemented methods
int call(int seconds)
{
System.out.println(" int seconds ");
return seconds;
}

void sendMessage()
{
System.out.println(" sendMessage ");
}

void receiveCall()
{
System.out.println(" receiveCall ");
}


void verifyFingerPrint()
{
System.out.println(" verifyFingerPrint ");
}

void providePattern()
{
System.out.println("providePattern  ");
}




}

//------------------------9.Observe which method is called and note down.

/*
output:-

Smartphone under development
Factory Demo browsing
5000


*/
