package test;

import java.util.Random;


public class Generate {
    private static final Random ran = new Random();

    private Generate() {
    }

    //产生随机数组
    public static int getInt() {
        return getInt(1)[0];
    }
    //产生随机数组
    public static int[] getInt(int length) {
        return getInt(length, 0);
    }
    //产生随机数组
    public static int[] getInt(int length, int bound) {
        int[] out = new int[length];
        for (int i = 0; i < length; i++) {
            if (bound == 0) out[i] = ran.nextInt();
            else out[i] = ran.nextInt(bound);
        }
        return out;
    }

    //产生随机字符 0-9 A-Z a-z
    public static char getChar() {
        int out;
        switch (ran.nextInt(3)) {
            case 0:
                out = (int) (Math.round(ran.nextDouble() * 9) + 48);
                break;
            case 1:
                out = (int) (Math.round(ran.nextDouble() * 25) + 65);
                break;
            case 2:
                out = (int) (Math.round(ran.nextDouble() * 25) + 97);
                break;
            default:
                out = 48;
                break;
        }
        return (char) out;
    }

    //产生随机字符串
    public static String getString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(getChar());
        }
        return sb.toString();
    }
}
