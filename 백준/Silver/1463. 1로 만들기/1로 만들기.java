import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    static int [] arr;
    static int n;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.valueOf(br.readLine());
        arr = new int[1000001];
        queue = new LinkedList<>();

        bfs(n);

    }
    static void bfs(int start) {

        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == 1) {
                System.out.println(arr[current]);
                return;
            }

            for (int i = 3; i > 0; i--) {
                int next = 0;

                if (i == 1) next = current - 1;
                else if (current % i == 0) {
                    next = current / i;
                }

                if (next >= 1 && next < arr.length && arr[next] == 0) {
                    arr[next] = arr[current] + 1;
                    queue.offer(next);
                }
            }
        }
    }

}

