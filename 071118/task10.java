package labsubmit;

import java.util.*;
class Car{
    private static int carCount = 0;
    private int year;
    public Car(int N) {
        year = N;
        carCount++;
    }
    
    public static int getObjectCount(){
        return carCount;
    }
    public int getYear(){
        return year;
    }
}
public class task10 {

    public static void printCarDetail(Car c) {
        System.out.println("Year: " + c.getYear());
        System.out.println("Total Number of Cars: " + c.getObjectCount());
    }

    public static void main(String[] args) {
        System.out.println("Total Number of Cars: " + Car.getObjectCount());
        System.out.println("==============================");
        Car c1 = new Car(2000);
        printCarDetail(c1);
        Car c2 = new Car(2006);
        printCarDetail(c2);
        Car c3 = new Car(2002);
        printCarDetail(c3);
        System.out.println("==============================");
        System.out.println("Total Number of Cars: " + Car.getObjectCount());
    }

}
