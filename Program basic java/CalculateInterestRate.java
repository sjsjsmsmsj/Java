import java.util.Scanner;

public class CalculateInterestRate {
    public static void Calculate(int p, double r, int t, int n) {
        double total = p * Math.pow(1 + r / n, n * t)  - p;
        System.out.println("Total money from last to now = " + total);
    }
    public static void main(String args[]) {
        Calculate(2000, 0.08, 5, 12);
    }
}
