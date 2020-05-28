package n10.demo17;

import java.util.LinkedList;
import java.util.List;

/**
 * 执行用时 : 8 ms , 在所有 Java 提交中击败了 16.12% 的用户
 * 内存消耗 : 40 MB , 在所有 Java 提交中击败了 5.17% 的用户
 */
class Solution {
    private static final char[][] match = new char[10][];
    private List<String> lst = new LinkedList<>();
    private String s;
    private int length;

    static {
        match[0] = new char[]{'_'};
        match[1] = new char[]{'!', '@', '#'};
        match[2] = new char[]{'a', 'b', 'c'};
        match[3] = new char[]{'d', 'e', 'f'};
        match[4] = new char[]{'g', 'h', 'i'};
        match[5] = new char[]{'j', 'k', 'l'};
        match[6] = new char[]{'m', 'n', 'o'};
        match[7] = new char[]{'p', 'q', 'r', 's'};
        match[8] = new char[]{'t', 'u', 'v'};
        match[9] = new char[]{'w', 'x', 'y', 'z'};
    }

    public List<String> letterCombinations(String digits) {
        this.s = digits;
        this.length = digits.length();
        if (length > 0) get(0, "");
        return lst;
    }

    private void get(int i, String pre) {
        if (i < length) { //还未遍历完成
            int rNum = s.charAt(i) - '0';
            for (char rChar : match[rNum]) get(i + 1, pre + rChar);
        } else lst.add(pre);
    }
}