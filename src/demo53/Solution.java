package demo53;

import java.util.LinkedList;

class Solution { //todo
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        int start = 0;
        int max = nums[0];
        while (start < length && nums[start] <= 0) start++; //找到第一个正数位置
        if (start == length) { //都是负数则找出最大项
            for (int x : nums) {
                if (x > max) max = x;
            }
            return max;
        }
        LinkedList<Integer> arr = new LinkedList<>();
        int sum = nums[start];
        for (int i = start + 1; i < length; i++) {
            int tmp = nums[i];
            if (tmp * sum >= 0) { //同号则累计
                sum += tmp;
            } else { //不同号则结算,进入队列
                arr.add(sum);
                sum = 0;
            }
        }

        return 0;
    }

    private LinkedList<Integer> simplify(LinkedList<Integer> lst) {
        int length = lst.size();
        if (length <= 3) return lst;
        LinkedList<Integer> newLst = new LinkedList<>();
        newLst.add(lst.getFirst());
        lst.removeFirst();
        int sum = 0;
        for (int tmp : lst) {
            if (tmp * sum >= 0) {
                sum += tmp;
            } else {
                newLst.add(sum);
                sum = 0;
            }
        }
        return simplify(newLst);
    }
}