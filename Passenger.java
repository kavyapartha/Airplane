package Airplanes;

public class Passenger extends Fighter {
    /**
     * variable num:10
     */
    int num = 10;
    /**
     * Overriding the display method from Fighter class
     */
    @Override
    void display() {
        System.out.println("override method in child");
    }
}
