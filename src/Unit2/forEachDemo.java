package Unit2;

import java.util.ArrayList;
import java.util.List;

public class forEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("B");
        list.forEach(System.out::println);
    }
}
