import java.util.*;
public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of keys: ");
        int num = sc.nextInt();
        HashMap<Integer, HashSet<Character>> hasMap = new HashMap<>();
        System.out.println("Enter the character values as strings:");
        for (int i = 1; i <= num; i++)
        {
            ArrayList<Character> aList = new ArrayList<>();
            String str = sc.next();
            for(int j = 0; j < str.length();j++) {
                aList.add(str.charAt(j));
            }
            HashSet<Character> set = new HashSet<>(aList);
            hasMap.put(i, set);
        }
        System.out.println(hasMap);
    }


}