public class School
{
String name;
int rollNo;
	
public School(String name,int rollNo)// parametrized constructor
{
this.name=name;  //this--->current class object
this.rollNo=rollNo;
	System.out.println("name " + name );
	System.out.println("rollNo " + rollNo );
}


	
	

public static void main(String[] args)
{
School student1 = new School("ragul",1);//object create---constructor call automatically
School student2 = new School("raj",2);//object create----constructor call automatically

student1.play();//method calling---not automatic
student1.study();//method calling---not automatic
student2.play();//method calling---not automatic
student2.study();//method calling---not automatic
	
}

	
public void play()//method
{
	System.out.println("name " + name );
	System.out.println("play well");
	
}
	
public void study()//method
{
	System.out.println("name " + name );
	System.out.println("study well");
}

}


/*

output:-

name ragul
rollNo 1
name raj
rollNo 2
name ragul
play well
name ragul
study well
name raj
play well
name raj
study well


*/
