class SQLTrainer extends Trainer   //----------1.Create a sub class “SQLTrainer” under “Trainer”.
{


public static void main (String[] args) //-----2.Have main method in it.
{

SQLTrainer ram = new SQLTrainer(); //----------3.Create instance ram for this class

System.out.println(ram.dept);  //--------------4.Access parent class instance variables
System.out.println(ram.institute);


ram.training();  //----------------------------5.Call parent class instance method training()
ram.getSalary(); //----------------------------6.Access salary using getter method in parent class

}

}


/*

Output:-

null
null
training method() 
Java
payilagam
10000

*/
