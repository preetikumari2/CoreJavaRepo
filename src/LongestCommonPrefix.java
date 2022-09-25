public class LongestCommonPrefix {

    public static String findLongestPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String longestCommPrefix = strs[0];
        for(int i = 1; i < strs.length; i++ ) {
            String currWord = strs[i];
            int j = 0;
            while (j < currWord.length() && j < longestCommPrefix.length() && currWord.charAt(j) == longestCommPrefix.charAt(j)) {
                j++;
            }
            if (j == 0)
                return "";
            longestCommPrefix = currWord.substring(0, j);
        }
        return longestCommPrefix;
    }
    public static void main(String[] args) {
        String[] string1 = {"flower","flow","flight"};
        String[] string2 = {"dog","racecar","car"};
        String[] string3 = {"Cat","Cable","Car"};
        String result1 = findLongestPrefix(string1);
        String result2 = findLongestPrefix(string2);
        String result3 = findLongestPrefix(string3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
