package Airplanes;

public class Fighter {
    static int a, b;
    final String name = "Airplanes";

    static {
        a = 5;
        b = 9;
    }

    /**
     * Zero parameterized constructor
     */
    Fighter() {
        System.out.println("inside parent class constructor");
    }

    /**
     *
     * @param age=5;
     */
    Fighter(int age) {
        System.out.println("inside parent class constructor with parameters + " + age);
    }

    /**
     * method overloading
     */
    void display() {
        System.out.println("first method in parent ");
    }

    /**
     *
     * @param num=5;
     */
    void display(int num) {
        System.out.println("overloaded method in parent : " + num);
    }
}
