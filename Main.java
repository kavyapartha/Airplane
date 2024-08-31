package Airplanes;

public class Main {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        System.out.println("final keyword : "+fighter.name);;
        Fighter fighter1 = new Fighter(5);
        Passenger passenger = new Passenger();
        Fighter fighter3 = new Passenger();
        System.out.println(((Passenger)fighter3).num);
        fighter.display();
        fighter.display(5);
        System.out.println(Fighter.a);
        System.out.println(Fighter.b);
        System.out.println(fighter3.name);
        fighter3.display();
        passenger.display();
    }
}
