package n20.demo21;

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        if (next == null) return "" + this.val;
        else return this.val + "->" + next.toString();
    }
}

/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 63.28% 的用户
 * 内存消耗 : 39.1 MB , 在所有 Java 提交中击败了 65.42% 的用户
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = new ListNode(0);
        ListNode recent = head;
        while (true) {
            if (l1.val < l2.val) { //l1更小
                recent.val = l1.val;
                if (l1.next != null) l1 = l1.next;
                else { //l1后面已没有节点
                    add(recent, l2);
                    return head;
                }
            } else { //l2更小
                recent.val = l2.val;
                if (l2.next != null) l2 = l2.next;
                else { //l2后面已没有节点
                    add(recent, l1);
                    return head;
                }
            }
            recent.next = new ListNode(0);
            recent = recent.next;
        }
    }

    private void add(ListNode l1, ListNode l2) {
        while (l2 != null) {
            l1.next = new ListNode(0);
            l1 = l1.next;
            l1.val = l2.val;
            l2 = l2.next;
        }
    }
}
