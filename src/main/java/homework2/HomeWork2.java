package homework2;

public class HomeWork2 {
    static void task1 (int[] a) {
        for (int i = 0; i<a.length; i++) {
            a[i] = (a[i] + 1)% 2;
        }
    }
    static void task2(int n) {
        int [] a = new  int[n];
        for (int i = 1; i < n ; i++)
        a[i] = a[i-1]+3;
    }
    static void task3(int[] a) {
        for (int i =0; i< a.length; i++){
            if (a[i]<6) {
                a[i]*=2;
            }
        }
    }
    static void task4 (int n) {
        int [] [] m= new int[n][n];
        for (int i=0; i < n; i++) {
            m [i] [i] = 1;
            m[i][n-i-1]=1;
        }
    }
}
