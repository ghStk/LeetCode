package n20.demo20;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 执行用时 : 2 ms , 在所有 Java 提交中击败了 85.04% 的用户
 * 内存消耗 : 37.8 MB , 在所有 Java 提交中击败了 5.48% 的用户
 */
class Solution {
    private ArrayList<LinkedList<Integer>> lst = new ArrayList<>(3);

    public boolean isValid(String s) {
        if (s.isEmpty()) return true;
        int length = s.length();
        if (length % 2 == 1) return false;
        LinkedList<Integer> k0 = new LinkedList<>();  // k0 '('
        LinkedList<Integer> k1 = new LinkedList<>();  // k1 '['
        LinkedList<Integer> k2 = new LinkedList<>();  // k2 '{'
        lst.add(k0);
        lst.add(k1);
        lst.add(k2);
        for (int i = 0; i < length; i++) {
            char tmp = s.charAt(i);
            int op;
            switch (tmp) {
                case '(':
                    op = 0;
                    break;
                case '[':
                    op = 1;
                    break;
                case '{':
                    op = 2;
                    break;
                case ')':
                    op = 3;
                    break;
                case ']':
                    op = 4;
                    break;
                case '}':
                    op = 5;
                    break;
                default:
                    return false;
            }
            if (!judge(op, i)) return false;
        }
        return k0.isEmpty() && k1.isEmpty() && k2.isEmpty();
    }

    private boolean judge(int op, int recent) {
        LinkedList<Integer> rList = lst.get(op % 3);
        if (op < 3) { //左括号,则进入队列
            rList.add(recent);
        } else { //右括号,则进行匹配
            if (rList.isEmpty()) return false;
            int pre = rList.getLast();
            int otherPre1;
            if (lst.get((op + 1) % 3).isEmpty()) otherPre1 = -1;
            else otherPre1 = lst.get((op + 1) % 3).getLast();
            int otherPre2;
            if (lst.get((op + 2) % 3).isEmpty()) otherPre2 = -1;
            else otherPre2 = lst.get((op + 2) % 3).getLast();
            if ((recent - pre) % 2 == 1) { //条件1匹配成功
                if (otherPre1 < pre && otherPre2 < pre) { //条件2匹配成功
                    rList.removeLast();
                } else return false;
            } else return false;
        }
        return true;
    }
}