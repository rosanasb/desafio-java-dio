package dioPadroesProjetoStrategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new NoDiscount());

        double price = 100.0;

        System.out.println("Preço original: " + price);
        System.out.println("Sem desconto: " + cart.calculateTotal(price));

        cart.setDiscountStrategy(new RegularCustomerDiscount());
        System.out.println("Desconto para cliente regular: " + cart.calculateTotal(price));

        cart.setDiscountStrategy(new PremiumCustomerDiscount());
        System.out.println("Desconto para cliente premium: " + cart.calculateTotal(price));
    }
}

