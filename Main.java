import java.util.Scanner;
public class Main {

    // Задача 1: дробная часть числ
    public double fraction(double x) {
        return x - Math.floor(x); // x = 5,25
    }

    // Зача 2: символ → цифра
    public int charToNum(char x) {
        return x - 48; // x = '3'
        }

    // Задача 3: двухзначное ли число
    public boolean is2Digits(int x) {
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    } // x = 516, x = 32

    // Задача 4: входит ли число в диапазон
    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    } // a=5 b=1 num=3; a=2 b=15 num=33

    // Задача 5: равны ли три числа
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c; // a=3 b=3 с=3; a=2 b=15 с=2
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main obj = new Main();


        System.out.println("Задача 1:");

        double number = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println("Введите число: "); //5,25; -5,25
                number = sc.nextDouble();
                valid = true;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число. Попробуйте еще раз.");
                sc.nextLine();
            }
        }
        System.out.println(obj.fraction(number));

        System.out.println("\nЗадача 2: символ → цифра");
        System.out.print("Введите символ (0-9): ");
        char c = sc.next().charAt(0);
        System.out.println("Цифра: " + obj.charToNum(c));

        System.out.println("\nЗадача 3: проверка двухзначного числа");
        System.out.print("Введите число: ");
        int n3 = sc.nextInt();
        System.out.println("Двухзначное? " + obj.is2Digits(n3));

        System.out.println("\nЗадача 4: входит ли число в диапазон");
        System.out.print("Введите a, b и проверяемое число через пробел: ");
        int a = sc.nextInt(), b = sc.nextInt(), num = sc.nextInt();
        System.out.println("Входит в диапазон? " + obj.isInRange(a, b, num));//(5,1,3); (2,15,33)

        System.out.println("\nЗадача 5: равны ли три числа");
        System.out.print("Введите три числа через пробел: ");
        int x1 = sc.nextInt(), x2 = sc.nextInt(), x3 = sc.nextInt();
        System.out.println("Все числа равны? " + obj.isEqual(x1, x2, x3));//(3,3,3); (3,15,3)
    }
}




