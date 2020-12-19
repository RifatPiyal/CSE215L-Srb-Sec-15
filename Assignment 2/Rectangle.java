
public class Rectangle {
     //instance variables
        private double length;
        private double width;
        
        //constructor
        public Rectangle(double length, double width) {
                super();
                this.length = length;
                this.width = width;
        }
        
        //getters and setters
        public double getLength() {
                return length;
        }
        public double getWidth() {
                return width;
        }
        public void setLength(double length) {
                this.length = length;
        }
        public void setWidth(double width) {
                this.width = width;
        }
        
        //perimter
        public double recPerimeter(Rectangle obj){
                double p = 2*(obj.getLength()+obj.getWidth());
                return p;
        }
        
        //area
        public double recArea(Rectangle obj){
                double a = (obj.getLength()*obj.getWidth());
                return a;
        }
        //any logic can be implemented in this method
        //for sake of simplicity we have used a print statement only
        public void drawRectangle(){
                System.out.println("Drawing rectangle");
        }
}

