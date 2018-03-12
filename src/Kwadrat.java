public class Kwadrat {
     private int bok;
     private int pole;

    public Kwadrat(int bok) {
        this.bok = bok;
        this.pole = bok*bok;
    }

    public int getBok() {
        return bok;
    }

    public int getPole() {
        return pole;
    }

    public void setBok(int bok) {
        this.bok = bok;
        this.pole = bok*bok;
    }
}
