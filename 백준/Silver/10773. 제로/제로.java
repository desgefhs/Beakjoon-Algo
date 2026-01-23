import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < K; i++) {
            int s = Integer.parseInt(br.readLine());
            if (s == 0) {
                st.pop();
            } else {
                st.push(s);
            }
        }

        int sum = 0;
        for (int i = 0; i < K; i++) {
            if (st.empty()) {
                break;
            }
            sum += st.pop();
        }

        bw.write(Integer.toString(sum));

        bw.flush();
        bw.close();
        br.close();
    }


}