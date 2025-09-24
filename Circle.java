public class Circle {

    double radius;
    String colour;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);
        System.out.println("Circle 1: radius = " + c1.radius + ", colour = " + c1.colour);
        System.out.println("Circle 2: radius = " + c2.radius + ", colour = " + c2.colour);
    }

    // constructor
    public Circle() {
        this.radius = 1.8;
        this.colour = "red";
    }

    // constructor with parameter
    public Circle(double userRadius) {
        this.radius = userRadius;
        this.colour = "red";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

}
