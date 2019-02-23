public class Car{
  private static int objectCount = 0;
  private int year;
  
  Car(int y){
    ++objectCount;
    year = y;
  }
  
  public static int getObjectCount(){
    return objectCount;
  }
  
  public int getYear(){
    return year;
  }
}