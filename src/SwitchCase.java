import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Grade: ");
        char grade = sc.next().charAt(0);
        switch(grade) {
            case 'A':
                System.out.println("First class distinction");
                break;
            case 'B':
                System.out.println("First class");
                break;
            case 'C':
                System.out.println("Second class");
                break;
            case 'D':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}