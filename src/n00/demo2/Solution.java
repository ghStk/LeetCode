package n00.demo2;

/**
 * 执行用时 :2 ms, 在所有 Java 提交中击败了99.93%的用户
 * 内存消耗 :39.4 MB, 在所有 Java 提交中击败了95.69%的用户
*/
class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode();
        ListNode rNode1 = l1;
        ListNode rNode2 = l2;
        ListNode rNode3 = newNode;
        Boolean isEnd1 = false;
        Boolean isEnd2 = false;
        int tmp1 = 0;
        int tmp2 = 0;
        int tmpSave = 0;
        int count = 0;
        while (!(isEnd1 && isEnd2)) {
            //取出表1的值
            if (rNode1.next != null) {
                tmp1 = rNode1.val;
                rNode1 = rNode1.next;
            } else if (!isEnd1) {
                isEnd1 = true;
                tmp1 = rNode1.val;
            } else tmp1 = 0;
            //取出表2的值
            if (rNode2.next != null) {
                tmp2 = rNode2.val;
                rNode2 = rNode2.next;
            } else if (!isEnd2) {
                isEnd2 = true;
                tmp2 = rNode2.val;
            } else tmp2 = 0;
            //算出和，赋值给新表
            int tmpSum = tmpSave / 10 + tmp1 + tmp2;
            tmpSave = tmpSum / 10 * 10;
            rNode3.val = tmpSum % 10;
            if (!(isEnd1 && isEnd2)) {
                rNode3.next = new ListNode();
                rNode3 = rNode3.next;
            }
            count++;
        }
        //清算tmpSave里的值
        if (tmpSave > 0) {
            rNode3.next = new ListNode();
            rNode3 = rNode3.next;
            rNode3.val = tmpSave / 10;
        }
        return newNode;
    }
}