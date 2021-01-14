public class Triangle extends GeometricObject { //Derived Class
   private double side1; //data members
   private double side2;
   private double side3;
  
   Triangle(double s1,double s2, double s3) //Constructor
   {
       side1=s1;
       side2=s2;
       side3=s3;
   }

   public void setArea() { //function to calculate area
      
       double p=(side1+side2+side3)/2; //first it find parameter
       double a=p-side1;
       double b=p-side2;
       double c=p-side3;
       double res=a*b*c;
       double area1=Math.sqrt(p*res);
       super.setArea(area1); //Now it calls super class method setarea
      
   }
  
}