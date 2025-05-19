import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] s = new String[N];
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            
            s[i] = sc.next();
            char a = s[i].charAt(0);
            
            for (int j = 1; j < s[i].length(); j++) {
                
                if (a != s[i].charAt(j)) {
                    s[i] = s[i].replace(a,'0');
                    a = s[i].charAt(j);
                }
                
                if (a =='0') {
                    count--;
                    break;
                }
                
            }
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}