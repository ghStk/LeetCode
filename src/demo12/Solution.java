package demo12;

/**
 * 执行用时 : 4 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 39.5 MB , 在所有 Java 提交中击败了 5.55% 的用户
 */
class Solution {
    private final StringBuilder sb = new StringBuilder();
    private final char[] one = {'I', 'X', 'C', 'M'};
    private final char[] five = {'V', 'L', 'D'};

    public String intToRoman(int num) {
        cal(3, num / 1000);
        cal(2, num % 1000 / 100);
        cal(1, num % 100 / 10);
        cal(0, num % 10);
        return sb.toString();
    }

    public void cal(int digit, int num) {
        if (num == 4) {
            sb.append(one[digit]);
            sb.append(five[digit]);
        } else if (num == 9) {
            sb.append(one[digit]);
            sb.append(one[digit + 1]);
        } else {
            if (num > 4) {
                sb.append(five[digit]);
                num -= 5;
            }
            while (num > 0) {
                sb.append(one[digit]);
                num--;
            }
        }
    }
}