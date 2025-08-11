package com.devsuperior.ex1.service;

import com.devsuperior.ex1.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {

        double valorSemDesconto = order.getBasic();
        double valorComDesconto = valorSemDesconto - (order.getDiscount()/100 * valorSemDesconto);
        double frete = shippingService.shipment(order);

        return valorComDesconto + frete;

    }

}
