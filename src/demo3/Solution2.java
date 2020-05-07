package demo3;

public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int recent = 1;
        int same = -1;
        int end = s.length() - 1;
        int sum = 0;
        while (true) {
            //recent与从start开始的值逐个对比
            for (int i = start; i < recent; i++) {
                if (s.charAt(i) == s.charAt(recent)) {
                    same = i;
                    break;
                }
            }
            if (same < 0) { //如果没有找到,recent++,循环
                recent++;
                sum++;
            } else { //如果找到了相同的元素

            }
        }
    }
}
