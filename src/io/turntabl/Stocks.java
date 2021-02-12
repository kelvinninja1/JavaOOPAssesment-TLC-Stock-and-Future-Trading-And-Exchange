package io.turntabl;

public class Stocks extends Product {
    Stocks(Product product) {
        super(product);
    }

    @Override
    public double price(String exchange, String ticker) {
        return super.price(exchange, ticker);
    }
}
