import java.util.Scanner;
public class OddEven {
    public static void main(String args[]) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input an integer: ");
        n = scan.nextInt();
        if(n % 2 == 0) {
            System.out.println("This is an number even");
        }
        else {
            System.out.println("This is an number odd");
        }
    }
}
