import java.util.Scanner;
import java.util.Arrays;

public class Main15 {

    // Задача 1: индекс первого вхождения числа в массиве
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Задача 2: максимальное по модулю значение в массиве
    public static int maxAbs(int[] arr) {
        int max = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int absValue = Math.abs(arr[i]);
            if (absValue > max) {
                max = absValue;
            }
        }
        return max;
    }

    // Задача 3: вставка массива ins в arr на позицию pos
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }
        return result;
    }

    // Задача 4: переворот массива
    public static int[] reverseBack(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Задача 5: индексы всех вхождений x в массив
    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int value : arr) {
            if (value == x) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int n16 = sc.nextInt();
        int[] arr16 = new int[n16];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n16; i++) arr16[i] = sc.nextInt();
        System.out.print("Введите число для поиска: ");
        int x16 = sc.nextInt();
        System.out.println("Поиск по значению" + findFirst(arr16, x16)); //{1, 2, 3, 4, 2, 2, 5}

        System.out.print("Введите размер массива: ");
        int n17 = sc.nextInt();
        int[] arr17 = new int[n17];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n17; i++) arr17[i] = sc.nextInt();
        System.out.println("Максимум по модулю: " + maxAbs(arr17));

        System.out.print("Введите размер массива: ");
        int n18 = sc.nextInt();
        int[] arr18 = new int[n18];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n18; i++) arr18[i] = sc.nextInt();
        System.out.print("Введите размер вставляемого массива: ");
        int m = sc.nextInt();
        int[] ins = new int[m];
        System.out.println("Введите элементы вставляемого массива:");
        for (int i = 0; i < m; i++) ins[i] = sc.nextInt();
        System.out.print("Введите позицию вставки: ");
        int pos = sc.nextInt();
        System.out.println("Результат: " + Arrays.toString(add(arr18, ins, pos)));

        System.out.print("Введите размер массива: ");
        int n19 = sc.nextInt();
        int[] arr19 = new int[n19];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n19; i++) arr19[i] = sc.nextInt();
        System.out.println("Перевёрнутый массив: " + Arrays.toString(reverseBack(arr19)));

        System.out.print("Введите размер массива: ");
        int n20 = sc.nextInt();
        int[] arr20 = new int[n20];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n20; i++) arr20[i] = sc.nextInt();
        System.out.print("Введите число для поиска: ");
        int x20 = sc.nextInt();
        System.out.println("Все вхождения числа: " + Arrays.toString(findAll(arr20, x20)));
    }
}