package Object;

public class Engineer extends Graduate
{

	public static void main(String[] args) 
	{
	/*	
	 // -->UpCasting-->WidenCasting-->Generalization
	   
		Engineer s = new Engineer();
		s.doProject();	
		s.study();
		s.searchJob();
		Student s1 = (Student) s; // student object  
		                          // child object change parent object	
		        s1-->parent referance   	                         
		s1.study();
		
		*/

		
/*		
	//-->downCasting-->Narrow Casting  
		
		Student s1 = new Engineer();  //Dynamic Binding
		s1.study();
		System.out.println(s1.age);  //age-->Student class referance
		
		//parent change into grant child
		
		Engineer en = (Engineer)s1;  //change into Engineer class referance
		en.study();
		System.out.println(en.age);
		en.doProject();
		
*/
		
/*		
		Student s1 = new Student();  
		s1.study();
		System.out.println(s1.age);  
		
		Engineer en = (Engineer)s1;  
		en.study();
		System.out.println(en.age);
		en.doProject();
		
		error:   Exception in thread "main" java.lang.ClassCastException:
		
*/
	}
	
	public void study()
	{
		
		System.out.println(" Study referance book Engineer ");
	}

	public void doProject()
	{
		
		System.out.println("doProject");
	}

}
