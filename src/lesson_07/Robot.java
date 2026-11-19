package lesson_07;

import java.util.Scanner;

public class Robot {

    static void main() {
        boolean isContinue = true;
        int x = 0;
        int y = 0;

        while (isContinue) {
            System.out.println("Выберите, куда двигаться роботу: \n1 - вверх, \n2 - вниз, \n3 - влево, \n4 - вправо");
            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1 -> y++;
                case 2 -> y--;
                case 3 -> x--;
                case 4 -> x++;
                default -> isContinue = false;
            }

            if (!isContinue) {
                System.out.println("Error. Движение робота невозможно");
            }
            System.out.println("Текущие координаты робота (x , y): " + x + ", " + y);
        }
    }
}
