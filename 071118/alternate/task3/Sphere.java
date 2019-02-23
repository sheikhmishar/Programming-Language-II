public class Sphere extends Point {
  Sphere(double r){
    super(r);
  }
  double space ( ) {
    System.out.print("Volume of Sphere ");
    return 4/3*Math.PI*getRadius()*getRadius()*getRadius();
  }
}
