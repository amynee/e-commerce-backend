package com.coding.ecommerce.controller;

import com.coding.ecommerce.dto.Purchase;
import com.coding.ecommerce.dto.PurchaseResponse;
import com.coding.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

// @CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }
}
