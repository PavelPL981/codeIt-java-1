package lesson_04;

import java.util.Scanner;

public class Lesson4Main {

    static void main() {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(max);
        System.out.println(max + 1);

        System.out.println("Введите вес (кг):");
        double weight = new Scanner(System.in).nextDouble();
        System.out.println("Введите рост (м):");
        double height = new Scanner(System.in).nextDouble();

        System.out.println("BMI = " + weight / (height * height));
    }
}
