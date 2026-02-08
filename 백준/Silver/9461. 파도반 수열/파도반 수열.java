import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T--> 0) {

            int n = Integer.parseInt(br.readLine());
            long[] dp = new long[n + 1];

            if (n == 1 || n == 2 || n == 3) {
                sb.append(1).append("\n");
            }

            else if (n == 4 || n == 5) {
                sb.append(2).append("\n");
            } else {
                dp[1] = dp[2] = dp [3] = 1;
                dp [4] = dp [5] = 2;
                for (int i = 6; i <= n; i++) {
                    dp[i] = dp[i - 1] + dp[i - 5];
                }
                sb.append(dp[n]).append("\n");
            }
        }
        System.out.println(sb);

    }


}

