package HW;


import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        arrayCycle();
        fillArray();
        multiplyArray();
        diagonalArray();
        System.out.println(Arrays.toString(argsArray(6, 12)));
        maxMinArray();
        System.out.println(eqArray());
    }

    private static boolean eqArray() {
        int[] a = {3, 1, 5, 4, 2, 1, 2};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int left = 0;
        int right = sum;
        if (right % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                left += a[i];
                if (left == right) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void maxMinArray() {
        int[] a = new int [100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    private static int[] argsArray(int len, int initialValue ) {
        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = initialValue;
        }
        return a;
    }

    private static void diagonalArray() {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j || a.length - i - 1 ==j) {
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    private static void multiplyArray() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static void fillArray() {
        int[] a = new int [100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        System.out.println(Arrays.toString(a));
    }

    private static void arrayCycle() {
        int[] a = {0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        for (int j = 0; j < a.length; j++) {
            if (a[j] == 0) {
                a[j] = 1;
            } else {
                a[j] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
