import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Exercise3 {
    public static void main(String [] args) {
        // Serialize
        Triangle t = new Triangle("t", "red", 10.0, 10.0);
        Rectangle r = new Rectangle("r","yellow", 2.0, 3);
        Circle c = new Circle("c", "white", 4.0);
        Square s = new Square("s", "white", 3.0);

        try {
            FileOutputStream fileOut = new FileOutputStream("shapes.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(t);
            out.writeObject(r);
            out.writeObject(c);
            out.writeObject(s);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/shapes.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialize
        Triangle t2 = null;
        Rectangle r2 = null;
        Circle c2 = null;
        Square s2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("shapes.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            t2 = (Triangle) in.readObject();
            r2 = (Rectangle) in.readObject();
            c2 = (Circle) in.readObject();
            s2 = (Square) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException cc) {
            System.out.println("Shape class not found");
            cc.printStackTrace();
            return;
        }

        System.out.println("Deserialized Shapes...");
        System.out.println("Name: " + t2.getName());
        System.out.println("Name: " + r2.getName());
        System.out.println("Name: " + c2.getName());
        System.out.println("Name: " + s2.getName());
    }
}
abstract class Shape implements java.io.Serializable{
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