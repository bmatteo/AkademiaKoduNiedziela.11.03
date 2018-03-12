public class WheelToCabrio implements Wheel {
    @Override
    public void spin() {
        System.out.println("I'm spinning");
    }

    @Override
    public void change() {
        System.out.println("Done !");
    }
}
