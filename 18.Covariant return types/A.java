class A  
{
    A fun()  //covariant return type
    { 
        A base = new A();
        
        System.out.println("Base fun()");
        return base;
    }



  public static void main(String args[])
    {
       A base = new A();
       
          base.fun();
     }
} 


/*

output:-

Base fun()


*/
