import java.util.Scanner;

public class Multip {
    public static void main(String args[]) {
        int n, m;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input an integer number 1: ");
        n = scan.nextInt();
        System.out.println("Please input an integer number 2:");
        m = scan.nextInt();
        int Mul = n * m;
        System.out.println("Result = " + Mul);
    }
}
