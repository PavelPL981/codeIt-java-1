package lesson_06;

import java.util.Scanner;

public class VendingApparat {

    static void main() {
        int twixPrice = 77;
        int marsPrice = 78;
        int snickersPrice = 100;
        int bonAquaPrice = 50;

        boolean isCanBye = false;

        System.out.println("Введите количество денег: ");
        int moneyAmount = new Scanner(System.in).nextInt();

        if (moneyAmount >= twixPrice) {
            System.out.println("Twix");
            isCanBye = true;
        }
        if (moneyAmount >= marsPrice) {
            System.out.println("Mars");
            isCanBye = true;
        }
        if (moneyAmount >= snickersPrice) {
            System.out.println("Snickers");
            isCanBye = true;
        }
        if (moneyAmount >= bonAquaPrice) {
            System.out.println("Bon Aqua");
            isCanBye = true;
        }

        if (!isCanBye) {
            System.out.println("No money");
        }
    }
}
