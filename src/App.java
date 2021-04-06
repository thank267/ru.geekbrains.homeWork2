import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String div = "--------------------\n";

        // Задание 1
        System.out.println("Задание 1");
        System.out.println(checkTwoNumber(3, 12));
        System.out.println(div);

        // Задание 2
        System.out.println("Задание 2");
        printPositiveInteger(-1);
        System.out.println(div);

        // Задание 3
        System.out.println("Задание 3");
        System.out.println(checkPositiveInteger(-1));
        System.out.println(div);

        // Задание 4
        System.out.println("Задание 4");
        stringRepeater("тра_", 10);
        System.out.println(div);

        // Задание 5
        System.out.println("Задание 5");
        System.out.println("Введите год для проверки его високосности. 0 или меньше для прекращения проверки");
        Scanner scaner = new Scanner(System.in);

        int test;

        do {
            test = scaner.nextInt();
            System.out.println(detectLeapYear(test));

        }

        while (test > 0);

        scaner.close();

    }

    public static boolean checkTwoNumber(int a, int b) {

        int sum = a + b;

        return sum > 10 && sum <= 20;

    }

    public static void printPositiveInteger(int a) {

        System.out.println(a >= 0 ? "Число положительное" : "Число отрицательное");

    }

    public static boolean checkPositiveInteger(int a) {

        return !(a >= 0);

    }

    public static void stringRepeater(String source, int repeat) {

        System.out.println(String.join("", Collections.nCopies(repeat, source)));

        /*
         * for Java 11:
         * 
         * System.out.println(source.repeat(repeat));
         * 
         */
    }

    public static boolean detectLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;

    }

}
