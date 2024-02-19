package com.coding.ecommerce.service;

import com.coding.ecommerce.dto.Purchase;
import com.coding.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
