import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        /* 1 1 1
           1 1 1
           1 1 1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter Matrix");
        int[][] arr = new int[num][num];
        for(int i = 0; i < num; i++)
        {
            for(int j = 0; j < num; j++)
                arr[i][j] = sc.nextInt();
        }
        int diagonal = 0, row = 0, col = 0;
        for(int i = 0; i < num ; i++) //summing the diagonals
        {
            diagonal = diagonal + arr[i][i];
        }
        int found = 0;
        for(int i = 0; i < num; i++) //summing the rows
        {
            row = 0;
            for(int j = 0; j < num; j++){
                row = row + arr[i][j];
            }
            if(diagonal == row)
            {
                found = 1;
            }
            else
            {
                found = 0;
                break;
            }
        }
        if(found == 1)
        {
            for(int i = 0; i < num; i++)
            {
                col = 0;
                for(int j = 0; j < num; j++){
                    col = col + arr[j][i];
                }
                if(diagonal == col)
                    found = 1;
                else{
                    found = 0;
                    break;
                }
            }
        }
        if(found == 1)
            System.out.println("Magic Square");
        else
            System.out.println("Not a Magic Square");

    }
}