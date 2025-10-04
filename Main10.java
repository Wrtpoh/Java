import java.util.Scanner;
public class Main10 {

    // Задача 1: список чисел от 0 до x
    public static String listNums(int x) {
        if (x < 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i);
            if (i != x) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Задача 2: чётные числа до x
    public static String chet(int x) {
        if (x < 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i);
            if (i + 2 <= x) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Задача 3: количество цифр в числе
    public static int numLen(long x) {
        if (x == 0) return 1;
        int count = 0;
        long n = Math.abs(x);
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // Задача 4: квадрат из звёздочек
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Задача 5: прямоугольный треугольник
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int x = sc.nextInt();
        System.out.println(listNums(x));

        System.out.println("\nВведите число: ");
        int y = sc.nextInt();
        System.out.println(chet(y));

        System.out.println("\nВведите число: ");
        int z = sc.nextInt();
        System.out.println(numLen(z));

        System.out.println("\nВведите число: ");
        int f = sc.nextInt();
        square(f);
        System.out.println();
        square(f);

        System.out.println("\nВведите число: ");
        int k = sc.nextInt();
        rightTriangle(k);
        System.out.println();
        rightTriangle(k);

    }
}