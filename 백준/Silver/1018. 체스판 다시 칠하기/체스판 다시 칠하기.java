import java.io.*;
public class Main {
    public static boolean [][] board;
    public static int min = 64;
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in [0]);
        int M = Integer.parseInt(in [1]);
        
        board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                if (s.charAt(j)=='W'){
                    board[i][j] = true;
                }
                else{
                    board[i][j] = false;
                }
            }
        }

        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                findMin(i,j);
            }
        }
        bw.write(Integer.toString(min));
        
        bw.flush();
        bw.close();
        br.close();
    }

    public static void findMin(int x,int y){

        int count =0;
        boolean checkColor = true;

        for (int i = x; i < x+8; i++) {
            for (int j = y; j < y+8; j++) {
                if(board[i][j] != checkColor){
                    count++;
                }
                checkColor = !checkColor;
            }
            checkColor = !checkColor;
        }

        count = Math.min(count,64-count);
        min = Math.min(count,min);

    }
}