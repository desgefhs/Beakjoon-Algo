import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        long K = Integer.parseInt(s[1]);

        int digit = 1;
        long count = 9;

        while (K > digit * count) {
            K -= digit * count;
            digit++;
            count *= 10;
        }

        long num = (long) Math.pow(10,digit -1)+ (K-1)/digit;
        if (num > N) {
            System.out.println(-1);
            return;
        }


        System.out.println(String.valueOf(num).charAt((int)(K-1)%digit));
    }

}