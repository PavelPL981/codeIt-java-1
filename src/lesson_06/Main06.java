package lesson_06;

import java.util.Scanner;

public class Main06 {

    static void main() {
        int number1 = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();
        if (number1 > 5 && number2 < 10) {
            System.out.println("Hello!");
        }
        if (number1 < 5 || number2 < 10) {
            System.out.println("Bye!");
        }
    }
}
