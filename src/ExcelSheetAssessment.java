//Given an integer columnNumber, return its corresponding column title as it appears in an
// Excel sheet.
//
//        For example:
//
//        A -> 1
//        B -> 2
//        C -> 3
//        ...
//        Z -> 26
//        AA -> 27
//        AB -> 28
//        Input: columnNumber = 1
//        Output: "A"



//26 ^ 2 + 1 + 26 ^ 2 * 1 + 26 ^ 0 * 1

import java.util.Scanner;
public class ExcelSheetAssessment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Column Number: ");
        int columnNumber = sc.nextInt();
        columnTitle(columnNumber);
    }
    public static void columnTitle(int columnNumber){
        StringBuilder columnName = new StringBuilder();
        while(columnNumber > 0) {
            int remainder = columnNumber % 26;
            if (remainder == 0) {
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            }
            else {
                columnName.append((char) ((remainder - 1) + 'A'));
                columnNumber = columnNumber / 26;
            }
        }
        System.out.println(columnName.reverse());
    }
}