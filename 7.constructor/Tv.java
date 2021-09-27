public class Tv
{

String channelName;
int price;
	
	
	
public Tv(String channelName , int price)//sequence of order constructor (String,int)
{
	this.channelName = channelName;
	this.price=price;
	System.out.println(channelName);
	System.out.println(price);
}	

	
public Tv(int price , String channelName)//sequence of order constructor (int,String)
{
	this.channelName = channelName;
	this.price=price;	
    System.out.println(price);
	System.out.println(channelName);
}
	
	

public static void main(String[] args)
{
Tv channel1 = new Tv("sun tv",30);
Tv channel2 = new Tv(25,"vijay tv");

}



}

/*

output:-

sun tv
30
25
vijay tv

*/
