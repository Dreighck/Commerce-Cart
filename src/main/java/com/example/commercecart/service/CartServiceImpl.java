package com.example.commercecart.service;

import com.example.commercecart.model.Product;
import com.example.commercecart.repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    final
    CartRepo cartRepo;

    public CartServiceImpl(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }

    @Override
    public List<Product> getItemsInCart() {
      return cartRepo.findAll();
    }

    @Override
    public void removeItem(int id) {
        cartRepo.deleteById(id);
    }

    @Override
    public Product addItemToCart(Product product) {
        return cartRepo.save(product);
    }
}
