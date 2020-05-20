package demo15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 执行用时 : 184 ms , 在所有 Java 提交中击败了 10.43% 的用户
 * 内存消耗 : 45.4 MB , 在所有 Java 提交中击败了 93.08% 的用户
 */
class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        /*
        for (int i = length - 1; i > 0; i--) { //s1 从小到大排序
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        */
        Arrays.sort(nums);
//        -----------Test
//        System.out.println(Arrays.toString(nums));
//        -----------Test
        List<List<Integer>> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < length; i++) { //s2 选定一个数,找2个数与之匹配
            int c0 = nums[i];
            if (c0 > 0) break;//提前结束：最小的数也大于0
            int z1 = i + 1;
            int z2 = length - 1;
            while (z1 < z2) {
                int c1 = nums[z1];
                int c2 = nums[z2];
                if (c2 < 0) break;//提前结束：最大的数小于0
                if (c0 + c1 + c2 == 0) { //s2.0 找到匹配项
                    if (!set.contains("" + c0 + c1)) { //不重复则加入
                        set.add("" + c0 + c1);
                        res.add(List.of(c0, c1, c2));
                    }
                    z1++;
                    z2--;
                } else if (c0 + c1 + c2 > 0) { //s2.1 求和过大,Z2左移
                    while (--z2 > i && nums[z2] == c2) ; //如果左移后相同,一直左移
                } else { //s2.2 求和过小,Z1右移
                    while (++z1 < length && nums[z1] == c1) ;
                }
            }
        }
        return res;
    }
}
