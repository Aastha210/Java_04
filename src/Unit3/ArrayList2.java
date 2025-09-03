package Unit3;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            products.add(sc.next());
        }
        System.out.println(products);
        Collections.sort(products);
        System.out.println(products);
        System.out.println(products.get(3));
    }
}