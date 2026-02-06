import java.io.*;
import java.util.StringTokenizer;


public class Main {
    static StringBuilder sb = new StringBuilder();
    static  boolean [] visited;
    static int [] arr;
    static int n;
    static int m;

    static void dfs(int start) {
        if (start == m) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[start] = i+1;
                dfs(start + 1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        n = Integer.valueOf(st.nextToken());
        m = Integer.valueOf(st.nextToken());
        arr = new int[m];
        visited = new boolean[n];

        dfs(0);
        System.out.println(sb);
    }

}

