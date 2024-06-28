package dioPadroesProjetoStrategy;


public class RegularCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.90; 
    }
}

