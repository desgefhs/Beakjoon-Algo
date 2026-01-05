import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int n[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            String [] intput = br.readLine().split(" ");
            n[i][0] = Integer.parseInt(intput[0]);
            n[i][1] = Integer.parseInt(intput[1]);

        }
        Arrays.sort(n,((o1, o2) -> {
            if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        }));
        
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st.append(n[i][0]).append(" ").append(n[i][1]).append("\n");

        }
        bw.write(st.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}