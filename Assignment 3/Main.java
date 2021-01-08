public class Main {

    public static void main(String args[]) {

        
        
        Employees emp = new Employees("rkumar",12345, 5000.00);

        emp.printStatus();
        
        if(emp.verifyEmail("piyal@gmail.com")){
            System.out.println("Valid email");
        }
        else{
            System.out.println("Invalid email");
        }
        
        DBA DB = new DBA("hasan",3, 500.00,"two");
        DB.printStatus();
        
        BackEndDev dev = new  BackEndDev("karim",3, 500.00,"two", true );
        dev.printStatus();
        
        FrontEndDev Fdev = new FrontEndDev ("rifat",3, 500.00,"two", true, "hasan");
        Fdev.printStatus();
    }
    

}