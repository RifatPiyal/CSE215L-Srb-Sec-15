 public class Triangle extends GeometricObject {
  
       /*declaration of three double data fields named
       * side1, side2, and side3 with default values 1.0*/
       double side1 = 1.0;
       double side2 = 1.0;
       double side3 = 1.0;
  
       /*A no-arg constructor that creates a default triangle.*/
       public Triangle() {
          super();
           side1 = 0.0;
           side2 = 0.0;
           side3 = 0.0;
       }
  
        /*A constructor that creates a rectangle with the specified sides.*/
      public Triangle(double a, double b, double c, String color, boolean filled) {
           super(color, filled);
           side1 = a;
           side2 = b;
           side3 = c;
       }
  
      
       public double getSide1() {
           return side1;
       }
  
       
       public void setSide1(double side1) {
           this.side1 = side1;
       }
      
      
       public double getSide2() {
           return side2;
       }
  
      
       public void setSide2(double side2) {
           this.side2 = side2;
       }
  
  
       public double getSide3() {
           return side3;
       }
  
      
       public void setSide3(double side3) {
           this.side3 = side3;
       }
  
       public void show() {
           System.out.println(side1+","+side2+","+side3+",");
       }
  
       /* method to calculate area of triangle */
       public double getArea(){
           double s=(side1+side2+side3)/2;
            double area=s*(s-side1)*(s-side2)*(s-side3);
            return area;
  
       }
  
       /* method to calculate perimeter of triangle */
       public double getPerimeter(){
           return (side1 + side2 + side3);
       }
  
       /*toString method that returns string representing sides of triangle*/
       public String toString(){
          
           return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                   " side3 = " + side3 +" "+
           super.toString();
       }
   }
  