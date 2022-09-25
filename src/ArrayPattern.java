import java.util.Scanner;

public class ArrayPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements");
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        int result = checkArray(size, arr);
        System.out.println("The returned value is: " +result);
    }
    public static int checkArray(int num, int[] arr){
        int odd = 0, even = 0;
        for(int i = 0; i < num; i++){
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        if(even > 0 && odd == 0)
            return 1;
        else if ((odd > 0) && (even == 0))
            return 2;
        else
            return 3;

    }
}
