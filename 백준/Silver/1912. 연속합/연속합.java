import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        int n = Integer.parseInt(N);

        String[] s = sc.nextLine().split(" ");
        int[] su = new int[n];

        for (int i = 0; i < n; i++) {
            su[i] = Integer.parseInt(s[i]);
        }

        int max = su[0];
        int recode = su[0];

        for (int i = 1; i < n; i++) {
            recode = Math.max(su[i], recode + su[i]);
            max = Math.max(max, recode);
        }

        System.out.println(max);

        sc.close();
    }
}