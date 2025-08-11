package com.devsuperior.ex1.service;

import com.devsuperior.ex1.model.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        double valorBasico = order.getBasic();

        if (valorBasico < 100.0) {
            return 20.0;
        } else if (valorBasico >= 100.0 && valorBasico <= 200.0) {
            return 12.0;
        }

        return 0;
    }

}
