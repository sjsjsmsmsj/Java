import java.util.Scanner;
public class IntegerPartAndRemainder {
    public static void main(String args[]) {
        int n, m;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input an integer: ");
        n = scan.nextInt();
        System.out.println("Please input an integer: ");
        m = scan.nextInt();
        int p = n % m;
        int k = n / m;
        System.out.println("Integer Part = " + k);
        System.out.println("Integer Remainder = " + p);
    }
}