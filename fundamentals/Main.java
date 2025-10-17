class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double computeArea() {
        return Math.PI * radius * radius;
    }

    double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        double area = circle.computeArea();
        double circumference = circle.computeCircumference();

        // Additional computation in main
        double diameter = 2 * circle.radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        System.out.println("Diameter: " + diameter);
    }
}
