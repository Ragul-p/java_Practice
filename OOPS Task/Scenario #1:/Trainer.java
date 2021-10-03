class Trainer      // -----------------------------------1.Create a Class named “Trainer”.
{

//-------------------------------------------------------2.Have default instance variables String dept, institute
String dept;
String institute;
	
private int salary = 10000;  //--------------------------3.Have private instance variable int salary -------4.Assign 10000 as value for salary.



int getSalary()  //--------------------------------------5.Create getter method for salary.
{
	
this.dept = "Java";
this.institute = "payilagam";                //----------6.Assign values – “Java”, “Payilagam” to them
System.out.println(dept);
System.out.println(institute);
	
System.out.println(this.salary);
return this.salary;
}
	
	
void training()  //-------------------------------------7.Have instance method training() with void as return data type
{
System.out.println("training method() ");	//------------8.Add a print statement inside training() method
}

	
	

public static void main(String[] args)
{	
Trainer trainerKumar = new Trainer("CSE","payilagam");	//---9.Have instance named as ‘trainerKumar’ and pass “CSE”, “payilagam” as arguments to it.	
}
	
	
	
	
public Trainer(String department,String institute)  //------10.Handle above line with matching Constructor.
{
	System.out.println("Trainer constructor ");
}
	
	
	
public Trainer() //-----------------------------------------2.4Handle with proper super class constructor
{
	
}

}
