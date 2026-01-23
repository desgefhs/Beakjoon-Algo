
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

import java.util.StringTokenizer;

class Person {
    String name;
    int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }
}

public class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Person p[] = new Person[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            p[i] = new Person(age, name);
        }

        Arrays.sort(p, (o1, o2) -> o1.age - o2.age);

        for (Person a : p) {
            System.out.println(a);
        }
        br.close();
    }


}