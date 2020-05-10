package demo9;

/**
 * 执行用时 : 12 ms , 在所有 Java 提交中击败了 37.91% 的用户
 * 内存消耗 : 38.7 MB , 在所有 Java 提交中击败了 5.14% 的用户
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x <= 9) return true;
        int length = (int) Math.log10(x) + 1;
        for (int i = 1; i <= length / 2; i++) {
            int a = (int) (x / Math.pow(10, i - 1) % 10);
            int b = (int) (x / (Math.pow(10, length - i)) % 10);
            if (a != b) return false;
        }
        return true;
    }
}