package demo3;

import test.Generate;

public class Test {
    public static void main(String[] args) {
        Solution2 slt = new Solution2();
        for (int i = 0; i < 10; i++) {
            String s = Generate.getString(10);
            System.out.print(s+" res=");
//            System.out.println(slt.lengthOfLongestSubstring("dvdf"));
            System.out.println(slt.lengthOfLongestSubstring(s));
        }
    }
}
