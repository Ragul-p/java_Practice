package Object;

public class Student 
{
     int age=10;
	public static void main(String[] args)
	{
		Student s = new Student();
		s.study();	
		System.out.println(s.age);

	}

	public void study()
	{
		
		System.out.println("study student ");
	}
	

}
/*
output:-
study student 
10
*/
