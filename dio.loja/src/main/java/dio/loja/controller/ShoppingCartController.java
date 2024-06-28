package dio.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dio.loja.model.CartItem;
import dio.loja.model.Product;
import dio.loja.model.ShoppingCart;
import dio.loja.service.ShoppingCartService;
import dio.loja.service.ProductService;

@RestController
@RequestMapping("/api/shopping-carts")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;
    
    @Autowired
    private ProductService productService;

    @PostMapping
    public ShoppingCart createShoppingCart() {
        return shoppingCartService.createShoppingCart();
    }

    @GetMapping("/{id}")
    public ShoppingCart getShoppingCartById(@PathVariable Long id) {
        return shoppingCartService.getShoppingCartById(id);
    }

    @PostMapping("/{cartId}/items")
    public CartItem addProductToCart(@PathVariable Long cartId,
                                     @RequestParam Long productId,
                                     @RequestParam int quantity) {
        ShoppingCart shoppingCart = shoppingCartService.getShoppingCartById(cartId);
        Product product = productService.getProductById(productId);
        return shoppingCartService.addProductToCart(shoppingCart, product, quantity);
    }

    @GetMapping("/{cartId}/items")
    public List<CartItem> getCartItems(@PathVariable Long cartId) {
        ShoppingCart shoppingCart = shoppingCartService.getShoppingCartById(cartId);
        return shoppingCartService.getCartItems(shoppingCart);
    }
}

