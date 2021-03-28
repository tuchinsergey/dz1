package HomeWork4;
import java.util.concurrent.ConcurrentMap;
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
                }
                while (true) {
                    humanTurn();
                    printMap();
                    if (checkWin(DOT_X)) {
                        System.out.println("Победил человек");
                        break;
                    }
                    if (isMapFull()) {
                        System.out.println("Ничья");
                        break;
                    }
                    aiTurn();
                    printMap();
                    if (checkWin(DOT_O)) {
                        System.out.println("Победил Искуственный Интеллект");
                        break;
                    }
                    if (isMapFull()) {
                        System.out.println("Ничья");
                        break;
                    }
                }
                System.out.println("Игра закончена");
            }
            public static boolean isMapFull() {
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (map[i][j] == DOT_EMPTY) return false;
                    }
                }
                return true;
            }
            public static void aiTurn() {
                int x, y;
                do {
                    x = rand.nextInt(SIZE);
                    y = rand.nextInt(SIZE);
                } while (!isCellValid(x, y));
                System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                map[y][x] = DOT_O;
            }
            public static void humanTurn() {
                int x, y;
                do {
                    System.out.println("Введите координаты в формате X Y");
                    x = sc.nextInt() - 1;
                    y = sc.nextInt() - 1;
                } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
                map[y][x] = DOT_X;
            }
            public static boolean isCellValid(int x, int y) {
                if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
                if (map[y][x] == DOT_EMPTY) return true;
                return false;
            }
            public static void initMap() {
                map = new char[SIZE][SIZE];
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }
            public static void printMap() {
                for (int i = 0; i <= SIZE; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                for (int i = 0; i < SIZE; i++) {
                    System.out.print((i + 1) + " ");
                    for (int j = 0; j < SIZE; j++) {
                        System.out.print(map[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }






