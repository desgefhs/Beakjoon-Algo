import java.io.*;
import java.util.*;


class Main {
    static boolean[][] check;
    static int[][] arr;
    static int[] moveX = {0, 0, 1, -1};
    static int[] moveY = {1, -1, 0, 0};
    static int startX = 0,startY = 0;
    static int N, M;

    public static void  main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        check = new boolean[N][M];

        for(int i = 0 ; i < N ; i++) {
            String row = br.readLine();
            st = new StringTokenizer(row);
            for(int j = 0 ; j < M ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 2) {
                    startX = i;
                    startY=j;
                }
            }

        }
        arr[startX][startY] = 0;
        check[startX][startY] = true;
        bfs(startX, startY);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                bw.write(arr[i][j]+ " ");
            }
            bw.newLine();
        }
        bw.close();
    }
    public static void bfs(int x, int y){
        Queue<spot> q = new LinkedList<>();
        q.add(new spot(x,y));

        while(!q.isEmpty()) {
            spot s = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = s.x + moveX[i];
                int nextY = s.y + moveY[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }
                if (check[nextX][nextY] || arr[nextX][nextY] == 0) {
                    continue;
                }
                q.add(new spot(nextX, nextY));
                arr[nextX][nextY] = arr[s.x][s.y] + 1;
                check[nextX][nextY] = true;
            }

        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] != 0 && !check[i][j]) {
                    arr[i][j] = -1;
                }
            }
        }
    }
}

class spot {
    int x;
    int y;

    public spot(int x, int y) {
        this.x = x;
        this.y = y;
    }

}