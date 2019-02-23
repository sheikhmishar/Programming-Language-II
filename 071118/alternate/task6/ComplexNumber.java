public class ComplexNumber extends RealNumber{
  private double complexValue;
  public ComplexNumber(){
    super();
    complexValue = 0;
  }
  public ComplexNumber(double r, double c){
    super(r);
    complexValue = c;
  }
  
  public void check(){
    System.out.println("I'm in ComplexNumber class");
    super.ping();
    System.out.println("Checking Ended");
  }
}
  