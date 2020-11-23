public class HomeWork {
    public static void main(String[] args) {
        // Объявление и инициализация переменных
        byte byteVar = 12;
        short shortVar = 67;
        int integerVar = 123;
        long longVar = 100L;
        char symbol = 'F';
        String str = "Just simple string";

        //Методы

        System.out.println("1) " + Calculate(byteVar, shortVar, integerVar, 7));
        System.out.println("2) " + CompareRange(10, 5));
        System.out.print("3) ");
        PosOrNeg(-6);
        System.out.println("4) " + isNegative(90));
        System.out.print("5) ");
        Greetings("Geekbrains");
        System.out.print("6) ");
        isLeapYear(2020);
    }

    private static double Calculate(int a, int b, int c, int d) {
        if(d == 0) {
            System.out.println("\"d\" не может равняться нулю!");
            System.exit(-1);
        }
        return a * (b + (c / d));
    }

    private static boolean CompareRange(int a, int b) {
        int res = a + b; //Можно обойтись без этой переменной, но так красивее))
        return res >= 10 && res <= 20;
    }

    private static void PosOrNeg(int a) {
        if(a >= 0)
            System.out.println("Переданное число положительное");
        else
            System.out.println("Переданное число отрицательное");
    }

    private static boolean isNegative(int a) {
        return a < 0;
    }

    private static void Greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

    private static void isLeapYear(int year) {
        if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
            System.out.println("Год " + year + " является високосным");
        else
            System.out.println("Год " + year + " не является високосным");
    }

}
