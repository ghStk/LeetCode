package demo3;
/**
 * 3. 无重复字符的最长子串 [Not AC]
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
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
