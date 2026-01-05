import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = N%5;
        if (N == 4 || N == 7){
            System.out.println("-1");
        }
        else if (n == 0){
            System.out.println(N/5);
        }
        else if (n == 1 || n == 3) {
            System.out.println(N/5 + 1);
        }
        else if (n == 2 || n == 4) {
            System.out.println(N/5 + 2);
        }
    }
}