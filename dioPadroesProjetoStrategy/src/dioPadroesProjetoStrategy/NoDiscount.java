package dioPadroesProjetoStrategy;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price; // Sem desconto
    }
}

