import java.io.*;

public class Main {
    static int[] f;
    static int a = 0;
    static int b = 0;
    static int fib(int n) {
        if (n == 1 || n == 2) {
            a++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    static int fibonacci(int n) {
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i++) {
            b++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        f = new int[n + 1];
        fib(n);
        fibonacci(n);
        System.out.println(a + " " + b);
    }

}

