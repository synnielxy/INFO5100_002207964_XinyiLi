abstract class Shape {
    public String name;
    public String color;
    static int instanceCount = 0;
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public abstract double calculateArea();
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public static void printInstanceCount() {
        System.out.println("The total number of instances is: " + instanceCount);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String name, String color, double base, double height) {
        super(name, color);
        System.out.println("Constructing a Triangle");
        this.base = base;
        this.height = height;
        instanceCount++;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getName() {
        return "The name of this Triangle is: " + name;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        System.out.println("Constructing a Rectangle");
        this.width = width;
        this.height = height;
        instanceCount++;
    }

    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return "The name of this Rectangle is: " + name;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        System.out.println("Constructing a Circle");
        this.radius = radius;
        instanceCount++;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "The name of this Circle is: " + name;
    }
}

// Derived class Square
class Square extends Rectangle {
    public Square(String name, String color, double side) {
        super(name, color, side, side);
    }

    @Override
    public String getName() {
        return "The name of this square is: " + name;
    }
}

public class Exercise2 {
    public static void main(String [] args) {
        Triangle t = new Triangle("t", "red", 10.0, 10.0);
        System.out.println(t.getName());

        Shape t2 = new Triangle("t2", "white", 5.0, 5.0);
        System.out.println(t2 instanceof Triangle);
        System.out.println(t2 instanceof Shape);
        System.out.println(t2 instanceof Object);
        System.out.println(t2.getName());

        Shape.printInstanceCount();

        Rectangle r = new Rectangle("r","yellow", 2.0, 3);
        System.out.println(r.getName());
        System.out.println("The color of this rectangle is: " + r.getColor());
        System.out.println("The area of this rectangle is: " + r.calculateArea());

        Circle c = new Circle("c", "white", 4.0);
        System.out.println(c.getName());
        System.out.println("The color of this circle is: " + c.getColor());
        System.out.println("The area of this circle is: " + c.calculateArea());

        Square s = new Square("s", "white", 3.0);
        System.out.println(s.getName());
        System.out.println("The color of this square is: " + s.getColor());
        System.out.println("The area of this square is: " + s.calculateArea());

        Shape.printInstanceCount();
    }
}
