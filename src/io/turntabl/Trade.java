package io.turntabl;

import java.util.HashMap;

public abstract class Trade implements MontrealTradedProducts{

    Map<Product,Integer> productList = new HashMap<Product,Integer>();

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if(productList.containsKey(product)){
            throw new ProductAlreadyRegisteredException("Oops, Product already exist");
        }
        productList.put(product,0);
    }

    @Override
    public void trade(Product product, int quantity) {

    }

    @Override
    public int totalTradeQuantityForDay() {
        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }
}
