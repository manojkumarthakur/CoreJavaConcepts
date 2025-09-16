package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToMap {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        Map<Integer, String> map = productsList.stream()
                .filter(product->product.price < 30000)   // filter product on the base of price
                .collect(Collectors.toMap(p->p.id, p->p.name));// collect it as Set(remove duplicate elements)
        System.out.println(map);
    }
}
