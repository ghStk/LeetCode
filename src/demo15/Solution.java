package demo15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 时间NG,xjb写的
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //TODO-计算结果
        int length = nums.length;
        HashMap<String, int[]> hm = new HashMap<>();
        for (int i = 0; i <= length - 3; i++) {
            int a = nums[i];
            for (int j = i + 1; j <= length - 2; j++) {
                int b = nums[j];
                for (int k = j + 1; k <= length - 1; k++) {
                    int c = nums[k];
                    if (a + b + c == 0) {
                        int[] tmp = {a, b, c};
                        for (int m = 2; m > 0; m--) {
                            for (int n = 0; n < m; n++) {
                                if (tmp[n] > tmp[n + 1]) {
                                    int tmp1 = tmp[n];
                                    tmp[n] = tmp[n + 1];
                                    tmp[n + 1] = tmp1;
                                }
                            }
                        }
                        hm.put("" + tmp[0] + tmp[1], tmp);
                    }
                }
            }
        }
        for (String key : hm.keySet()) {
            List<Integer> tmp = new ArrayList<>(3) {
                {
                    add(hm.get(key)[0]);
                    add(hm.get(key)[1]);
                    add(hm.get(key)[2]);
                }
            };
            res.add(tmp);
        }
        //---输出结果---start
//        res.forEach(x -> {
//            for (Object y : x) {
//                System.out.print(y + " ");
//            }
//            System.out.println();
//        });
        //---输出结果---end
        return res;
    }
}