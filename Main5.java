import java.util.Scanner;
public class Main5 {

    // Задача 1: модуль числа
    public int abs(int x) {
        return Math.abs(x);
    }

    // Задача 2: кратно ли 3 или 5, но не одновременно
    public boolean is35(int x) {
        boolean isThree = x % 3 == 0;
        boolean isFive = x % 5 == 0;
        if (isThree && isFive) {
            return false;
        }
        return isThree || isFive;
    }

    // Задача 3: максимум из трёх чисел
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    // Задача 4: сумма двух чисел с проверкой на диапазон 10..19
    public int sum2(int x, int y) {
        int c = x + y;
        if (c >= 10 && c <= 19) {
            return 20;
        }
        return c;
    }

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
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main5 obj = new Main5();

        System.out.println("Введите число: ");
        int x = sc.nextInt();
        System.out.println(obj.abs(x)); //3; -3; -5738

        System.out.println("\nВведите число: ");
        int x1 = sc.nextInt();
        System.out.println(obj.is35(x1)); //5;8;15

        System.out.println("\nВведите три числа:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(obj.max3(a,b,c)); //(5,7,7); (8,-1,4)

        System.out.println("\nВведите два числа:");
        int d = sc.nextInt(), m = sc.nextInt();
        System.out.println(obj.sum2(d, m)); //(5,7); (8,-1)

        System.out.println("\nВведите день:");
        int data = sc.nextInt();
        System.out.println(obj.day(data));
    }
}
