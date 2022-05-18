package HW1;

public class HW1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    private static void compareNumbers() {
        int a = 10;
        int b = 14;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void printColor() {
        int value = 1020;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    private static void checkSumSign() {
        int a = 36;
        int b = 8;
        int summ = a + b;
        if (summ >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printThreeWords() {
        System.out.println("""
                Orange
                Banana
                Apple   
                """);
    }
}
