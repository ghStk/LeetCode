package n50.demo53;

/**
 * #分治 #线段树
 * 执行用时 : 2 ms , 在所有 Java 提交中击败了 14.84% 的用户
 * 内存消耗 : 40.3 MB , 在所有 Java 提交中击败了 33.71% 的用户
 */

public class Solution2 {
    private int[] nums;

    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if (length == 0) return Integer.MIN_VALUE;
        else if (length == 1) return nums[0];
        this.nums = nums;
        return get(0, length - 1).mSum;
    }

    private class status {
        private status(int lSum, int rSum, int iSum, int mSum) {
            this.lSum = lSum;// lSum 表示 [l,r] 内以 ll 为左端点的最大子段和
            this.rSum = rSum;// rSum 表示 [l,r] 内以 rr 为右端点的最大子段和
            this.iSum = iSum;// iSum 表示 [l,r] 的区间和
            this.mSum = mSum;// mSum 表示 [l,r] 内的最大子段和
        }

        private final int lSum;
        private final int rSum;
        private final int iSum;
        private final int mSum;
    }

    private status get(int l, int r) {
        if (l == r) return new status(nums[l], nums[l], nums[l], nums[l]);
        int mid = (l + r) >> 1;
        status lSub = get(l, mid);
        status rSub = get(mid + 1, r);
        return pushUp(lSub, rSub);
    }

    private status pushUp(status l, status r) {
        int lSum = Math.max(l.lSum, (l.iSum + r.lSum));
        int rSum = Math.max(r.rSum, (r.iSum + l.rSum));
        int iSum = l.iSum + r.iSum;
        int mSum = Math.max(Math.max(l.mSum, r.mSum), (l.rSum + r.lSum));
        return new status(lSum, rSum, iSum, mSum);
    }
}
