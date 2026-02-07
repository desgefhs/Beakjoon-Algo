import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    static StringBuilder sb = new StringBuilder();
    static  boolean [] visited;
    static int [] arr;
    static int n;
    static Queue<Integer> queue;

    static void bfs(int start) {

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int i = 3; i > 0; i--) {
                int next = 0;
                if (i == 1) next = current - 1;
                else if (current % i == 0) {
                    next = current / i;
                }

                if (next == 1) {
                    System.out.println(arr[current] + 1);
                    return;
                }

                if (next > 1 && next < arr.length && arr[next] == 0) {
                    arr[next] = arr[current] + 1;
                    queue.offer(next);
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        n = Integer.valueOf(br.readLine());
        visited = new boolean[1000001];
        arr = new int[1000001];
        queue = new LinkedList<>();

        if (n == 1) {
            System.out.println("0");
            return;
        }

        bfs(n);

    }

}

