
public class Circle {
     private double radius;

        public Circle(double radius) {
                super();
                this.radius = radius;
        }

        public double getRadius() {
                return radius;
        }

        public void setRadius(double radius) {
                this.radius = radius;
        }
        public double cirCircumference(Circle obj){
                return 2*22/7*obj.getRadius();
        }
        public double cirArea(Circle obj){
                return 22/7*obj.getRadius()*obj.getRadius();
        }
        public void drawCircle(){
                System.out.println("Drawing circle");
        }
}

