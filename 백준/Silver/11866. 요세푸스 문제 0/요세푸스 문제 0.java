import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args)throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 1; i < N+1; i++) {
                list.add(i);
            }

            int index = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("<");

            while (list.size() > 1) {
                index = (index + (K - 1)) % list.size();
                sb.append(list.remove(index)).append(", ");
            }

            sb.append(list.get(0)).append(">");
            System.out.println(sb);



            br.close();
    }


}