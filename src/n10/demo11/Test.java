package n10.demo11;

/**
 * 11.给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 */
public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
//        for (int i = 0; i < 10; i++) {
//            int[] height = Generate.getInt(2, 9);
//            System.out.print(Arrays.toString(height));
//            System.out.println(" Max Area:" + slt.maxArea(height));
//        }
        int[] height2 = {1,2,3,4,5,25,24,3,4};
        System.out.println(slt.maxArea(height2));
    }
}
