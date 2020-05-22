package demo38;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
//        Solution slt = new Solution();
//        for (int i = 1; i <= 30; i++) {
//            System.out.print(i + "---");
//            System.out.println(slt.countAndSay(i));
//        }
        output();
    }

    //    ss[i]=???
    private static void output() throws IOException {
        File target = new File("D:\\Users\\Java\\demo38 answer.txt");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target));
        byte[] bys = new byte[1024];
        Solution slt = new Solution();
        for (int i = 1; i <= 30; i++) {
            String s1 = "ss[" + (i - 1) + "]=\"";
            bos.write(s1.getBytes());
            bos.write(slt.countAndSay(i).getBytes());
            bos.write("\";\n".getBytes());
        }
        bos.close();
    }
}
