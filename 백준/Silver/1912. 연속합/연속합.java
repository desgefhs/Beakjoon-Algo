import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int n = Integer.parseInt(x);

        String[] y = sc.nextLine().split(" ");
        int[] su = new int[n];

        for (int i = 0; i < n ; i++) {
            su[i] = Integer.parseInt(y[i]);
        }
        int max = su[0];
        int yeMax1 = su[0];
        int yeMax2 = su[0];
        for (int i = 1; i <n ; i++) {
            yeMax2 = Math.max(yeMax1+su[i],su[i]);
            max = Math.max(max,yeMax2);
            yeMax1 = yeMax2;
        }

        System.out.println(max);

    }
}