abstract class Bank{    
    abstract void  InterestRate();    
}    




class Citi extends Bank{    
    void  InterestRate()
	{
		System.out.println("citi ");
	}    
}





class HSBC extends Bank{    
    void InterestRate()
	{
		System.out.println("HSBC ");
	}    
}    



     
class Main{    
    public static void main(String args[]){    
          
       Bank b = new Citi ();      
        b.InterestRate(); 
		
       Bank n = new HSBC ();     
        n.InterestRate();    
    }
}    


/*

output:-

citi 
HSBC

*/
