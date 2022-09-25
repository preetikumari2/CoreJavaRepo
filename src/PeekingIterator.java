import java.util.Scanner;

class PeekIterator{
    int[] arr;
    int point;

    public PeekIterator(int[] arr) {
        this.arr = arr;
        point=-1;
    }
    public int next(){
        point++;
        return arr[point];
    }
    public boolean hasNext(){
        return(point!= arr.length-1);
    }
    public int peek(){
        return arr[point+1];
    }
}

public class PeekingIterator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0;i < n;i ++)
            arr[i] = sc.nextInt();
        PeekIterator it = new PeekIterator(arr);
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.peek());
        System.out.println(it.next());
    }
}