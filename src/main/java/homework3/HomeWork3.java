package homework3;

import java.util.Scanner;

public class HomeWork3 {

    private static int getRandomDigit() {
        return(int) (Math.random()*10);
    }

    private static void run(){
        Scanner in= new Scanner(System.in);
        int guess=getRandomDigit();
        for (int i=0; i<3;i++) {
            System.out.println("Введите число от 0 до 9");
            String digit = in.next();
            int value;
            try {
                value = Integer.parseInt (digit);
                if (value < 0 || value>9) {
                    System.out.println("Вы ввели число не от 0 до 9");
                    i--;
                    continue; }
            } catch (Exception e) {
                System.out.println("Вы ввели не число!");
                i--;
                continue;
            }
            if (value > guess) {
                System.out.println("Загаданное число меньше");
            } else if (value < guess) {
                System.out.println("Загаданное число больше");
            } else{
                System.out.println("Вы угадали, было загадано число: " + guess);
            }

            System.out.println("Вы проиграли");

            System.out.println("Повторить игру еще раз? 1- да/0- нет).");

        }
            while (true) {
                try {
                    int x = in.nextInt();
                    if (x == 1) {
                        run();
                    } else if (x == 0) {
                        System.out.println("Игра завершена");
                        return;
                    } else {
                        System.out.println("Введите 0 или 1");
                    }
                } catch (Exception e) {
                    System.out.println("Введите 0 или 1");
                }
            }
    }

            public static void main(String[] args) {
        System.out.println("Вы в игре угадай число"+"У вас есть 3 попытки");
        run();
    }
}
