package n10.demo17;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
        String s = "23";
        List<String> res = slt.letterCombinations(s);
        for (String a:res){
            System.out.print(a+" ");
        }
    }
}
