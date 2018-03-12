public class WheelToCombi implements Wheel {
    @Override
    public void spin() {
        System.out.println("I'm spinning faster !!");
    }

    @Override
    public void change() {
        System.out.println("Not done !");
    }
}
