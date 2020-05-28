package n00.demo3;

/**
 * Not AC
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = s.length() - 1;
        int sum = 0;
        while (end - start > 0) {
            //循环开始
            int[] calRes = cal(start, end, s);
            int tmp = calRes[1] - calRes[0];
            if (calRes[0] == start) { //如果连续，sum++，继续下个循环
                sum++;
                start++;
                end = calRes[1];
            } else { //如果不连续，sum清零，继续下个循环
                sum = 1;
                start = calRes[0] + 1;
                end = calRes[1];
            }
        }
        return sum;
    }

    public int[] cal(int a, int b, String s) {
        int iStart = a;
        int iEnd = b;
        int iPre = a;
        int iNext = a;
        int delta = 0;
        int[] d1 = new int[2];
        int[] d2 = new int[2];
        //--------------------------------//
        char rChar = s.charAt(a);
        //查找重复的
        for (int i = a + 1; i <= b; i++) {
            if (s.charAt(i) == rChar) {
                iNext = i;
                if ((iNext - iPre) > delta) {
                    iStart = iPre;
                    iEnd = iNext;
                    delta = iEnd - iStart;
                } else if ((iNext - iPre) == delta && delta > 2) {
                    d1 = cal(iStart + 1, iEnd - 1, s);
                    d2 = cal(iPre + 1, iNext - 1, s);
                    if ((d2[1] - d2[0]) > (d1[1] - d1[0])) {
                        iStart = iPre;
                        iEnd = iNext;
                        delta = iEnd - iStart;
                    }
                }
                iPre = i;
            }
        }
        //如果iEnd正好是最后一个
        if (iEnd == b) return new int[]{iStart, iEnd};
        //如果iEnd不是最后一个
        if ((b - iEnd) > delta) {
            iStart = iEnd;
            iEnd = b;
        } else if ((b - iEnd) == delta) {
            d1 = cal(iStart + 1, iEnd - 1, s);
            d2 = cal(iStart + 1, b - 1, s);
            if ((d2[1] - d2[0]) > (d1[1] - d1[0])) {
                iStart = iEnd;
                iEnd = b;
            }
        } else if ((b - iEnd) < delta) {
        }
        //---结果---//
        return new int[]{iStart, iEnd};
    }
}