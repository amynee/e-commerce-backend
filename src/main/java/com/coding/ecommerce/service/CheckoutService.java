package com.coding.ecommerce.service;

import com.coding.ecommerce.dto.PaymentInfo;
import com.coding.ecommerce.dto.Purchase;
import com.coding.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
