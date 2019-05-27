public class Hangar {
    public static void main(String[] args) {

        Car bmw = new Car ("BMW", 13876);

        Boat sailingShip = new Boat("Sailing ship", 6578 );

        System.out.println(bmw.doStuff());

        System.out.println(sailingShip.doStuff());

    }
}