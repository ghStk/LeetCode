package test;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        method(arr);
        System.out.println(arr.length);
    }
    private static void method(int[] a){
        System.out.println(a);
        a = null;
        System.out.println(a);
    }
}
