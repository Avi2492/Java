/*
 * A real-world example:
Let's consider the example of vehicles like bicycles, cars, bike........., they have common functionalities. So we make an interface and put all these common functionalities and let the Bicycle, Bike, Car ....etc implement all these functionalities in their own class in their own way.
 */
import java.io.*;

import javax.sound.sampled.SourceDataLine;

interface Vehicle {

    void speedUp(int a);

    void applyBrakes(int a);

    void changeGear(int a);

}

class Bicycle implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int newSpeed) {
        speed = speed + newSpeed;
    }

    @Override
    public void applyBrakes(int brakes) {
        speed = speed - brakes;
    }

    public void printStated() {
        System.out.println("Speed: " + speed + "Gear: " + gear);
    }
}

class Bike implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int newSpeed) {
        speed = speed + newSpeed;
    }

    @Override
    public void applyBrakes(int brakes) {
        speed = speed - brakes;
    }

    public void printStated() {
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}

public class RealWorldDemo {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle: ");
        bicycle.printStated();

        Bike bike = new Bike();
        bike.changeGear(2);
        bike.speedUp(3);
        bike.applyBrakes(1);

        System.out.println("bike: ");
        bike.printStated();
    }
}
