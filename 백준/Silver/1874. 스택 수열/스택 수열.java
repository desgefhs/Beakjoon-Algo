import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args)throws IOException {

        Stack<Integer> st = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();
        int n = Integer.parseInt(br.readLine());


        boolean check = true;


        int save = 1;

        while (n-- >  0){
            int a = Integer.parseInt(br.readLine());
            if(a < save){
                if(st.pop() != a){
                    check = false;
                    break;
                }
                stringBuilder.append("-\n");
                continue;
            }//n까지 찍고 내림

            for (int i = save; i <= a; i++) {
                st.push(i);
                stringBuilder.append("+\n");
            }
            st.pop();
            stringBuilder.append("-\n");
            save = ++a; // n까지
        }
        if(check){
            bw.write(stringBuilder.toString());
        }else {
            bw.write("NO");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}