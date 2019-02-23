import java.util.*;
class Point {
    private double radius;
    Point(double r) {
        radius = r;
    }
    double space() {
        System.out.println("Space for a Point  can’t be defined");
        return 0;
    }
    protected double getRadius() {
        return radius;
    }
}
class kutta extends Point {
    String type;
    double radius;
    kutta(String s, double r) {
        super(r);
        radius = r;
        type = s;
        System.out.println("Creating a " + type + " … done!");
        double area=0;
        if(type.equals("Circle")){
            area = Math.PI * radius * radius;
        }
        else if (type.equals("Sphere")){
            area = 4 / 3 * Math.PI * radius * radius * radius;
        }
        System.out.println("The area of the " + type + " is " + area);
    }
}
public class task3{
    public static void main(String[] args) {
        Scanner pagla = new Scanner(System.in);
        System.out.println("Enter radius of Circle: ");
        int a = pagla.nextInt();
        kutta ob = new kutta("Circle", a);
        System.out.println("Enter radius of Sphere: ");
        a = pagla.nextInt();
        kutta ob2 = new kutta("Sphere", a);
    }
}
