package Unit3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            products.add(sc.next());
        }
        Iterator itr = products.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        products.addLast("Lichi");
        products.addFirst("Apple");
        products.add(3,"Papaya");
        Collections.sort(products);
        System.out.println(products);
        System.out.println(products.getFirst());
        System.out.println(products.getLast());
    }
}
