package tamilnadu.chennai; //-------------------------------6.2.in the same package tamilnadu.chennai
class CommonManInChennai implements TrafficRules //---------6.Create class called ‘CommonManInChennai’ -----7.Implement interface ‘TrafficRules’
{



public static void main(String[] args)  //-------------------6.1.with main method
{

CommonManInChennai kavin = new CommonManInChennai();  //-----8. Create instance for this class and access all the methods

System.out.println(kavin.trafficCommisssioner);
kavin.goByDiselVehicle();
kavin.goBicycle();


}



public void goByDiselVehicle()
{
System.out.println("goByDiselVehicle(kavin chennai)");
}
	
	

public void goBicycle()
{
System.out.println("goBicycle(kavin chennai)");
}
	
	


}

/*

output:-

Kavin
goByDiselVehicle(kavin chennai)
goBicycle(kavin chennai)


*/
