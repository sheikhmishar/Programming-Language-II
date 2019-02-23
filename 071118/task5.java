package labsubmit;

import java.util.*;

class Vehicle {

    int x, y;

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public String toString() {
        return ("(" + x + ", " + y + ")");
    }
}

class Vehicle2010 extends Vehicle {

    public Vehicle2010() {
        super();
    }

    public void moveLowerLeft() {
        moveDown();
        moveLeft();
    }

    public void moveLowerRight() {
        moveDown();
        moveRight();
    }

    public void moveUpperLeft() {
        moveUp();
        moveLeft();
    }

    public void moveUpperRight() {
        moveUp();
        moveRight();
    }

    public boolean equals(Vehicle2010 compareCar) {
            return (this.x == compareCar.x && this.y == compareCar.y);
    }

}

public class task5 {

    public static void main(String[] args) {
        Vehicle2010 car = new Vehicle2010();
        System.out.println(car);
        car.moveLowerLeft();
        System.out.println(car);

        Vehicle2010 car2 = new Vehicle2010();
        car2.moveLeft();
        System.out.println(car.equals(car2));
        car2.moveDown();
        System.out.println(car.equals(car2));
    }

}
