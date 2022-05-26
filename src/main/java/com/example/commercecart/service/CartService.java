package com.example.commercecart.service;

import com.example.commercecart.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface CartService {

    List<Product> getItemsInCart();
    void removeItem(int id);
    Product addItemToCart(Product product);

}
