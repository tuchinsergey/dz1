package HomeWork4;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class HomeWork4 {
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static int SIZE = 3;
    public static final char [][] MAP = new char[SIZE][SIZE];
    private static void initMap () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DefaultTableCellRenderer;
            }
        }
}
private static void printMap() {
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            System.out.println( MAP[i][j]+"");
        }
        System.out.println();
    }
}

    private  static void game(Scanner in) {
        initMap ();
        System.out.println("Игра крестики и нолики");
        System.out.println("Для хода необходимо выбрать номер строки и номер столбца");
        int stepCounter 0;
        while (true) {
            System.out.println("Ваш ход");
            String line = in.nextLine();
            String [] args = line.split("");
            if (args.length !=2);{
                System.out.println("Введите два числа"); }
                else{ try {
                    int x = Integer.parseInt(args[0]);
                    int y = Integer.parseInt(args[1]);
                    x--;
                    y--;
                    if ()
            }

            }


        }
    }

    }