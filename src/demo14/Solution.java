package demo14;

/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 79.38% 的用户
 * 内存消耗 : 37.9 MB , 在所有 Java 提交中击败了 15.84% 的用户
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int res = 0;
        if (strs.length == 0) return "";
        try {
            for (int i = 0; i < strs[0].length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].charAt(i) != strs[0].charAt(i))
                        return strs[0].substring(0, res);
                }
                res++;
            }
        } catch (StringIndexOutOfBoundsException e1) {
//            System.out.println("!");
        }
        return strs[0].substring(0, res);
    }
}