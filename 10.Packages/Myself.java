package tamilnadu.chennai;
import tamilnadu.nativeplace.Relatives;

public class Myself extends Relatives
{

public static void main(String[] args)
{
//Relatives object
Relatives rel = new Relatives();
rel.doGardening();
rel.receivePeople();


//extends keyword used Myself object
Myself ms = new Myself();
ms.doGardening();
ms.receivePeople();

}

}



/*

output:-

Gardening
Receive
Gardening
Receive


*/
