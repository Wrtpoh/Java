import java.util.Scanner;
public class Main {

    // Задача 1: дробная часть числа
    public double fraction(double x) {
        return x - Math.floor(x);
    }

    // Задача 2: символ → цифра
    public int charToNum(char x) {
        if (x < '0' || x > '9') {
            throw new IllegalArgumentException("Ошибка: введённый символ не является цифрой от 0 до 9.");
        }
        return x - '0';
    }

    // Задача 3: двухзначное ли число
    public boolean is2Digits(int x) {
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }

    // Задача 4: входит ли число в диапазон
    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    // Задача 5: равны ли три числа
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main obj = new Main();


        System.out.println("Задача 1:");
        System.out.print("Введите число: "); //5,25; -5,25
        double d = sc.nextDouble();
        System.out.println(obj.fraction(d));

        System.out.println("\nВведите символ:");
        char c = sc.next().charAt(0); // '3'
        System.out.println(obj.charToNum(c));

        System.out.println("\nВведите число: ");
        int n3 = sc.nextInt();
        System.out.println(obj.is2Digits(n3)); //32; 512

        System.out.println("\nВведите a, b и число: ");
        int a = sc.nextInt(), b = sc.nextInt(), num = sc.nextInt();
        System.out.println(obj.isInRange(a, b, num)); //(5,1,3); (2,15,33)

        System.out.println("\nВведите три числа:");
        int x1 = sc.nextInt(), x2 =  sc.nextInt(), x3 = sc.nextInt();
        System.out.println(obj.isEqual(x1, x2, x3));//(3,3,3); (3,15,3)
    }
}



