import java.io.*;

import java.util.*;


public class Main {


    static boolean [] dfsvisited;
    static boolean [] bfsvisited;
    static ArrayList<Integer>[] graph;
    static Queue<Integer> queue = new LinkedList<>();
    static StringBuilder sb1 = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();

    public static void bfs(int nodeIndex) {
        queue.offer(nodeIndex);
        while (!queue.isEmpty()) {
            int now = queue.poll();
            if (!bfsvisited[now]) {
                sb2.append(now + " ");
            }
            bfsvisited[now] = true;

            for (int i : graph[now]) {
                if (!bfsvisited[i]) {
                    queue.offer(i);
                }
            }

        }
    }

    public static void dfs(int nodeIndex) {
        if(dfsvisited[nodeIndex]) return;
        dfsvisited[nodeIndex] = true;

        sb1.append(nodeIndex + " ");

        for (int n : graph[nodeIndex]) {
            if (!dfsvisited[n]) dfs(n);
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String [] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int V = Integer.parseInt(s[2]);

        dfsvisited = new boolean[N + 1];
        bfsvisited = new boolean[N + 1];
        graph = new  ArrayList[N+1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        dfs(V);
        bfs(V);
        System.out.println(sb1);
        System.out.println(sb2);

    }


}

