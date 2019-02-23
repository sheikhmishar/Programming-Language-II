public class Vehicle2010 extends Vehicle{
  Vehicle2010(){
    super();
  }
  void moveUp(){
    ++y;
  }
  void moveDown(){
    --y;
  }
  void moveRight(){
    ++x;
  }
  void moveLeft(){
    --x;
  }
  void moveUpperLeft(){
    --x;
    ++y;
  }
  void moveUpperRight(){
    ++x;
    ++y;
  }
  void moveLowerRight(){
    ++x;
    --y;
  }
  void moveLowerLeft(){
    --x;
    --y;
  }
  
  boolean equals(Vehicle2010 c){
    return (this.x==c.x) && (this.y==c.y);
  }
  
  public String toString(){
    return new String("("+ x + ","+ y + ")");
  }
}