
import java.io.*;
import java.util.HashMap;


public class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        Integer N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();


        for (int i = 1; i <= N; i++) {
            String entry = br.readLine();
            map1.put(i, entry);
            map2.put(entry, i);

        }

        for (int i = 0; i < M; i++) {
            String target = br.readLine();
            try {
                Integer K = Integer.parseInt(target);
                System.out.println(map1.get(K));
            } catch (NumberFormatException e) {
                System.out.println(map2.get(target));
            }
        }
        br.close();
    }


}