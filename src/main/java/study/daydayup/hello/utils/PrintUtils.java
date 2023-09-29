package study.daydayup.hello.utils;

public class PrintUtils {

    public static void blankLine() {
        blankLine(1);
    }

    public static void blankLine(int len) {
        for (int i = 0; i < len; i++) {
            System.out.println();
        }
    }

    public static void starLine(Object name) {
        String stars = "***********************";
        System.out.println(stars + name + stars);
    }

    public static void except(Object name) {
        String stars = "***********************";
        System.out.println(stars + name + stars);
    }

}
