//An Interface is a collection of methods and constants that can be implemented by a class.
//It does not provide the implemenation of the methods.
package main.java.com.jvcode.app;

public class Interface
{

    public static void main( String[] args ){
        getArea();
        getPerimeter();
    }

    public interface Shape {        //An inteface called shape that defines two abstract methods with no implementation.

        double getArea();
        double getPerimeter();
    }
    
    //A class is used to implement an interface
    
    public class Rectangle implements Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;  
        }

        public double getArea() {
            return Area = length * width;
        }
    
        public double getPerimeter(){
            return Perimeter = 2 * (length + width); 
        }
    }
}