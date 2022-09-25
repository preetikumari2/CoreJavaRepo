import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test case: ");
        int testCase = sc.nextInt();
        System.out.println("Enter the String: ");
        for(int k = 1; k <= testCase; k++) {
            String s = sc.next();
            int len = s.length();
            int max = 0;
            String total = "";
            for(int i = 0; i < len; i++){
                for(int j = i + 1; j <= len; j++){
                    String st = s.substring(i , j);
                    String rev = new StringBuffer(st).reverse().toString();
                    if(st.equals(rev)){
                        if(max < s.substring(i, j).length()){
                            max = s.substring(i, j).length();
                            total = s.substring(i, j);
                        }
                    }
                }
            }
            System.out.println("The longest Palindrome is: "+total);
        }
    }
}