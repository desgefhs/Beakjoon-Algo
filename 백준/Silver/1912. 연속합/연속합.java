import java.io.*;
import java.util.*;
public class Main {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt((br.readLine()));
        int[] arr = new int[N + 1];
        String a = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(a);
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = arr[1];
        int recodeMax = arr[1];
        for (int i = 2; i <= N; i++) {
            recodeMax = Math.max(arr[i], recodeMax + arr[i]);
            max = Math.max(max, recodeMax);
        }
        bw.write(max+"");
        bw.close();
    }
}