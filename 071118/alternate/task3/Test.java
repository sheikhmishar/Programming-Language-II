import java.util.*;
public class Test{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    Circle c = new Circle(r);
    Sphere s = new Sphere(r);
    System.out.println(c.space());
    System.out.println(s.space());
  }
}