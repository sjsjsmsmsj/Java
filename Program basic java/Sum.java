import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input an integer number 1: ");
        num1 = scan.nextInt();
        System.out.println("Please input an integer number 2: ");
        num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("sum = " + sum);
    }
}