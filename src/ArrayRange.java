import java.util.Scanner;

public class ArrayRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0], min = arr[0];

        for(int i = 0; i < num; i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        int range = max - min;
        System.out.println("The range of the array is: " +range);

    }
}
