
public class Main_Class {

       public static void main(String[] args) {
           //create an object of Triangle class
           Triangle my = new Triangle(1,1,1,"yellow", true);
          
           System.out.println("Area of Triangle " +my.getArea());
         
           System.out.println("Perimeter of triangle " +my.getPerimeter());
        
           System.out.println("color of the Triangle is " +my.getColor());
       
           System.out.println("is triangle filled " +my.getFilled());
       }
   }
  