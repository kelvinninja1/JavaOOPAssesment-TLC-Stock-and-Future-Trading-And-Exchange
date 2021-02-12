package io.turntabl;

public class Stocks extends Product {
    public Stocks(String productId, double currentPrice, String exchange) {
        super(productId, currentPrice, exchange);
    }

    @Override
    public double price(String exchange, String ticker) {
        return super.price(exchange, ticker);
    }
}
