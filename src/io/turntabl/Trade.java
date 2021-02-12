package io.turntabl;

public abstract class Trade implements MontrealTradedProducts{
    trade
    private Product product;
    private int quantity;

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        try {
            product = new Product("MockID Here");
        }
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
