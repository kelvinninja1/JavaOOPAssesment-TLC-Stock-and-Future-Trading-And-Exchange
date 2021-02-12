package io.turntabl;

public class Futures extends Product {
    public Futures(String productId, double currentPrice, String exchange) {
        super(productId, currentPrice, exchange);
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return super.price(exchange, contractCode, month, year);
    }
}
