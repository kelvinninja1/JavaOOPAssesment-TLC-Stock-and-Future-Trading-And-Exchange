package io.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Product implements ProductPricingService {
    public List<Product> productList = new ArrayList<>();

    @Override
    public double price(String exchange, String ticker) {
        return 0;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return 0;
    }

    Product (Product product){
        Product result = productList.stream()
                .filter(x -> product.equals(x))
                .findAny()
                .orElse(null);
        if (!result.equals(null)) {
            this.productList.add(student);
            return True;
        } else {
            return False;
        }
    }
}
