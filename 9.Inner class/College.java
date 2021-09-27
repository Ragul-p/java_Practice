class College
{

public static void main(String[] args)
{
	
// normal class object
College management = new College();
//management.conductEvent();//error: cannot find symbol

	
//Department management.hod = management.new Department();	
	
	
//inner or nested class object
College.Department hod =new College().new Department();
hod.conductEvent();	
	
}

	
//inner class
class Department
{
//inner class method
public void conductEvent()
{
System.out.println(" conduct event");
}
}


	
}

/*

output:

      conduct event

*/
