package pl.learning.welcome;

public class Welcome {
    private String czlowiek = "Dawid";

    public Welcome() {
        czlowiek = czlowiek;
    }

    public void firstName() {
        System.out.println(" Mam na imie: " + czlowiek);
    }

    public void secondName(String x) {
        System.out.println("Na nazwisko: " + x);
    }

    public void wiek(int l) {
        System.out.println("Mam " + l + " lat");
    }

    public int dodawanie(int x, int y) {
        int z = x + y;
        System.out.println("x + y = " + z);
    return z;
    }
    public double sqrt(double x){
        double s = Math.sqrt(x);
        System.out.println("Pierwiastek z x= " + s);
        return s;
    }
}
