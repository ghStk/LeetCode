package n10.demo13;

import java.util.HashMap;
import java.util.Map;

/**
 * 执行用时 : 6 ms , 在所有 Java 提交中击败了 57.62% 的用户
 * 内存消耗 : 39.9 MB , 在所有 Java 提交中击败了 5.56% 的用户
 */
class Solution {

    private final static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        int length = s.length();
        int sum = 0;
        int buffer = 0;
        for (int i = 0; i <= length - 2; i++) {
            int rVal = map.get(s.charAt(i));
            int nextVal = map.get(s.charAt(i + 1));
            if (rVal > nextVal) {
                buffer += rVal;
                sum += buffer;
                buffer = 0;
            } else if (rVal < nextVal) {
                buffer += rVal;
                sum -= buffer;
                buffer = 0;
            } else buffer += rVal;
        }
        sum = sum + buffer + map.get(s.charAt(length - 1));
        return sum;
    }
}