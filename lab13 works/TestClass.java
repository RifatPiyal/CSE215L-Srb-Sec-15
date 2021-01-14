
public class TestClass implements CompareAreaInterface {
     public static void main(String[] args) {
      
Triangle obj1=new Triangle(5,5,8); //object of triangle class
Rectangle obj2=new Rectangle(5,8); //object of rectangle class
obj1.setArea(); //through setArea function it calculate area
obj2.setArea();
System.out.println("Area of triangle: "+ obj1.getArea());
System.out.println("Area of Rectangle: " + obj2.getArea());
TestClass obj=new TestClass();
boolean res= obj.compareArea(obj1, obj2); //call compareTo function
if(res)
{
   System.out.println("area of rectangle and triangle are equal");
}
else
{
   System.out.println("area of rectangle and triangle are not equal");
}

   }

}
    

