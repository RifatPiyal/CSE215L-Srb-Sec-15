public class Rectangle extends GeometricObject{ //Derived Class
   private double side1; //Data members
   private double side2;
   Rectangle(int l,int w){ //constructor
       side1=l;
       side2=w;
   }

   public void setArea() { //method to calculate area of rectangle
      
       double a= side1*side2;
       super.setArea(a);
   }

}