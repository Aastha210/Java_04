package Unit3;

import java.util.*;

public class LinkedHashSet1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashSet<String> s = new LinkedHashSet<>();
        for(int i=0; i<n; i++) {
            s.add(sc.next());
            System.out.println(s.size());
        }
    }
}
