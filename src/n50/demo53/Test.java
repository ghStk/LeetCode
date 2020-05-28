package n50.demo53;

/**
 * 53.最大自序和 #easy #动态规划
 */
public class Test {
    public static void main(String[] args) {
        Solution2 slt = new Solution2();
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(slt.maxSubArray(num));
    }
}
