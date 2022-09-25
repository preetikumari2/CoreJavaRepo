import java.util.Scanner;

public class CustomExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 nad 10:");

        try {
            int num = sc.nextInt();

            if(num < 1 || num > 10) {
                throw new InvalidNumberException();
            }
        }
        catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("hey there, Try again!");
        }

    }

}

class InvalidNumberException extends Exception {

    public InvalidNumberException() throws InvalidNumberException{
        super("Invalid number. It should be between 1 and 10");
    }

    public InvalidNumberException(String message) {
        super(message);
    }

}
