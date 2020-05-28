package n00.demo3;

/**
 *执行用时 :646 ms, 在所有 Java 提交中击败了5.00%的用户
 *内存消耗 :39.8 MB, 在所有 Java 提交中击败了5.20%的用户
 */
public class Solution2 {
    private String sin;
    private int max;

    public int lengthOfLongestSubstring(String s) {
        int end = s.length() - 1;
        if (end < 0) return 0;
        sin = s;
        max = 1;
        int start = 0;
        int bp;
        //从start开始的值逐个对比
        while (max < (end - start + 1)) {
            bp = loop(start, end);
            if (bp < 0) { //此循环无断点
                if (max < (end - start + 1)) max = (end - start + 1);
                return max;
            } else { //此循环有断点，从断点开始下个循环
                start = bp+1;
            }
        }
        return max;
    }

    //从start+1到end，
    //最大连续长度max，中断点i
    private int loop(int start, int end) {
        int same = -1;
        int i;
        for (i = start + 1; i <= end; i++) {
            same = compare(start, i);
            if (same == -1) { //无重复
                if ((i - start + 1) > max) max = i - start + 1;
            } else if (same > -1) { //same与i重复
                if ((same - start + 1) > max) max = same - start + 1;
                if ((i - same) > max) max = i - same;
                break;
            } else return -1; //same超范围，报错
        }
        return same;
    }

    //从start到end，是否有与end重复的
    private int compare(int start, int end) {
        for (int j = start; j < end; j++) {
            if (sin.charAt(j) == sin.charAt(end)) {
                return j;
            }
        }
        return -1;
    }
}
