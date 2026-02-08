import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static Integer[][] dp;
    static int[][] arr;
    static int N;

    static int find(int m, int n) {
        if (m == N - 1) {
            return dp[m][n];
        }

        if (dp[m][n] == null) {
            dp[m][n] = Math.max(find(m + 1, n), find(m + 1, n + 1)) + arr[m][n];
        }

        return dp[m][n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        dp = new Integer[N+1][N+1];
        arr = new int[N+1][N+1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            dp[N - 1][i] = arr[N - 1][i];
        }

        System.out.println(find(0,0));


    }


}

