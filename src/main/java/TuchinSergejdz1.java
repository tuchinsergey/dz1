
public class homework1 {
    static double task3(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }
    static boolean task4(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;     }
    static boolean task6(int a)
    { if(a<0) return true;
    else return false;
    }
    static void task7(String name)
    { System.out.println("Привет"+name);
    }
    public static void main(String[] args) {
        System.out.println(task3(2 ,3,0,7));
        System.out.println(task4(2,7));
        System.out.println(task6(-5));
        task7(  " Сергей");
    }
}




