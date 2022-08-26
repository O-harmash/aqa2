package src.com.test;

import static java.lang.Math.multiplyExact;

public class main {

    public static final String SOME_TEXT = "some text";

    public static void main(String[] args) {
        System.out.println(SOME_TEXT);

        String s = "Hey how are you";

        print(s);

        printMuliply(2,3);
    }

    private static void print(String string) {
        System.out.println(string);
    }

    private static void printMuliply(int x, int y) {
        System.out.println(multiplyExact(x,y));
    }
}
