import  java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
//        String st = br.readLine();
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int num = Integer.parseInt(N);
        int [] numArr = new int [N.length()];

        for (int i = 0; i < N.length(); i++) {
            numArr[i] = num%10;
            num = num/10;
        }
        Arrays.sort(numArr);
        for (int i = numArr.length-1; i >= 0; i--) System.out.print(numArr[i]);
        sc.close();
    }
}