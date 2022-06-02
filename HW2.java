package HW;

public class HW2 {
    public static void main(String[] args) {
        positiveOrNegative(-12);
        System.out.println(checkTrue(4, 6));
        System.out.println(trueOrFalse(4));
        repeat("Hello, World!", 7);
        System.out.println(year(200));
    }

    private static boolean year(int a) {
        return (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
    }

    private static void repeat(String a, int b) {
        for (int i = 0; i <= b; i++) {
            System.out.println(a);
        }
    }

    private static boolean trueOrFalse(int a) {
        return (a < 0);
    }

    private static boolean checkTrue(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    private static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

}
