
public class Main_Class {
    public interface Demo {
        /* interface allows only public final static variables
         * hence it is important to initialize the variables at the time of declaration
         * public final static is implicitly added to the variables we need not write it explicitly
         */
        User objUser=new User();
        Rectangle rec = new Rectangle(20,10);
        Triangle tri = new Triangle(12,6);
        Circle cir = new Circle(7);
    public static void main(String args[]){
        System.out.println("=====================USER CLASS=====================");
        objUser.setName("Jack");
        objUser.setId(101);
        objUser.setEmail("jack@gmil.com");
        System.out.println(objUser.getName());
        System.out.println(objUser.getId());
        System.out.println(objUser.getEmail());
        System.out.println(objUser.verifyEmail("jack@gmil.com"));
        
        System.out.println("======================RECTANGLE CLASS=====================");
        System.out.println("Perimeter: "+rec.recPerimeter(rec));
        System.out.println("Area: "+rec.recArea(rec));
        rec.drawRectangle();
        System.out.println("======================TRIANGLE CLASS=====================");
        System.out.println("Perimeter: "+tri.triPerimeter(tri));
        System.out.println("Area: "+tri.triArea(tri));
        tri.drawTriangle();
        System.out.println("======================CIRCLE CLASS=====================");
        System.out.println("Circumference: "+cir.cirCircumference(cir));
        System.out.println("Area: "+cir.cirArea(cir));
        cir.drawCircle();
        
}
    }
}

