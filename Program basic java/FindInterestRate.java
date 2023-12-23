import java.util.Scanner;
public class FindInterestRate {
    public static void main(String args[]) {
        int p, r, t;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a principal: ");
        p = scan.nextInt();
        System.out.println("Input a interes rate: ");
        r = scan.nextInt();
        System.out.println("Input a time brow: ");
        t = scan.nextInt();
        System.out.println("Total = " + interesRate(p, r, t) + '$');
    }
    public static int interesRate(int p, int r, int t) {
        int total = (p * r * t) / 100;
        return total;
    }
}
