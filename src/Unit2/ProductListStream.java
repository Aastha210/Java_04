package Unit2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductListStream {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"HP1",20000));
        productList.add(new Product(2,"HP2",21000));
        productList.add(new Product(3,"HP3",24000));
        productList.add(new Product(4,"HP4",27000));
        productList.add(new Product(5,"HP5",29000));
        productList.add(new Product(6,"HP6",28000));
        productList.add(new Product(7,"HP7",23000));
        productList.add(new Product(8,"HP8",24500));
        productList.add(new Product(9,"HP9",22700));
//        List<Double> productListPrice = productList.stream().
//                filter(p -> p.price>24000).
//                map(p -> p.price).
//                collect(Collectors.toList());
//        System.out.println(productListPrice);
//        productList.stream().
//                filter(p -> p.price == 27000).
//                forEach(p -> System.out.println(p.name));
        long count = productList.stream().filter(p -> p.price < 27000).count();
        System.out.println(count);
    }
}
