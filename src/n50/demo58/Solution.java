package n50.demo58;

/**
 * 58.最后一个单词的长度
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 38 MB , 在所有 Java 提交中击败了 6.38% 的用户
 */
class Solution {
    public int lengthOfLastWord(String s) {
        int length = s.length();
        if (length == 0) return 0;
        int i = length - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        if (i < 0) return 0;
        int max = 1;
        while (--i >= 0 && s.charAt(i) != ' ') max++;
        return max;
    }
}