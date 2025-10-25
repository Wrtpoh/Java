import java.util.Scanner;
import java.util.Arrays;

public class Main15 {

    // Задача 1: индекс первого вхождения числа в массиве
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    } // arr=[1,2,3,4,2,2,5] x=2

    // Задача 2: максимальное по модулю значение в массиве
    public int maxAbs(int[] arr) {
        int max = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int absValue = Math.abs(arr[i]);
            if (absValue > max) max = absValue;
        }
        return max;
    } // arr=[1,-2,-7,4,2,2,5]

    // Задача 3: вставка массива ins в arr на позицию pos
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) result[i] = arr[i];
        for (int i = 0; i < ins.length; i++) result[pos + i] = ins[i];
        for (int i = pos; i < arr.length; i++) result[i + ins.length] = arr[i];
        return result;
    } // arr=[1,2,3,4,5] ins=[7,8,9] pos=3

    // Задача 4: переворот массива
    public int[] reverseBack(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) reversed[i] = arr[arr.length - 1 - i];
        return reversed;
    } // arr=[1,2,3,4,5]

    // Задача 5: индексы всех вхождений x в массив
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int value : arr) if (value == x) count++;
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) result[index++] = i;
        }
        return result;
    } // arr=[1,2,3,8,2,2,9] x=2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main15 obj = new Main15();

        // Задача 1
        System.out.print("Задача 1. Введите размер массива: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();
        System.out.print("Введите число для поиска первого вхождения: ");
        int x1 = sc.nextInt();
        System.out.println("Индекс первого вхождения: " + obj.findFirst(arr1, x1));

        // Задача 2
        System.out.print("\nЗадача 2. Введите размер массива: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        System.out.println("Максимум по модулю: " + obj.maxAbs(arr2));

        // Задача 3
        System.out.print("\nЗадача 3. Введите размер основного массива: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n3; i++) arr3[i] = sc.nextInt();
        System.out.print("Введите размер вставляемого массива: ");
        int m = sc.nextInt();
        int[] ins = new int[m];
        System.out.println("Введите элементы вставляемого массива:");
        for (int i = 0; i < m; i++) ins[i] = sc.nextInt();
        System.out.print("Введите позицию вставки (0.." + n3 + "): ");
        int pos = sc.nextInt();
        System.out.println("Результат вставки: " + Arrays.toString(obj.add(arr3, ins, pos)));

        // Задача 4
        System.out.print("\nЗадача 4. Введите размер массива: ");
        int n4 = sc.nextInt();
        int[] arr4 = new int[n4];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n4; i++) arr4[i] = sc.nextInt();
        System.out.println("Перевёрнутый массив: " + Arrays.toString(obj.reverseBack(arr4)));

        // Задача 5
        System.out.print("\nЗадача 5. Введите размер массива: ");
        int n5 = sc.nextInt();
        int[] arr5 = new int[n5];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n5; i++) arr5[i] = sc.nextInt();
        System.out.print("Введите число для поиска всех вхождений: ");
        int x5 = sc.nextInt();
        System.out.println("Индексы всех вхождений числа: " + Arrays.toString(obj.findAll(arr5, x5)));
    }
}
