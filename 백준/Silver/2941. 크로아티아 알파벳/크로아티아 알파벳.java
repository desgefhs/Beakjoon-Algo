import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String a = sc.next();
        int count = 0;
        for (String s : alpha) {
            a = a.replaceAll(s, "0");

        }


        System.out.println(a.length());

        sc.close();
    }
}