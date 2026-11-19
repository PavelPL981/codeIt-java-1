package lesson_07;

import java.util.Scanner;

public class Main07 {

    static void main() {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println(i + " - Hello!");
        }

        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Good Day!");
            System.out.println("Continue? (1 / 0");
            int input = new Scanner(System.in).nextInt();
            if (input == 0) {
                isContinue = false;
            }
        }

        do {
            System.out.println("Welcome in Do-While-Cycle!");
        } while(isContinue);
    }
}
