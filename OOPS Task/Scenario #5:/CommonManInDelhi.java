package india.newDelhi;  //-----------------------------------------------16.3.in the same package india.newDelhi
import tamilnadu.chennai.TrafficRules;

class CommonManInDelhi implements trafficRulesDelhi,TrafficRules  //------16.Create class called ‘CommonManInDelhi’ ---17.Implement interface ‘TrafficRulesDelhi’ 
{                                                                 //------19.Now, implement interface ‘TrafficRulesChennai’ also.

public static void main(String[] args)  //--------------------------------16.2.with main method
{

CommonManInDelhi navin = new CommonManInDelhi(); //-----------------------18.Create instance for this class and access all the methods
	

System.out.println(navin.trafficCommisssionerr);
navin.dontGoByDiselVehicle();
navin.goByBicycle();
navin.goByDiselVehicle();
navin.goBicycle();

}

//-------------------------------------------------------------------------19.Add unimplemented methods
public void goByDiselVehicle()
{
System.out.println("goByDiselVehicle(navin delhi)");
}

	
public void dontGoByDiselVehicle()
{
System.out.println("dontGoByDiselVehicle(navin delhi)");
}

	
public void goByBicycle()
{
System.out.println("goByBicycle(navin delhi)");
}

	
public void goBicycle()
{
System.out.println("goBicycle(navin delhi)");
}


}

//------------------------------------------------------------------------------20.Access all the methods and observe the difference.

/*

output:-

Navin 
dontGoByDiselVehicle(navin delhi)
goByBicycle(navin delhi)
goByDiselVehicle(navin delhi)
goBicycle(navin delhi)


*/
