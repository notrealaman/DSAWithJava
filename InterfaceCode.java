interface Shape {
    void area();

    void perimeter();
}

class Rectangle implements Shape {
    int x, y;

    Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void area() {
        System.out.printf("Area : %d\n", x * y);
    }

    public void perimeter() {
        System.out.printf("Perimeter : %d\n", 2 * (x + y));
    }

}

class Circle implements Shape {
    int r;

    Circle(int r) {
        this.r = r;
    }

    public void area() {
        System.out.printf("Area : %f\n", 3.14 * r * r);
    }

    public void perimeter() {
        System.out.printf("Perimeter : %f\n", 2 * 3.14 * r);
    }
}

public class InterfaceCode {
    public static void main(String[] args) {
        System.out.println("Area of Rectangle");
        Rectangle r1 = new Rectangle(30,40);
        r1.area();
        r1.perimeter();

        System.out.println("Area of Circle");
        Circle c1 = new Circle(10);
        c1.area();
        c1.perimeter();
    }
}
