import java.io.*;
import java.util.*;

public class Main {
    static Queue<Integer> queue;
    static int [] time;
    static int N;
    static int K;
    static int[] t = {-1, 1, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        queue = new LinkedList<Integer>();
        time = new int [100001];


        if (N == K) {
            System.out.println("0");
            return;
        }

        bfs(N);

    }

    public static void bfs(int start) {

        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next = current + t[i];
                if (i == 2) {
                    next = current * 2;
                }


                if (next == K) {
                    System.out.println(time[current] + 1);
                    return;
                }

                if (next >= 0 && next < time.length && time[next] == 0) {
                    queue.offer(next);
                    time[next] = time[current] + 1;
                }
            }

        }

    }

}

