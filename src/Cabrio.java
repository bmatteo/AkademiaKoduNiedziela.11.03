public class Cabrio extends Car {
    boolean autoRoof;

    public void closeRoof() {
        System.out.println("Is closed !");
    }

    public void openRoof() {
        System.out.println("Is open !");
    }

    @Override
    public void drive() {
        System.out.println("I'm going faster!!");
    }
}
