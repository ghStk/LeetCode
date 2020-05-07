package demo3;

import test.Generate;

public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
        for (int i = 0; i < 1; i++) {
            String s = Generate.getString(10);
            System.out.print(s+" res=");
            System.out.println(slt.lengthOfLongestSubstring("abcabcbb"));
        }
    }
}
