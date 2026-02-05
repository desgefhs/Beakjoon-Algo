import java.io.*;
import java.util.*;

public class Main {

    static int M,N,K;
    static boolean[][] graph;
    static boolean[][] check;
    static int[][] 임시 = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static int count;

    static void math() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (graph[i][j]&& !check[i][j]) {
                    count++;
                    dfs(i, j);
                }
            }

        }
    }

    static void dfs(int x, int y) {

        check[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int tmpx = x + 임시[i][0];
            int tmpy = y + 임시[i][1];
            if (tmpx >= 0 && tmpy >= 0 && tmpx < M && tmpy < N) {
                if (!check[tmpx][tmpy] && graph[tmpx][tmpy]) {
                    dfs(tmpx, tmpy);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            count = 0;
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            graph =new boolean[M][N];
            check = new boolean[M][N];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = true;
                
            }
            math();
            System.out.println(count);

            
        }



    }


}

