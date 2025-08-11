package com.devsuperior.ex1;

import com.devsuperior.ex1.model.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.devsuperior.ex1.service.OrderService;

@SpringBootApplication
public class Ex1Application implements CommandLineRunner {

	private OrderService orderService;

	public Ex1Application(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Ex1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order();
		order.setCode(1034);
		order.setBasic(150.0);
		order.setDiscount(20.0);

		System.out.printf("Pedido código %d%n", order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));

	}
}
