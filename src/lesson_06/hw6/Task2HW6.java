package lesson_06.hw6;

import java.util.Scanner;

public class Task2HW6 {

    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = calcGreatestWeight(first, second, third);
        double average = calcAverageWeight(first, second, third);
        double smallest = calcSmallestWeight(first, second, third);

        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }

    public static double calcGreatestWeight(double a, double b, double c) {
        return Math.max(c, Math.max(a, b));
    }

    public static double calcAverageWeight(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static double calcSmallestWeight(double a, double b, double c) {
        return Math.min(c, Math.min(a, b));
    }
}
