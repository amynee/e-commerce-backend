package com.coding.ecommerce.dto;

import com.coding.ecommerce.entity.Address;
import com.coding.ecommerce.entity.Customer;
import com.coding.ecommerce.entity.Order;
import com.coding.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
