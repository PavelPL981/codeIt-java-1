package lesson_04;

import java.util.Scanner;

public class CalculatorMultiply {

    static void main() {
        System.out.println("\t\t***Добро пожаловать в калькулятор умножения\n\n");

        System.out.println("Введите первое целое число:");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Введите второе целое число:");
        int b = new Scanner(System.in).nextInt();

        System.out.println(a + " * " + b + " = " + (a * b));
    }
}
