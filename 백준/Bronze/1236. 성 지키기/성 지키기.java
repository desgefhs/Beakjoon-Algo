import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] state = new char[N][M];

        boolean[] a = new boolean[N];
        boolean[] b = new boolean[M];

        for (int i = 0; i < N; i++) {
            state[i] = sc.next().toCharArray();
            for (int j = 0; j < M; j++) {
                if (state[i][j] == 'X') {
                    a[i] = true;
                    b[j] = true;
                }
            }
        }
        
        
        int cunta = 0, cuntb = 0;
        for (boolean i : a) if (!i) cunta++;
        for (boolean j : b) if (!j) cuntb++;
        
        System.out.println(cunta > cuntb ? cunta:cuntb);

        sc.close();
    }
}