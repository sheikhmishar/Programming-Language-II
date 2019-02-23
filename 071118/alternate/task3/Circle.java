public class Circle extends Point {
  Circle(double r){
    super(r);
  }
  double space ( ) {
    System.out.print("Area of Circle ");
    return 2*Math.PI*getRadius()*getRadius();
  }
}
