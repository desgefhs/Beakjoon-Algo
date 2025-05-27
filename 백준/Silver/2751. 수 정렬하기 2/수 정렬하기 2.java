import java.io.*;
import java.util.*;


public class Main {

    public static void merge(int[] a1, int[] a2, int[] a) {
        int i = 0, j = 0;
        while (i + j < a.length) {
            if (j == a2.length || (i < a1.length && a1[i] < a2[j])) {
                a[i + j] = a1[i];
                i++;
            }
            else {
                a[i + j] = a2[j];
                j++;
            }
        }
    }
    public static void merge_sort(int [] a) {
        int n = a.length;
        if (n < 2) return;
        int mid = n / 2;
        int[] a1 = Arrays.copyOfRange(a, 0, mid);
        int[] a2 = Arrays.copyOfRange(a, mid, n);

        merge_sort(a1);
        merge_sort(a2);

        merge(a1, a2, a);
    }
    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt((br.readLine()));

        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            arr[i] = Integer.parseInt(a);
        }

        merge_sort(arr);

        for (int i : arr) {
            bw.write(i+"");
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
