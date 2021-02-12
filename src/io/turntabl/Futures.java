package io.turntabl;

public class Futures extends Product {
    Futures(Product product) {
        super(product);
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return super.price(exchange, contractCode, month, year);
    }
}
