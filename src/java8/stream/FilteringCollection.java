package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FilteringCollection {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List <Product> stream = productsList.stream()
                .filter(p -> p.price<30000f)
                .collect(Collectors.toList());

        //
        stream.forEach(p -> {
            System.out.println(p.name+ " " + p.price);
        });

        List<Float> prices = productsList.stream()
                .filter(p -> p.price < 30000)
                .map(p -> p.price)
                .collect(Collectors.toList());
        System.out.println(prices);;
    }
}
