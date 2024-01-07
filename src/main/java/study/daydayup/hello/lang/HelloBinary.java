package study.daydayup.hello.lang;

public class HelloBinary {
    public static void main(String[] args) {
        int i = 0b001100;

        System.out.println("binary i: " + Integer.toBinaryString(i));
        i = ~i;
        System.out.println("binary ~i: " + Integer.toBinaryString(i));

        int b = 0b000100;
        System.out.println("binary b: " + Integer.toBinaryString(b));
        i = b & i;
        System.out.println("binary b & (~i): " + Integer.toBinaryString(i));
    }
}
