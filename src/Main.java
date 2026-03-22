import java.util.Scanner;

public class Main {
    static void task1(int n) {
        if (n == 0) return;
        task1(n / 10);
        System.out.println(n % 10);
    }

    static double task2(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n-1] + task2(arr, n-1);
    }

    static boolean task3(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return task3(n, i + 1);
    }

    static int task4(int n) {
        if (n <= 1) return 1;
        return n * task4(n - 1);
    }

    static int task5(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return task5(n-1) + task5(n-2);
    }

    static int task6(int a, int n) {
        if (n == 0) return 1;
        return a * task6(a, n-1);
    }

    static void task7(int[] arr, int n) {
        if (n == 0) return;
        System.out.print(arr[n-1] + " ");
        task7(arr, n-1);
    }

    static boolean task8(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return task8(s, i + 1);
    }

    static int task9(String s) {
        if (s.equals("")) return 0;
        return 1 + task9(s.substring(1));
    }

    static int task10(int a, int b) {
        if (b == 0) return a;
        return task10(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Task10
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(task10(a,b));

        /*Task9
        String s = sc.next();
        System.out.println(task9(s));
        */
        /*Task8
        String s = sc.next();
        System.out.println(task8(s,0) ? "Yes" : "No");
        */
        /*Task7
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        task7(arr,n);
        */
        /*Task6
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(task6(a,n));
        */
        /*Task5
        int n = sc.nextInt();
        System.out.println(task5(n));
        */
        /*Task4
        int n = sc.nextInt();
        System.out.println(task4(n));
        */
        /*Task3
        int n = sc.nextInt();
        System.out.println(task3(n,2) ? "Prime": "Composite");
        */
        /*Task2
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
                System.out.println(task2(arr,n)/n);
                */
        /*Task1
        int n = sc.nextInt();
        task1(n);
        */
    }
}