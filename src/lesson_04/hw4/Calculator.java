package lesson_04.hw4;

import java.util.Scanner;

public class Calculator {

    static void main() {
        System.out.println("Введите первое число:");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("Введите второе число:");
        double b = new Scanner(System.in).nextDouble();

        System.out.println("Сумма = " + summa(a, b));
        System.out.println("Разность = " + difference(a, b));
        System.out.println("Произведение = " + multiply(a, b));
        System.out.println("Частное = " + divide(a, b));
    }

    public static double summa(double a, double b) {
        return a + b;
    }

    public static double difference(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
