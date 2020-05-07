package test;

import java.util.Random;

/**
 * @Time: 2020-05-07 15:40
 */
public class Generate {
    private Generate() {
    }

    //产生随机数组
    public static int[] getInt(int length) {
        Random ran = new Random();
        int[] out = new int[length];
        for (int i = 0; i < length; i++) {
            out[i] = ran.nextInt();
        }
        return out;
    }

    //产生随机字符 0-9 A-Z a-z
    public static char getChar() {
        Random ran = new Random();
        int out;
        switch (ran.nextInt(3)) {
            case 0:
//                out = (Math.round(ran.nextDouble() * 25.0) + 48);
                break;
            case 1:
                out = (Math.round(ran.nextInt(1) * 25) + 65);
                break;
            case 2:
                out = (Math.round(ran.nextInt(1) * 25) + 90);
                break;
            default:
                break;
        }
//        return (char) out;
        return '1';
    }

    //产生随机字符串
    public static String getString(int length) {
        StringBuilder sb = new StringBuilder(length);

        return sb.toString();
    }
}
