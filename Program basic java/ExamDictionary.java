import java.util.Scanner;

public class ExamDictionary {
    public static void main(String args[]) {
        char s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a Dictionary: ");
        s = scan.next().charAt(0);
        switch(s) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' : 
            case 'E' : 
            case 'I' : 
            case 'O' : 
            case 'U' : System.out.println("This is an vowel");
                        break;
            default : System.out.println("This is not vowel");
        }
    }
}
