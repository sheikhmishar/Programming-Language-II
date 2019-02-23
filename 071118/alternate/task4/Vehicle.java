public class Vehicle{
  private int x,y;
  Vehicle(){
    x = 0;
    y = 0;
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
  public String toString(){
    return new String("("+ x + ","+ y + ")");
  }
}