package dio.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.loja.controller.ProductNotFoundException;
import dio.loja.model.CartItem;
import dio.loja.model.Product;
import dio.loja.model.ShoppingCart;
import dio.loja.repository.CartItemRepository;
import dio.loja.repository.ShoppingCartRepository;

@Service
public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    public ShoppingCart createShoppingCart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        return shoppingCartRepository.save(shoppingCart);
    }

    public ShoppingCart getShoppingCartById(Long id) {
        return shoppingCartRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Shopping cart not found with id: " + id));
    }

    public CartItem addProductToCart(ShoppingCart shoppingCart, Product product, int quantity) {
        CartItem cartItem = new CartItem();
        cartItem.setShoppingCart(shoppingCart);
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
        return cartItemRepository.save(cartItem);
    }

    public List<CartItem> getCartItems(ShoppingCart shoppingCart) {
        return shoppingCart.getItems();
    }
}
