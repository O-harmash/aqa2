import static java.lang.Math.multiplyExact;

public class maitest {
    public static void main(String[] args) {
        System.out.println("Hi test");

        String s = "Hello test";

        printMessage(s);

        printSum( 3,  5);


    }

    private static void printMessage(String s) {
        System.out.println(s);
    }

    private static void printSum(int a, int b){
        System.out.println(a + b);

    }
}
