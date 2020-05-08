package demo7;

import test.Generate;

public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
        for (int x : Generate.getInt(6)) {
            System.out.print(x+" ");
            System.out.println(slt.reverse(x));
        }
    }
}
