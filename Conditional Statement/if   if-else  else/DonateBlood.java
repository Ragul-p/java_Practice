package learnjava;

public class DonateBlood 
{

	public static void main(String[] args) 
	{
	DonateBlood d = new DonateBlood();
	d.num();

	}

	public void num() 
	{
		int age=20;
		double weight=55.5;
		if(age>=18)
		{
			if(weight>=50)
				System.out.println("eligible to donate blood");
			else
			{
				System.out.println("not eligible to donate blood ");
			}
		}
		else
		{
			System.out.println("age must greate than 18");
		}
		
		
	}
}
	

/*

output:-

eligible to donate blood

*/
