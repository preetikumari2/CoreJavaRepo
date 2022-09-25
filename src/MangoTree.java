import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int tree = sc.nextInt();
        if (row * 2 == tree || row * (col - 1) == tree)
            System.out.println("It is a mango tree");
        else
            System.out.println("It is not a mango tree");
    }
}