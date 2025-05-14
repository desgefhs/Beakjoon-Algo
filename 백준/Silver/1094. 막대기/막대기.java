import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int count = 0, sum = 0;

        int[] a = {64, 32, 16, 8, 4, 2, 1};

        for (int i : a) {
            if (i <= X) {
                sum += i;
                count++;
            }
            if (sum > X) {
                sum -= i;
                count--;
            }
            if(sum == X) break;
        }
        System.out.println(count);

    }
}
