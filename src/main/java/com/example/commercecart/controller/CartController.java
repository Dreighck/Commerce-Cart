package com.example.commercecart.controller;

import com.example.commercecart.model.Product;
import com.example.commercecart.service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CartController {

    final CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping(value="/cart")
    public ResponseEntity<List<Product>> getAllItems(){
        List<Product> items = cartService.getItemsInCart();
        ResponseEntity<List<Product>> responseEntity;
        responseEntity=new ResponseEntity<>(items, HttpStatus.OK);
        return responseEntity;
    }

}
