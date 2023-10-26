import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Binomial bi = new Binomial();
        double p = 0.1;
        int t = 11;
        for(int i = 1; i < t; i++){
            System.out.println(i);
            if(i != 10) {
                double[][] courbe = bi.generate(10, p, t);
                bi.writeDataFile("courbe" + i + ".txt", courbe);
                p = p + 0.1;
            }
        }
    }
}
