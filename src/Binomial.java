import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Binomial {

    public Binomial(){}
    public double factorial(double n)
    {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public double binomialEquationTwo (double n, double k){
        return factorial(n)/(factorial(k)*(factorial(n-k)));
    }

    public double compute (double n, double p, double k){
        return binomialEquationTwo(n,k)*Math.pow(p,k)*Math.pow((1-p),(n-k));
    }

    public double[][] generate (int n, double p, int t){
        double[][] tableau = new double[n+1][2];
        for(int i = 0; i < t; i++){
            tableau[i][0] = i;
            tableau[i][1] = compute(n,p,i);
        }
        return tableau;
    }

    public void writeDataFile(String filename,double[][] data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (double[] row : data) {
                writer.write(row[0] + " " + row[1]);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
