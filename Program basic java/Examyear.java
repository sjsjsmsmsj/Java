import java.util.Scanner;

public class Examyear {
    public static void main(String args[]) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input an integer: ");
        n = scan.nextInt();
        if(n % 400 == 0) {
            System.out.println("This is a leap year");
        }
        else if(n % 4 == 0 && n % 100 != 0) {
            System.out.println("This is a leap year");
        }
        else 
            System.out.println("This is not a leap year");
    }
}
