
public class Triangle {
    //instance variables
        private double base;
        private double height;
        //constructor
        public Triangle(double base, double height) {
                super();
                this.base = base;
                this.height = height;
        }
        
        //getters and setters
        public double getBase() {
                return base;
        }
        public double getHeight() {
                return height;
        }
        public void setBase(double base) {
                this.base = base;
        }
        public void setHeight(double height) {
                this.height = height;
        }
        
        //perimeter
        public double triPerimeter(Triangle obj){
                double p = obj.getBase()+obj.getHeight()+ Math.sqrt(obj.getBase()*obj.getBase()+obj.getHeight()*obj.getHeight());
                return p;
        }
        //area
        public double triArea(Triangle obj){
                double area = obj.getHeight()*obj.getBase()/2;
                return area;
        }

        //draw
        public void drawTriangle(){
                System.out.println("Drawing triangle");
        }
}

