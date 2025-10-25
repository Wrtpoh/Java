import java.util.Scanner;

public class Main5 {

    // Задача 1: модуль числа
    public int abs(int x) {
        return Math.abs(x); // x=5; x=-3
    }

    // Задача 2: кратно ли 3 или 5, но не одновременно
    public boolean is35(int x) {
        boolean isThree = x % 3 == 0;
        boolean isFive = x % 5 == 0;
        return (isThree || isFive) && !(isThree && isFive);
    } // 5;8;15

    // Задача 3: максимум из трёх чисел
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    } // x=5  y=7  z=7; x=8  y=-1  z=4

    // Задача 4: сумма двух чисел с проверкой на диапазон 10..19
    public int sum2(int x, int y) {
        int c = x + y;
        return (c >= 10 && c <= 19) ? 20 : c;
    } // x=5  y=7 ; x=8  y=-1

    // Задача 5: день недели по номеру
    public String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        } // 5
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main5 obj = new Main5();

        // Задача 1
        System.out.print("Задача 1. Введите число для нахождения модуля: ");
        int x = sc.nextInt();
        System.out.println("Модуль числа: " + obj.abs(x));

        // Задача 2
        System.out.print("\nЗадача 2. Введите число для проверки кратности 3 или 5: ");
        int x1 = sc.nextInt();
        System.out.println("Кратно 3 или 5 (но не одновременно)? " + obj.is35(x1));

        // Задача 3
        System.out.print("\nЗадача 3. Введите три числа через пробел: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Максимальное число: " + obj.max3(a, b, c));

        // Задача 4
        System.out.print("\nЗадача 4. Введите два числа через пробел: ");
        int d = sc.nextInt(), m = sc.nextInt();
        System.out.println("Сумма с проверкой диапазона 10..19: " + obj.sum2(d, m));

        // Задача 5
        System.out.print("\nЗадача 5. Введите номер дня недели (1-7): ");
        int data = sc.nextInt();
        System.out.println("День недели: " + obj.day(data));
    }
}
