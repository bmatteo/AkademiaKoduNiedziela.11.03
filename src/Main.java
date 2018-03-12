import p1.Test1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String patternURL = "(http://{1}[a-z]+\\.{1}[a-z]{2,3})([\\.a-z]{2,3})??";

        String imie = "http://akademiakodu.com.pl";

        if(imie.matches(patternURL)) {
            System.out.println("Jest OK !!");
        } else {
            System.out.println("Nie jest OK !!");
        }












    //Kwadrat k = new Kwadrat(5);

    //System.out.println(k.getBok() + " : " + k.getPole());

    //k.setBok(6);

    //System.out.println(k.getBok() + " : " + k.getPole());












        //ArrayList<Wheel> wList = new ArrayList<>();

        //Wheel w = new WheelToCabrio();
        //w.change();
        //w.spin();
        //System.out.println("---------------------------------");
        //Wheel w2 = new WheelToCombi();
        //w2.spin();
        //w2.change();
    }
}
