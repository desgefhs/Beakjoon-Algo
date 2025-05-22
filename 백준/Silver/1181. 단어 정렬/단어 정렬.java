import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }
        String[] arr = set.toArray(new String[set.size()]);

        N = set.size();

        for (int i = 1; i < arr.length; i++) {
            String target = arr[i];
            int j = i - 1;
            while (j >= 0 && target.length() < arr[j].length()) {
                arr[j + 1] = arr[j];
                arr[j] = target;
                j--;
            }
        }

        int max = 0;

        for (int j = 1; j < N; j++) {
            if (arr[max].length() == arr[j].length()) {
                Arrays.sort(arr, max, j + 1);
            } else if (arr[max].length() < arr[j].length()) {
                max = j;
            }
        }

        for (String s : arr) {
            System.out.println(s);
        }
        sc.close();
    }
}