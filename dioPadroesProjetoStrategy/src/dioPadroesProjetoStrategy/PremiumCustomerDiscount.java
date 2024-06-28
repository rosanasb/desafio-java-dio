package dioPadroesProjetoStrategy;


public class PremiumCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.80; // 20% de desconto
    }
}
